import java.util.*;

public class Anagram{
	public static void sort(String[] array){
		HashMapList<String, String> mapList = new HashMapList<String, String>();
		for (String s: array){
			String key = sortChars(s);
			mapList.put(key,s);

		}

		int index = 0;
		for (String key: mapList.keySet()){
			ArrayList<String> list = mapList.get(key);
			for (String t: list){
				array[index] = t;
				index++;
			}
		}
	}
	String sortChars(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	 public static void main(String[] args) {
    String[] array = new String[]{"cats", "acre", "atcs", "fried", "race", "axe", "exa", "care"};
    System.out.println(Arrays.toString(array));
    Arrays.sortChars(array);

    System.out.println(Arrays.toString(array));
  }

}