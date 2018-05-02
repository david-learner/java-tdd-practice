package domain;

import java.util.Set;

public class WinningLotto {
    Set<Integer> numbers;

    public WinningLotto(Set<Integer> numbers) {
        if (numbers.size() > 6) {
            throw new RuntimeException("로또 한 장은 정수 6개만 허용합니다. 현재 " + numbers.size() + "개");
        }
        this.numbers = numbers;
    }
}
