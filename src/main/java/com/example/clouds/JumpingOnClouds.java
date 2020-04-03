package com.example.clouds;

public class JumpingOnClouds implements ICloudJumper {

    @Override
    public int getMinJumps(int[] clouds) {

        //assumptions, based on example given:
        //start on cloud 0
        //cloud 0 is a cumulus

        int idx = 0;
        int jumpCount = 0;

        while (idx < clouds.length) {
            //want min jumps, so try and jump 2 first
            if (idx + 2 < clouds.length && clouds[idx + 2] == 0) {
                jumpCount++;
                idx = idx + 2;
            } else {
                //cannot jump 2, so try and jump 1
                if (idx + 1 < clouds.length && clouds[idx + 1] == 0) {
                    jumpCount++;
                    idx++;
                }
                else {
                    break; //no more jumps
                }
            }
        }

        return jumpCount;
    }
}
