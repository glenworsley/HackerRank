package com.example.valley;

import java.util.logging.Logger;

public class CounterWithStreams implements ValleyCounter {

    public static Logger logger = Logger.getLogger(CounterWithStreams.class.getName());

    @Override
    public int count(int n, String s) {

        int seaLevel = 0;
        //boolean inValley = false;
        int valleyCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.substring(i, i + 1).equalsIgnoreCase("U")) {
                seaLevel++;
                if (seaLevel == 0) {
                    //inValley = false; //leaving a valley
                    valleyCount++;
                }
            }
            else {
                seaLevel--;
                //if (seaLevel == -1) {
                //    inValley = true; //entered a valley
                //}
            }
            logger.info("seaLevel = " + seaLevel);
        }
        return valleyCount;
    }
}
