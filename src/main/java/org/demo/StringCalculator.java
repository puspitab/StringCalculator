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
            String negatives = "";
            for (String number: numberArray) {
                if (!number.isEmpty()) {
                    if (parseInt(number) < 0) {
                        if (negatives.isEmpty()) {
                            negatives = number;
                        }
                        else {
                            negatives += ", " +number;
                        }
                    }
                    else {
                        total += parseInt(number);
                    }
                }
            }
            if (!negatives.isEmpty())
                throw new NegativeNumberException("String contains negative numbers: " + negatives);
            else
                return total;
        }
    }

}
