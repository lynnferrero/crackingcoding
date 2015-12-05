import java.util.*;

public class GroupAnagrams {
  public static class AnagramComparator implements Comparator<String> {
    public String sortChars(String s) {
      char[] content = s.toCharArray();
      Arrays.sort(content);
      return new String(content);
    }
public int compare(String s1, String s2) {
      return sortChars(s1).compareTo(sortChars(s2));
    }

   
  }

  public static void main(String[] args) {
    String[] array = new String[]{ "memm", "mmom", "memm","cats", "race", "axe", "exa", "care"};
    System.out.println(Arrays.toString(array));
    
    Arrays.sort(array, new AnagramComparator());
    System.out.println(Arrays.toString(array));
  }
}