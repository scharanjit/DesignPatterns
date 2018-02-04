package datastructure.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.

 Examples : The quick brown fox jumps over the lazy dog ” is a Pangram
 [Contains all the characters from ‘a’ to ‘z’]

 “The quick brown fox jumps over the dog” is not a Pangram
 [Doesn’t contains all the characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing]

 We promptly judged antique ivory buckles for the next prize
 */

public class Pangram {
    public static void main(String[] args) {

        ArrayList<String>alphabet = new ArrayList<String>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
        alphabet.remove(0);
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toLowerCase();

        for(int i=0;i<sentence.length();i++){
            if(!alphabet.isEmpty()){
                alphabet.remove(""+sentence.charAt(i));
            }else{
                break;
            }
        }
        System.out.println(alphabet.isEmpty()?"pangram":"not pangram");
    }
}
