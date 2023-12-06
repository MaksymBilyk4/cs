import java.util.HashMap;

// leet code #242 Valid Anagram
public class ValidAnagram {

    public static void main(String[] args) {
        isAnagram("anagram", "nagaram");
    }

    // Speed -> O(s1) // Mem -> O(s1 + s2)
    static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), (map.containsKey(s1.charAt(i)) ? map.get(s1.charAt(i)) + 1 : 1));
            map2.put(s2.charAt(i), (map2.containsKey(s2.charAt(i)) ? map2.get(s2.charAt(i)) + 1 : 1));
        }

        return map.equals(map2);
    }

}
