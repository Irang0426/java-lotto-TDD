package lotto;

import java.util.List;

public class BonusNumber {
    private final int MIN_NO = 1;
    private final int MAX_NO = 45;

    private int bonusNumber;


    public boolean validNo(int bonusNumber) {
        return bonusNumber >= MIN_NO && bonusNumber <= MAX_NO;
    }

    public void inputBonusNumber(String s) throws NumberFormatException {
        this.bonusNumber = Integer.parseInt(s);
    }

    public boolean validDuplication(int bonusNumber, List<Integer> lotto) {
        return !lotto.contains(bonusNumber);
    }
}
