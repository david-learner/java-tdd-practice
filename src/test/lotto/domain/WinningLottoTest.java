package domain;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class WinningLottoTest {
    @Test
    public void generate() {
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            numbers.add(i);
        }
        WinningLotto winningLotto = new WinningLotto(numbers);
    }
}
