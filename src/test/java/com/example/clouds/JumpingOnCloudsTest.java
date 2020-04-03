package com.example.clouds;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class JumpingOnCloudsTest {

    @Test
    public void getMinJumpsFor2Cumulus() {

        int[] clouds = { 0, 0 };
        ICloudJumper cloudJumper = new JumpingOnClouds();
        assertThat(cloudJumper.getMinJumps(clouds), is(equalTo(1)));
    }

    @Test
    public void getMinJumpsFor3Cumulus() {

        int[] clouds = { 0, 0, 0 };
        ICloudJumper cloudJumper = new JumpingOnClouds();
        assertThat(cloudJumper.getMinJumps(clouds), is(equalTo(1)));
    }

    @Test
    public void getMinJumpsFor4Cumulus() {

        int[] clouds = { 0, 0, 0, 0 };
        ICloudJumper cloudJumper = new JumpingOnClouds();
        assertThat(cloudJumper.getMinJumps(clouds), is(equalTo(2)));
    }

    @Test
    public void getMinJumpsFor2Cumulus1Thunderhead() {

        int[] clouds = { 0, 1, 0 };
        ICloudJumper cloudJumper = new JumpingOnClouds();
        assertThat(cloudJumper.getMinJumps(clouds), is(equalTo(1)));
    }

    @Test
    public void getMinJumps() {

        int[] clouds = { 0, 0, 1, 0, 0, 1, 0 };
        ICloudJumper cloudJumper = new JumpingOnClouds();
        assertThat(cloudJumper.getMinJumps(clouds), is(equalTo(4)));
    }
}