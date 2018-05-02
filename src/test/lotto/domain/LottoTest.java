package domain;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

public class LottoTest {
    @Test(expected = RuntimeException.class)
    public void isNotValidCount() {
        Lotto lotto = new Lotto(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
    }

    @Test
    public void isValidCount() {
        Lotto lotto = new Lotto(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }

    @Test
    public void printLottoNo() {
        Lotto lotto = new Lotto(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)));
        System.out.println(lotto.toString());
    }
}
