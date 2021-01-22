package org.demo;

import static java.lang.Integer.parseInt;

public class StringCalculator {

    public static int add(String numbers){
        if(numbers.isEmpty()) {
            return 0;
        }
        else {
            String[] numberArray = numbers.split(",");
            int total = parseInt(numberArray[0]);
            if(numberArray.length > 1) {
                total += parseInt(numberArray[1]);
            }
            return total;
        }
    }

}
