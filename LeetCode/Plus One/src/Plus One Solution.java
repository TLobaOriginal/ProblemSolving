import java.util.ArrayList;
import java.util.List;

class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){ //If the digit is less than 9 we can simply add a 1
                digits[i]++;
                return digits;
            }
            digits[i] = 0; //If the digit is 9 then we make it a 0 and proceed to add to the next
                            //Digit
        }
        digits = new int[digits.length + 1]; //If we've gone through all digits and have not returned
                                            //The value, then we must increase the array size
                                            //and have the first value be 1.
        digits[0] = 1;
        return digits;
    }
}
