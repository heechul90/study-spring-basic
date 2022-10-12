package study.spring.basic.core.discount;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.spring.basic.core.domain.Grade;
import study.spring.basic.core.domain.Member;

import static org.assertj.core.api.Assertions.assertThat;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")
    void discount_vip_o() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        int discountPrice = discountPolicy.discount(member, 10000);

        //then
        assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다.")
    void discount_vip_x() {
        //given
        Member member = new Member(1L, "memberB", Grade.BASIC);

        //when
        int discountPrice = discountPolicy.discount(member, 10000);

        //then
        assertThat(discountPrice).isEqualTo(0);
    }
}