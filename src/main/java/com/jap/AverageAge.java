package com.jap;

import java.util.Arrays;

import static java.lang.Double.parseDouble;
import static java.lang.String.valueOf;

public class AverageAge {

    // This is a method that takes an array of strings and returns the average of the numbers in the array.
    public <ageRawData> String averageAgeCalculator(String[] ageRawData) {
        double avg = 0;
        double total;
        try {
            //Write the logic

            for (String ageRawDatum : ageRawData) {
                avg += parseDouble(ageRawDatum);
                // finalAvg = avg/ageRawData.length;
            }
            total = avg / (double) ageRawData.length;
            System.out.println(total);


            //Handle specific exception
        } catch (NumberFormatException exception) {
            return exception.toString();
        }
        return valueOf(total);
    }


}
