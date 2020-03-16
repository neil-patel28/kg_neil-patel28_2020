import java.util.*; //import all from util library
class Main {
  
    public static boolean mapString(String s1, String s2) {
         //this if statement is a base case to let the code know if there is nothing in either strings, to return false
         if(s1.length()!= s2.length()){ 
        return false; 
    }
    //create two separate hashmaps for the two strings that will be compared one-by-one
    HashMap<Character, Character> map1 = new HashMap<>();
    HashMap<Character, Character> map2 = new HashMap<>();
    
    //iterate using for loop to comapare each character in the string to each other
    for(int i=0; i<s1.length(); i++){
        char c1 = s1.charAt(i);
        char c2 = s2.charAt(i);
        
        //check if map1 is being mapped out into the first hashmap initialized above
        if(map1.containsKey(c1)){

            if(c2!=map1.get(c1)){
                return false;
            }
        } else{
            
            //check if map2 is being mapped out into the first hashmap initialized above
            if(map2.containsKey(c2)){
                return false;
            }
 
            map1.put(c1, c2);
            map2.put(c2, c1);
        }
    }
    return true;
    }

  public static void main(String[] args) {
    //Test cases to check if algorithm works
    //Time complexity is O(n) because only one for loop is being used to compare each charater from both strings
    //Space cpmlexity is O(n() because there are n amount of variables being used
    String t1a = "foo";
    String t1b = "bar";
    System.out.println(mapString(t1a,t1b));

    String t2a = "abc";
    String t2b = "xyz";
    System.out.println(mapString(t2a,t2b));

    String t3a = "egg";
    String t3b = "add";
    System.out.println(mapString(t3a,t3b));

    String t4a = "aaa";
    String t4b = "abc";
    System.out.println(mapString(t4a,t4b));

    String t5a = "hello";
    String t5b = "world";
    System.out.println(mapString(t5a,t5b));
  }
}



