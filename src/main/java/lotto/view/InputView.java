package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.domain.Game;
import lotto.domain.Lotto;

public class InputView {

    private static final String LOTTO_PRICE_INPUT_MSG = "구입금액을 입력해 주세요.";
    private static final String WINNING_NUMBERS_INPUT_MSG = "당첨 번호를 입력해 주세요.";

    public int InputLottoPrice() {
        System.out.println(LOTTO_PRICE_INPUT_MSG);
        return Integer.parseInt(Console.readLine());
    }

    public String[] InputWinningNumbers() {
        System.out.println(WINNING_NUMBERS_INPUT_MSG);
        String[] winningNumbers = Console.readLine().split(",");
        return winningNumbers;
    }

}
