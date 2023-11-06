package lotto;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputReader {
    public static int inputPurchaseAmount() {
        return Integer.parseInt(Console.readLine());
    }

    public static Lotto inputWinningLotto() {
        String numbers = Console.readLine();
        List<Integer> winningLotto = getLottoFormat(numbers);

        return new Lotto(winningLotto);
    }

    private static List<Integer> getLottoFormat(String numbers) {
        return Arrays.stream(numbers.split(","))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    public static int inputBonusNumber() {
        return Integer.parseInt(Console.readLine());
    }
}
