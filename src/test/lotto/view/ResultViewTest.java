package view;

import domain.Lotto;
import domain.LottoMachine;
import org.junit.Test;

import java.util.List;

public class ResultViewTest {
    @Test
    public void printLottoCount() {
        ResultView.printLottoCount(12);
    }

    @Test
    public void printLottos() {
        List<Lotto> lottos = LottoMachine.getLottos(6);
        ResultView.printLottos(lottos);
    }
}
