package study.spring.basic;

import study.spring.basic.core.domain.Grade;
import study.spring.basic.core.domain.Member;
import study.spring.basic.core.domain.Order;
import study.spring.basic.core.service.MemberService;
import study.spring.basic.core.service.OrderService;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
