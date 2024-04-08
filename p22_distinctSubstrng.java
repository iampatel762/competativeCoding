java.util.HashSet; import 
java.util.Set;  
  
public class PrintDistinctSubstrings {     public static void main(String[] args) {  
        String str = "aaaa";  
        Set<String> subs = distinctSubstring(str);  
  
        System.out.println("Distinct Substrings are:");         for (String sub : subs) {  
            System.out.println(sub);  
        }  
    }  
  
    private static Set<String> distinctSubstring(String str) {         Set<String> result = new HashSet<>();  
        for (int i = 0; i < str.length(); i++) {             for (int j = i + 1; j <= str.length(); j++) {                 
result.add(str.substring(i, j));  
            }  
        }  
        return result;  
    }  
}  
