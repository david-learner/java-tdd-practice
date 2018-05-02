package domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class LottoMachine {
    private static final int LOTTO_COST = 1000;

    public static int calcLottoCount(int cost) {
        return cost / LOTTO_COST;
    }

    public static int generateRandomNo() {
        return ThreadLocalRandom.current().nextInt(1, 46);
    }

    public static List<Integer> getLotto() {
        List<Integer> lotto = new ArrayList<>();
        while (lotto.size() < 6) {
            lotto.add(generateRandomNo());
        }
        return lotto;
    }
}
