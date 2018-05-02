import domain.InputView;
import domain.ResultView;
import org.junit.Test;

import java.util.Scanner;

public class LottoMainTest {
    @Test
    public void lottoMain() {
        Scanner scanner = new Scanner("12000");
        ResultView.printCost(InputView.getCost(scanner));
    }
}
