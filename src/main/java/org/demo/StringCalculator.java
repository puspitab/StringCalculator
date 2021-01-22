package org.demo;

import static java.lang.Integer.parseInt;

public class StringCalculator {

    public static int add(String numbers){
        if(numbers.isEmpty()) {
            return 0;
        }
        else {
            String[] numberArray = numbers.split(",");
            int total = 0;
            for (String number: numberArray) {
                total += parseInt(number);
            }
            return total;
        }
    }

}
