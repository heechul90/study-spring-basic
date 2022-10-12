package study.spring.basic;

import study.spring.basic.core.discount.FixDiscountPolicy;
import study.spring.basic.core.repository.MemoryMemberRepository;
import study.spring.basic.core.service.MemberService;
import study.spring.basic.core.service.MemberServiceImpl;
import study.spring.basic.core.service.OrderService;
import study.spring.basic.core.service.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
