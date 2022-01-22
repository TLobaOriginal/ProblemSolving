import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntegersToRomanNumerals {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(1994));
    }
    static public String intToRoman(int num) {
        Map<Integer, Map.Entry<Integer, String >> map = new LinkedHashMap<>();
        StringBuilder romanNumeral = new StringBuilder();

        map.put(0, Map.entry(1000, "M"));
        map.put(1, Map.entry(900, "CM"));
        map.put(2, Map.entry(500, "D"));
        map.put(3, Map.entry(400, "CD"));
        map.put(4, Map.entry(100, "C"));
        map.put(5, Map.entry(90, "XC"));
        map.put(6, Map.entry(50, "L"));
        map.put(7, Map.entry(40, "XL"));
        map.put(8, Map.entry(10, "X"));
        map.put(9, Map.entry(9, "IX"));
        map.put(10, Map.entry(5, "V"));
        map.put(11, Map.entry(4, "IV"));
        map.put(12, Map.entry(1, "I"));

        int value = num;
        int i = 0;
        while (i <= 12 && value > 0){
            if(map.get(i).getKey() <= value){
                romanNumeral.append(map.get(i).getValue());
                value -= map.get(i).getKey();
            } else{
                i++;
            }
        }

        return romanNumeral.toString();
    }
}
