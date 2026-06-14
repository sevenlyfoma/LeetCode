package io.github.sevenlyfoma;

import java.util.ArrayDeque;

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

    public static String predictPartyVictory(String senate) {

        int rBans = 0;
        int dBans = 0;

        char c;

        int rRemainging = 0;
        int dRemaining = 0;

        ArrayDeque<Character> nextVoteQueue = new ArrayDeque<>();


        for (int i = 0; i < senate.length(); i++){
            c = senate.charAt(i);


            if (c == 'R'){
                if (rBans == 0){
                    rRemainging++;
                    dBans++;
                    nextVoteQueue.add(c);
                }
                else{
                    rBans--;
                }
            }
            else {
                if (dBans == 0){
                    dRemaining++;
                    rBans ++;
                    nextVoteQueue.add(c);
                }
                else{
                    dBans--;
                }
            }
        }


        while (rRemainging > 0 && dRemaining > 0){
            c = nextVoteQueue.pollFirst();

            if (c == 'R'){
                if (rBans == 0){
                    dBans++;
                    nextVoteQueue.add(c);
                }
                else{
                    rRemainging--;
                    rBans--;
                }
            }
            else {
                if (dBans == 0){
                    rBans ++;
                    nextVoteQueue.add(c);
                }
                else{
                    dRemaining--;
                    dBans--;
                }
            }
        }

        if (rRemainging == 0){
            return "Dire";
        }
        else {
            return "Radiant";
        }
    }
}
