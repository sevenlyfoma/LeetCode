package io.github.sevenlyfoma;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord = "mouse";


        System.out.println(App.suggestedProducts(products, searchWord));

        // t.printTree();
    }

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie t = new Trie();

        for (String s: products){
            t.insert(s);
        }

        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < searchWord.length(); i++){
            res.add(t.getAllMatches(searchWord.substring(0, i+1)));
        }

        return res;
    }
}
