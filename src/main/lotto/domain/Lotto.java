package domain;

import java.util.Arrays;
import java.util.Set;

public class Lotto {
    Set<Integer> lottoNos;

    public Lotto(Set<Integer> lottoNos) {
        if (lottoNos.size() > 6) {
            throw new RuntimeException("Lotto는 최대 6개의 정수만 가질 수 있습니다." + " 현재 개수는 " + lottoNos.size() + "개");
        }
        this.lottoNos = lottoNos;
    }

    @Override
    public String toString() {
        return Arrays.toString(lottoNos.toArray());
    }
}
