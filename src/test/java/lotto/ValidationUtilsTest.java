package lotto;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @Test
    void 로또번호_1_45_검증() {
        assertThat(ValidationUtils.validNo(45)).isTrue();
        assertThat(ValidationUtils.validNo(1)).isTrue();
        assertThat(ValidationUtils.validNo(0)).isFalse();
        assertThat(ValidationUtils.validNo(46)).isFalse();
    }

    @Test
    void 보너스번호_숫자_검증() {
        assertThat(ValidationUtils.isInteger("1")).isTrue();
        assertThat(ValidationUtils.isInteger("가나다")).isFalse();
    }
}
