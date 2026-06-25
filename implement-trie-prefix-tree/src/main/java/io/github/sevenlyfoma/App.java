package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Trie t = new Trie();

        t.insert("apple");

        System.out.println(t.search("apple"));


        t.insert("application");
        t.insert("app");
        t.insert("brother");

        // t.printTree();
    }
}
