import java.util.*;

public class Test {
 
  
    public static void sort(String[] array) {
      Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
      for (String s : array) {
        String key = sortChars(s);
        if (map.containsKey(key)) {
          ArrayList<String> lst = map.get(key);
          lst.add(s);
        } else {
          ArrayList<String> lst = new ArrayList<String>();
          lst.add(s);
          map.put(key, lst);
        }
      }
      int index = 0;
      for (String key : map.keySet()) {
        ArrayList<String> lst = map.get(key);
        for (String s : lst) {
          array[index] = s;
          index++;
        }
      }


    }
     public static String sortChars(String s) {
      char[] content = s.toCharArray();
      Arrays.sort(content);
      return new String(content);
    }
  

  public static void main(String[] args) {
    String[] array = new String[]{"cats", "acre", "atcs", "fried", "race", "axe", "exa", "care"};
    System.out.println(Arrays.toString(array));
   // Arrays.sort(array, new AnagramComparator());
    sort(array);
    System.out.println(Arrays.toString(array));
  }
  }
  