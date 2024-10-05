package lotto.domain;

import java.util.EnumMap;
import java.util.Map;

public class Result {
    private final Map<Rank, Integer> rankCount = new EnumMap<>(Rank.class);
    private int lottoPrice;

    public Result(int lottoPrice) {
        this.lottoPrice = lottoPrice;
        for (Rank rank : Rank.values()) {
            rankCount.put(rank, 0);
        }
    }

    public void addRank(Rank rank) {
        rankCount.put(rank, rankCount.get(rank) + 1);
    }

    public void display() {
        for (Rank rank : Rank.values()) {
            if (rank != Rank.NONE) {
                System.out.println(rank.getDescription() + " - " + rankCount.get(rank) + "개");
            }
        }
        System.out.println("총 수익률은 " + calculateProfitRate() + "%입니다.");
    }

    public double calculateProfitRate() {
        double totalPrize = rankCount.entrySet().stream()
                .mapToDouble(entry -> entry.getKey().getPrize() * entry.getValue())
                .sum();
        double purchaseAmount = rankCount.entrySet().stream()
                .filter(entry -> entry.getKey() != Rank.NONE)
                .mapToInt(entry -> entry.getValue())
                .sum() * lottoPrice;
        return (totalPrize / purchaseAmount) * 100;
    }
}
