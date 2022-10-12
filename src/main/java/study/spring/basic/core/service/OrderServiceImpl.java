package study.spring.basic.core.service;

import study.spring.basic.core.discount.DiscountPolicy;
import study.spring.basic.core.domain.Member;
import study.spring.basic.core.domain.Order;
import study.spring.basic.core.repository.MemberRepository;

public class OrderServiceImpl implements OrderService {

    private MemberRepository memberRepository;
    private DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member findMember = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(findMember, itemPrice);
        return new Order(findMember.getId(), itemName, itemPrice, discountPrice);
    }
}
