// Roman numerals are usually written largest to smallest from left to right, for example: XII (7), XXVII (27), III (3)...
// If a small value is placed before a bigger value then it's a combine number, for exampe: IV (4), IX (9), XIV (14)...
// IV = -1 + 5
// VI = 5 + 1
// XL = -10 + 50
// LX = 50 + 10
// So, if a smaller number appears before a larger number, it indicates that the number is smaller by a quantity used as a suffix to it, which made going backwards seem easy.

import java.util.HashMap;
import java.util.Map;

public class roman {
    public static int romanToInt(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
       int ans = map.get(s.charAt(s.length()-1));

       for(int i=s.length()-2;i >= 0;i--){
        if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
            ans = ans - map.get(s.charAt(i));
        }
        else{
            ans = ans + map.get(s.charAt(i));
        }
       }
        return ans;
    }

    
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int ans = romanToInt(s);
        System.out.println(ans);
    }
}
