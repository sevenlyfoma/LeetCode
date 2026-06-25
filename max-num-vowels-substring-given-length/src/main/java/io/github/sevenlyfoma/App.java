package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(maxVowels("ramadan", 2));
    }
    
    public static int maxVowels(String s, int k) {
        
        //Use sliding window approach

        int maxNum = 0;
        int runningNum = 0;

        for (int i=0; i < s.length(); i++){
            char c = s.charAt(i);

            if (isVowel(c)){
                runningNum++;
            }

            if (i>=k){
                char ci = s.charAt(i-k);
                if (isVowel(ci)){
                    runningNum--;
                }
            }

            if (runningNum > maxNum){
                maxNum = runningNum;
            }
                
        }

        return maxNum;
    }

    public static boolean isVowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
}
