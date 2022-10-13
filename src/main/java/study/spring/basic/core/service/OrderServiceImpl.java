package study.spring.basic.core.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import study.spring.basic.core.discount.DiscountPolicy;
import study.spring.basic.core.domain.Member;
import study.spring.basic.core.domain.Order;
import study.spring.basic.core.repository.MemberRepository;

@Component
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member findMember = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(findMember, itemPrice);
        return new Order(findMember.getId(), itemName, itemPrice, discountPrice);
    }

    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
