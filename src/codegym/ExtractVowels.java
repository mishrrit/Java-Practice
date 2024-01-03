package codegym;
/*
 * Write a program that reads a string from the keyboard.

The program should display three lines:

The first line must contain only the vowels from the entered string.
The second must contain only the consonants from the entered string.
The third line must contain only the punctuation marks from the entered string.
Example input:
"Sam I am."

O/p:
a I A
Sm m
" . "

Requirements:
The program must read data from the keyboard.
The program should display three lines.
The first line must contain only the vowels from the input string, separated by a space.
The second line must contain only the consonants from the input string, separated by a space.
The third line must contain only the punctuation marks from the input string, separated by a space.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ExtractVowels {
    public static char[] vowels = "aeiou".toCharArray();
    public static char[] consonants = "bcdfghjklmnpqrstvwxyz".toCharArray();

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws IOException {
	BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
	String str = bfn.readLine();
	char[] ch = new char[str.length()];
	ArrayList vowarr = new ArrayList();
	ArrayList conarr = new ArrayList();
	ArrayList punarr = new ArrayList();
	for(int i = 0; i<str.length();i++) {
	    ch[i] = str.charAt(i);
	    if(isVowel(ch[i])) {
		vowarr.add(ch[i]);
	    }else if(isConsonant(ch[i])) {
		conarr.add(ch[i]);
	    }else if(ch[i]!= ' '){
		punarr.add(ch[i]);
	    }
	}	
	for(int i = 0; i< vowarr.size();i++) {
	    System.out.print(vowarr.get(i)+" ");
	}
	System.out.print("\n");
	for(int i = 0; i< conarr.size();i++) {
	    System.out.print(conarr.get(i)+" ");
	}
	System.out.print("\n");
	for(int i = 0; i< punarr.size();i++) {
	    if(punarr.get(i)!= null) {
	    System.out.print(punarr.get(i)+" ");
	    }
	}
    }

    public static boolean isVowel(char character) {
	character = Character.toLowerCase(character); // Convert to lowercase
	for (char vowel : vowels) { // Look for vowels in the array
	    if (character == vowel) {
		return true;
	    }
	}
	return false;
    }

    // The method checks whether a letter is a consonant
    public static boolean isConsonant(char character) {
	character = Character.toLowerCase(character); // Convert to lowercase
	for (char consonant : consonants) { // Look for consonants in the array
	    if (character == consonant) {
		return true;
	    }
	}
	return false;
    }

}
