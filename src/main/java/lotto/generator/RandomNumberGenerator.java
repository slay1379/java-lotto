package lotto.generator;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class RandomNumberGenerator {

    public List<Integer> randomNumbersGenerate() {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }
}
