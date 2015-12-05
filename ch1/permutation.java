import java.util.*;
import java.io.*;

public class permutation {

	public static boolean isPermutation(String s, String t ){
		if (s.length()!=t.length()){
			return false;
		}
		int[] letters = new int[128];

		char[] s_array = s.toCharArray();
		for(char c: s_array){
			System.out.println("char c:"+c);
			letters[c]++;
			System.out.println("letters["+c+"]"+letters[c]);
			}


		for (int i = 0 ;i<t.length();i++){
			int c = (int) t.charAt(i);
			letters[c]--;
			if(letters[c]<0){
				return false;
			}
		}
		return true;
	}



	public static void main(String[] args){
		//System.out.println(isPermutation("abc","cba")?"It is":"It is not");
		System.out.println(isPermutation("test","estt")?"It is":"It is not");
		//System.out.println(isPermutation("testt","estt")?"It is":"It is not");
	}



}