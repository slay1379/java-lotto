package lotto.service;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import lotto.domain.Lotto;
import lotto.domain.WinningLotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LottoGame {

    private static final int LOTTO_PRICE = 1000;
    private static final int LOTTO_NUMBER_COUNT = 6;
    private static final int MIN_LOTTO_NUMBER = 1;
    private static final int MAX_LOTTO_NUMBER = 45;
    private static final String INPUT_PURCHASE_AMOUNT_MSG = "구입금액을 입력해 주세요.";

    public void start() {
        try {
            int
        }
    }

    private int inputPurchaseAmount() {
        System.out.println(INPUT_PURCHASE_AMOUNT_MSG);
        int purchaseAmount = Integer.parseInt(Console.readLine());
        if (purchaseAmount % LOTTO_PRICE != 0) {
            throw new IllegalArgumentException("[ERROR] 구입 금액은 1,000 단위여야 합니다.");
        }
        return purchaseAmount;
    }

    private List<Lotto> generateLottos(int purchaseAmount) {
        int lottoCount = purchaseAmount / LOTTO_PRICE;
        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < lottoCount; i++) {
            lottos.add(new Lotto(Randoms.pickUniqueNumbersInRange(MIN_LOTTO_NUMBER, MAX_LOTTO_NUMBER, LOTTO_NUMBER_COUNT)));
        }
        return lottos;
    }

    private void displayPurchasedLottos(List<Lotto> lottos) {
        System.out.println(lottos.size() + "개를 구매했습니다.");
        for (Lotto lotto : lottos) {
            System.out.println(lotto);
        }
    }

    private WinningLotto getWinningLotto() {
        System.out.println("당첨 번호를 입력해 주세요.");
        List<Integer> winningNumbers = parseNumbers(Console.readLine());

        System.out.println("보너스 번호를 입력해 주세요.");
        int bonusNumber = Integer.parseInt(Console.readLine());
        return new WinningLotto(new Lotto(winningNumbers), bonusNumber);
    }


    private List<Integer> parseNumbers(String input) {
        try {
            return Arrays.stream(input.split(","))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 잘못된 번호 입력입니다.");
        }
    }

    public int getLottoPrice() {
        return LOTTO_PRICE;
    }
}
