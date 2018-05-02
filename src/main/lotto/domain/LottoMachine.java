package domain;

public class LottoMachine {
    private static final int LOTTO_COST = 1000;

    public static int calcLottoCount(int cost) {
        return cost / LOTTO_COST;
    }
}
