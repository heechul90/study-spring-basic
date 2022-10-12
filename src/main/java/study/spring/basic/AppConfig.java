package study.spring.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.spring.basic.core.discount.DiscountPolicy;
import study.spring.basic.core.discount.FixDiscountPolicy;
import study.spring.basic.core.repository.MemberRepository;
import study.spring.basic.core.repository.MemoryMemberRepository;
import study.spring.basic.core.service.MemberService;
import study.spring.basic.core.service.MemberServiceImpl;
import study.spring.basic.core.service.OrderService;
import study.spring.basic.core.service.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
