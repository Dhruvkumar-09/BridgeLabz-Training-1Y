import java.util.*;
public class Question8 {
    public static void main(String[] args) {
        String s1="elbow";
        String s2="below";
        HashMap<Character, Integer> mp1=new HashMap<>();
        HashMap<Character, Integer> mp2=new HashMap<>();
        for(char i:s1.toCharArray()){
            mp1.put(i, mp1.getOrDefault(i,0)+1);
        }
        for(char i:s2.toCharArray()){
            mp2.put(i, mp2.getOrDefault(i,0)+1);

        }
        if(mp1.equals(mp2)){
            System.out.println("Anagrams");

        }
        else {
            System.out.println("Not Anagrams");
        }

    }
}