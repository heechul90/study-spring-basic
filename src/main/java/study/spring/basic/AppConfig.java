package study.spring.basic;

import study.spring.basic.core.discount.DiscountPolicy;
import study.spring.basic.core.discount.FixDiscountPolicy;
import study.spring.basic.core.repository.MemberRepository;
import study.spring.basic.core.repository.MemoryMemberRepository;
import study.spring.basic.core.service.MemberService;
import study.spring.basic.core.service.MemberServiceImpl;
import study.spring.basic.core.service.OrderService;
import study.spring.basic.core.service.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
