import java.util.*;
import java.io.*;

public class palindrome{
	public static boolean isPermutationOfPalindrome(String phrase){
		int[] table = buildCharFrequencyTable(phrase);
		return checkMaxOneOdd(table);
	}
	public static boolean checkMaxOneOdd(int[] table){
		boolean foundOdd = false;
		for( int count: table){
			if(count % 2 == 1){
				if(foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}
	public static int getCharNumber(Character c){
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int A = Character.getNumericValue('A');
		int Z = Character.getNumericValue('Z');

		int val = Character.getNumericValue(c);
		if (a<= val && val <=z){
			return val - a;

		}else if (A<= val && val <=Z){
			return val - A;
		}
		return -1;
	}

	public static int[] buildCharFrequencyTable(String phrase){
		int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		for(char c: phrase.toCharArray()){
			int x = getCharNumber(c);
			if (x!=-1){
				table[x]++;
			}
		}
		return table;
	}

	public static void main(String[] args) {
		System.out.println(isPermutationOfPalindrome("Tact Coa")?"True":"False");
		System.out.println(isPermutationOfPalindrome("Test")?"True":"False");
		

	}
}