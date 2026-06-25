package io.github.sevenlyfoma;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Trie root = new Trie();

        root.insert("mobile"); 
        root.insert("mouse");

        root.insert("moneypot"); 
        root.insert("monitor");
        root.insert("mousepad"); 

        // root.printTree();

        // System.out.println(root.getThree());

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

        return t.getSuggestions(searchWord);
    }
}
