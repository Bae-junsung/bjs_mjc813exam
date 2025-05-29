package com.mjc813.ksm.lib;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class TestMjcValidCheck {
    @Test
    public void MjcValidCheck() {
        MjcValidCheck mvc = new MjcValidCheck();
        //전화번호
        assertThat(mvc.isValidPhoneNumber(null)).isEqualTo(false);
        assertThat(mvc.isValidPhoneNumber("")).isEqualTo(false);
        assertThat(mvc.isValidPhoneNumber("010-39a2-0203")).isEqualTo(false);
        assertThat(mvc.isValidPhoneNumber("010-1111-2222")).isEqualTo(true);
        //우편번호
        assertThat(mvc.isValidZipNumber(null)).isEqualTo(false);
        assertThat(mvc.isValidZipNumber("")).isEqualTo(false);
        assertThat(mvc.isValidZipNumber("0982")).isEqualTo(false);
        assertThat(mvc.isValidZipNumber("12345")).isEqualTo(true);
        //이메일
        assertThat(mvc.isValidEmail(null)).isEqualTo(false);
        assertThat(mvc.isValidEmail("")).isEqualTo(false);
        assertThat(mvc.isValidEmail("@daum.")).isEqualTo(false);
        assertThat(mvc.isValidEmail("abc@naver.com")).isEqualTo(true);
    }
}
