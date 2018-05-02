package domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
        List<Integer> lotto = LottoMachine.getLotto();
        assertThat(lotto.size() ,is(6));
        System.out.println(Arrays.toString(lotto.toArray()));
    }
}
