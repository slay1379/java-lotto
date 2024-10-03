package lotto.view;

import lotto.domain.Game;
import lotto.domain.Lotto;

public class OutputView {
    private static final String LOTTO_AMOUNT_MSG = "개를 구매했습니다.";
    private Game game;

    public void outputLottoAmount() {
        System.out.println(game.getLottoPrice() + LOTTO_AMOUNT_MSG);
    }
}
