package study.spring.basic.core.discount;

import study.spring.basic.core.domain.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);

}
