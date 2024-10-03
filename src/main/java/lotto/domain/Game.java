package lotto.domain;

import java.util.List;

public class Game {

    private final int lottoPrice;
    public List<Integer> winningNumbers;
    private int lottoAmount;
    private List<Integer> winners;

    public Game(int lottoPrice) {
        this.lottoPrice = lottoPrice;
    }

    public int getLottoPrice() {
        return this.lottoPrice;
    }

    public int getLottoAmount() {
        return lottoPrice/1000;
    }

    public List<Integer> getWinners() {
        return winners;
    }
}
