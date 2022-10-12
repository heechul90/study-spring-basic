package study.spring.basic.core.discount;

import study.spring.basic.core.domain.Grade;
import study.spring.basic.core.domain.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    //1000원 할인
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
