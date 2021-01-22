package org.demo;

import static java.lang.Integer.parseInt;

public class StringCalculator {

    public static int add(String numbers){
        if(numbers.isEmpty()) {
            return 0;
        }
        else {
            String delim = ",";
            if (numbers.startsWith("//")) {
                delim = numbers.split("\n",2)[0].substring(2);
                numbers = numbers.split("\n", 2)[1];
            }
            String[] numberArray = numbers.split("["+delim+"\n]");
            int total = 0;
            for (String number: numberArray) {
                if (!number.isEmpty()) {
                    total += parseInt(number);
                }
            }
            return total;
        }
    }

}
