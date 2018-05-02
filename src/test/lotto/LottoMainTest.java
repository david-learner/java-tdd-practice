import domain.InputView;
import domain.LottoMachine;
import domain.ResultView;
import org.junit.Test;

import java.util.Scanner;

public class LottoMainTest {
    @Test
    public void lottoMain() {
        Scanner scanner = new Scanner("12000");
        int cost = InputView.getCost(scanner);
        ResultView.printCost(cost);
        ResultView.printLottoCount(LottoMachine.calcLottoCount(cost));
    }
}
