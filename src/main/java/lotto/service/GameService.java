package lotto.service;

import lotto.domain.Game;
import lotto.domain.Lotto;
import lotto.generator.RandomNumberGenerator;

import java.util.Collections;
import java.util.List;

public class GameService {

    private Game game;
    private RandomNumberGenerator randomNumberGenerator;

    public void createWinningNumbers(String[] winningString) {
        for (String number : winningString) {
            game.winningNumbers.add(Integer.parseInt(number));
        }
    }

    public Lotto createLotto() {
        List<Integer> lottoNumbers = randomNumberGenerator.randomNumbersGenerate();
        Collections.sort(lottoNumbers);
        return new Lotto(lottoNumbers);
    }

    public void testLottoWinning() {
        int matchCount = 0;
        Lotto lotto = createLotto();
        List<Integer> lottoNumbers = lotto.getLottoNumbers();
        for (int i = 0; i < lottoNumbers.size(); i++) {
            if (lottoNumbers.get(0).equals())
        }
    }
}
