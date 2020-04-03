package com.example.sock;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListSockMerchant implements ISockMerchant {

    @Override
    public int nbrPairs(int n, int[] ar) {

        if (n < 2) return 0;
        int nbrPairs = 0;
        List<Integer> socks = Arrays.stream(ar).boxed().collect(Collectors.toList());
        Collections.sort(socks);
        //walk through the list, counting the pairs
        for (int i = 0; i < (socks.size() - 1); i++) {
            if (socks.get(i) == socks.get(i + 1)) {
                nbrPairs++;
                i++;
            }
        }
        return nbrPairs;
    }
}
