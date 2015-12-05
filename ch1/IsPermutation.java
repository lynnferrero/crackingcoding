import java.util.*;
import java.io.*;

public class IsPermutation{

		public static String sort(String s){
			char[] content = s.toCharArray();
			java.util.Arrays.sort(content);
			 
			return  String.valueOf(content);
		}

		public static boolean permutation(String s,String t)
		{
			if(s.length()!= t.length()){
				return false;
			}

			return sort(s).equals(sort(t));
		}

		public static void main(String[] args) throws IOException{
			System.out.println(permutation("abc","bca")?"it is.":"it is not.");
		}




} 