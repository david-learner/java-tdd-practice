package domain;

import java.util.List;

public class ResultView {
    public static void printCost(int cost) {
        System.out.println(cost);
    }

    public static void printLottoCount(int count) {
        System.out.println(count+"개를 구매했습니다.");
    }

    public static void printLottos(List<Lotto> lottos) {
        for (Lotto lotto: lottos) {
            System.out.println(lotto.toString());
        }
    }
}
