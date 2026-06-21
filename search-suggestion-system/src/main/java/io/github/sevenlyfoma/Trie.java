package io.github.sevenlyfoma;

import java.util.ArrayList;
import java.util.List;

public class Trie {

    //You probably make this better by only splitting at first deviations
    //So you add apple to the trie and it adds a single node apple instead of a-p-p-l-e
    //And then you later add "app" and it splits into app-le

    //Then for search you could have like a cooked queue search system where you search the first character of each
    //If you find a match, its gauranteed to be the only match at the first index by the on demand splitting solution
    //Therefore you can linear search just that one element
    
    //Seems like it would all be a massive optimisation

    public char content;
    public boolean valid;

    public ArrayList<Trie> children;
    

    public Trie() {
        content = 0;
        valid = false;
        children = new ArrayList<>();
    }

    public Trie(char content, boolean valid){
        this.content = content;
        this.valid = valid;
        children = new ArrayList<>();
    }

    public void printTree(){
        printTreeR(0);
    }

    public void printTreeR(int depth){
        for (int i = 0; i < depth; i++){
            System.out.print("  ");
        }
        System.out.print(content);
        if (content == 0){
            System.out.print("root");
        }
        if (valid){
            System.out.print("-v");
        }
        System.out.print("\n");

        for (Trie t: children){
            t.printTreeR(depth+1);
        }
        
    }
    
    public void insert(String word) {
        this.insertR(word, 0);
    }

    public void insertR(String word, int index){

        if (index == word.length()){
            this.valid = true;
            return;
        }
        
        Trie target = null;

        for (Trie child: children){
            if (child.content == word.charAt(index)){
                target = child;
            }
        }

        if (target == null){
            Trie t = new Trie(word.charAt(index), false);
            if (index == word.length()-1){
                t.valid = true;
            }
            children.add(t);
            t.insertR(word, index+1);
        }
        else{
            target.insertR(word, index+1);
        }
    }
    
    public boolean search(String word) {
        return searchR(word, 0, true);   
    }

    public boolean startsWith(String prefix) {
        return searchR(prefix, 0, false);
    }

    public boolean searchR(String word, int index, boolean mustBeValid) {
        Trie target = null;

        for (Trie child: children){
            if (child.content == word.charAt(index)){
                target = child;
            }
        }

        if (target != null){
            if (index == word.length() - 1){
                if (mustBeValid){
                    return target.valid;
                }
                else{
                    return true;
                } 
            }
            else{
                return target.searchR(word, index+1, mustBeValid);
            }
        }
        else {
            return false;
        }
        
    }

    public List<String> getAllMatches(String search){
        List<String> ans = new ArrayList<>();
        getAllMatchesR(search, 0, ans);
        return ans;
    }

    public void getAllMatchesR(String search, int index, List<String> ans){
        Trie target = null;

        if (index == search.length()){
            return;
        }

        for (Trie child: children){
            if (child.content == search.charAt(index)){
                target = child;
            }
        }

        if (target != null){
            if (index == search.length() - 1){
                addAllValid(search, index, ans);
            }
            else{
                target.getAllMatchesR(search, index+1, ans);
            }
        }
    }

    public void addAllValid(String search, int index, List<String> ans){
        if (valid && ans.size() < 3){
            ans.add(search.substring(0, index));
        }

        for (Trie c: children){
            c.addAllValid(search, index+1, ans);
        }

    }
}
