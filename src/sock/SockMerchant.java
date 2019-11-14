package sock;

public class SockMerchant implements ISockMerchant {

    @Override
    public int nbrPairs(int n, int[] ar) {

        if (n > 1 && ar[0] == ar[1]) {
            return 1;
        }
        return 0;
    }
}
