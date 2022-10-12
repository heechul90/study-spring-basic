package study.spring.basic.core.service;

import study.spring.basic.core.discount.DiscountPolicy;
import study.spring.basic.core.discount.FixDiscountPolicy;
import study.spring.basic.core.domain.Member;
import study.spring.basic.core.domain.Order;
import study.spring.basic.core.repository.MemberRepository;
import study.spring.basic.core.repository.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member findMember = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(findMember, itemPrice);
        return new Order(findMember.getId(), itemName, itemPrice, discountPrice);
    }
}
