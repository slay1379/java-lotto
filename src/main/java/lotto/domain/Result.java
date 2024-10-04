package lotto.domain;

import java.util.EnumMap;
import java.util.Map;

public class Result {
    private final Map<Rank, Integer> rankCount = new EnumMap<>(Rank.class);

    public Result() {
        for (Rank rank : Rank.values()) {
            rankCount.put(rank, 0);
        }
    }
}
