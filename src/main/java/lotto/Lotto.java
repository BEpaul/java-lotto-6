package lotto;

import java.util.Collection;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return numbers.toString();
    }

    public List<Integer> getLottoNumbers() {
        return numbers;
    }

    public Rank getRankResult(WinningLotto winningLotto) {
        return winningLotto.match(this);
    }
}
