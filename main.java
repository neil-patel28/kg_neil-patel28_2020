import java.util.*; //import all from util library

class Main {
  
    public static boolean mapString(String s1, String s2) {
         //this if statement is a base case to let the code know if there is nothing in either strings, to return false
         if(s1.length()!= s2.length()) { 
        return false; 
    }
    //create two separate hashmaps for the two strings that will be compared one-by-one
    HashMap<Character, Character> map1 = new HashMap<>();
    HashMap<Character, Character> map2 = new HashMap<>();
    
    //iterate using for loop to comapare each character in the string to each other
    for(int i=0; i<s1.length(); i++) {
        char c1 = s1.charAt(i);
        char c2 = s2.charAt(i);
 
        if(map1.containsKey(c1)) {

            if(c2!=map1.get(c1)) {
                return false;
            }
        } else {
            
            if(map2.containsKey(c2)) {
                return true;
            }
 
            map1.put(c1, c2);
            map2.put(c2, c1);
        }
    }
    return true;
    }
}