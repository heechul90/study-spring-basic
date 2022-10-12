package study.spring.basic.core.discount;

import study.spring.basic.core.domain.Grade;
import study.spring.basic.core.domain.Member;

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
