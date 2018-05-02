package domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LottoMachineTest {
    @Test
    public void calcLottoCount() {
        assertThat(LottoMachine.calcLottoCount(12000),is(12));
    }
}
