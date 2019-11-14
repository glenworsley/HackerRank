package valley;

import java.util.logging.Logger;

public class Counter implements ValleyCounter {

    public final static Logger LOGGER = Logger.getLogger(Counter.class.getName());

    @Override
    public int count(int n, String s) {

        int seaLevel = 0;
        int valleyCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.substring(i, i + 1).equalsIgnoreCase("U")) {
                seaLevel++;
                if (seaLevel == 0) {
                    valleyCount++;
                }
            }
            else {
                seaLevel--;
            }
            LOGGER.info("seaLevel = " + seaLevel);
        }
        return valleyCount;
    }
}
