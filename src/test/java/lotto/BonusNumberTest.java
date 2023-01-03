package lotto;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BonusNumberTest {

    BonusNumber bonusNumber = new BonusNumber();

    @Test
    void 로또번호_1_45_검증() {
        assertThat(bonusNumber.validNo(45)).isTrue();
        assertThat(bonusNumber.validNo(1)).isTrue();
        assertThat(bonusNumber.validNo(0)).isFalse();
        assertThat(bonusNumber.validNo(46)).isFalse();
    }

    @Test
    void 보너스번호_숫자_검증() {
        assertThatThrownBy(() -> bonusNumber.inputBonusNumber("가나다")).isInstanceOf(NumberFormatException.class);
        assertThatThrownBy(() -> bonusNumber.inputBonusNumber("@($*@")).isInstanceOf(NumberFormatException.class);
    }

    @Test
    void 보너스번호_중복_검증() {
        assertThat(bonusNumber.validDuplication(7, List.of(1, 2, 3, 4, 5, 6))).isTrue();
        assertThat(bonusNumber.validDuplication(1, List.of(1, 2, 3, 4, 5, 6))).isFalse();
    }

}
