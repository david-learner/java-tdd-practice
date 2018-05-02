package domain;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class LottoMachine {
    private static final int LOTTO_COST = 1000;

    public static int calcLottoCount(int cost) {
        return cost / LOTTO_COST;
    }

    public static int generateRandomNo() {
        return ThreadLocalRandom.current().nextInt(1, 46);
    }

    public static Set<Integer> getLotto() {
        Set<Integer> lotto = new HashSet<>();
        while (lotto.size() < 6) {
            lotto.add(generateRandomNo());
        }
        return lotto;
    }

    public static List<Lotto> getLottos(int count) {
        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            lottos.add(new Lotto(getLotto()));
        }
        return lottos;
    }
}
