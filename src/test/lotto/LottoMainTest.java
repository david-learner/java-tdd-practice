import view.InputView;
import domain.Lotto;
import domain.LottoMachine;
import view.ResultView;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

public class LottoMainTest {
    @Test
    public void lottoMain() {
        Scanner scanner = new Scanner("12000");
        int cost = InputView.getCost(scanner);
        int count = LottoMachine.calcLottoCount(cost);
        ResultView.printCost(cost);
        ResultView.printLottoCount(count);
        List<Lotto> lottos = LottoMachine.getLottos(count);
        ResultView.printLottos(lottos);
    }
}
