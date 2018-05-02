package domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

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
}
