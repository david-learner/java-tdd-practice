package domain;

import org.junit.Test;
import view.InputView;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LottoMachineTest {
    @Test
    public void calcLottoCount() {
        assertThat(LottoMachine.calcLottoCount(12000),is(12));
    }

    @Test
    public void randomNoGenerate() {
        System.out.println(LottoMachine.generateRandomNo());
    }

    @Test
    public void getLotto() {
        Set<Integer> lottoNos = LottoMachine.getLotto();
        assertThat(lottoNos.size() ,is(6));
        System.out.println(Arrays.toString(lottoNos.toArray()));
    }

    @Test
    public void getLottos() {
        List<Lotto> lottos = LottoMachine.getLottos(6);
        assertThat(lottos.size(), is(6));
    }

    @Test
    public void createWinningLotto() {
        Scanner scanner = new Scanner("1, 2, 3, 4, 5, 7");
        WinningLotto winningLotto = LottoMachine.createWinningLotto("1, 2, 3, 4, 5, 7");
    }

    @Test
    public void splitDivider() {
        String[] str = LottoMachine.splitDivider("1, 2, 3, 4, 5, 7");
    }
}
