package study.spring.basic.core.discount;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import study.spring.basic.annotation.MainDiscountPolicy;
import study.spring.basic.core.domain.Grade;
import study.spring.basic.core.domain.Member;

@Component
//@Qualifier("mainDiscountPolicy")
@Primary
//@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {

    //10% 할인
    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
