import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntegersToRomanNumerals {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(1994));
    }
    static public String intToRoman(int num) {
        Map<Integer, String> map = new LinkedHashMap<>();
        StringBuilder romanNumeral = new StringBuilder();

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        int value = num;
        for(int key: map.keySet()){
            while(value >= key){
                romanNumeral.append(map.get(key));
                value -= key;
            }
        }

        return romanNumeral.toString();
    }


}
