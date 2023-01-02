package lotto;

public class ValidationUtils {
    public static final int MIN_NO = 1;
    public static final int MAX_NO = 45;

    public static boolean validNo(int bonusNumber) {
        return bonusNumber >= MIN_NO && bonusNumber <= MAX_NO;
    }
}
