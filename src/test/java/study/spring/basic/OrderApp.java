package study.spring.basic;

import study.spring.basic.core.domain.Grade;
import study.spring.basic.core.domain.Member;
import study.spring.basic.core.domain.Order;
import study.spring.basic.core.service.MemberService;
import study.spring.basic.core.service.MemberServiceImpl;
import study.spring.basic.core.service.OrderService;
import study.spring.basic.core.service.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
