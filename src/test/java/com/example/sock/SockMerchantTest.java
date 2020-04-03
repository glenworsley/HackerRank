package com.example.sock;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SockMerchantTest {

    private final ISockMerchant iSockMerchant = new ArrayListSockMerchant(); //new SockMerchant();

    @Test
    public void fromExample() {

        assertThat(iSockMerchant.nbrPairs(9, new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20  }), is(equalTo(3)));

    }

    @Test
    public void manyPairs() {

        assertThat(iSockMerchant.nbrPairs(11, new int[] { 10, 20, 30, 10, 10, 20, 50, 20, 40, 30, 20  }), is(equalTo(4)));

    }

    @Test
    public void threeDifferentSocks() {

        assertThat(iSockMerchant.nbrPairs(3, new int[] { 10, 20, 30  }), is(equalTo(0)));

    }

    @Test
    public void onePairInThreeSocks() {

        assertThat(iSockMerchant.nbrPairs(3, new int[] { 10, 20, 20  }), is(equalTo(1)));

    }

    @Test
    public void matchingPair() {

        assertThat(iSockMerchant.nbrPairs(2, new int[] { 10, 10  }), is(equalTo(1)));

    }

    @Test
    public void nonmatchingSocks() {

        assertThat(iSockMerchant.nbrPairs(2, new int[] { 10, 20  }), is(equalTo(0)));

    }

    @Test
    public void singleSock() {

        assertThat(iSockMerchant.nbrPairs(1, new int[] { 10  }), is(equalTo(0)));

    }

    @Test
    public void noSocks() {

        assertThat(iSockMerchant.nbrPairs(0, new int[] {  }), is(equalTo(0)));

    }

}