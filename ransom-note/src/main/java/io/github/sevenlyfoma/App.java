package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] lettersPresent= new int[26];

        for (int i = 0; i < magazine.length(); i++){
            int c = magazine.charAt(i);

            int pos = c - 97;

            lettersPresent[pos] = lettersPresent[pos] + 1;
        }

        boolean canDoIt = true;
        int j = 0;

        while (canDoIt && j < ransomNote.length()){
            int c = ransomNote.charAt(j);

            int pos = c - 97;

            if (lettersPresent[pos] == 0){
                canDoIt = false;
            }
            else {
                lettersPresent[pos] = lettersPresent[pos] - 1;
            }


            j++;
        }


        return canDoIt;
    }
}
