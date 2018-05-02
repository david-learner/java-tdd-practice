package domain;

import java.util.concurrent.ThreadLocalRandom;

public class LottoMachine {
    private static final int LOTTO_COST = 1000;

    public static int calcLottoCount(int cost) {
        return cost / LOTTO_COST;
    }

    public static int generateRandomNo() {
        return ThreadLocalRandom.current().nextInt(1, 46);
    }
}
