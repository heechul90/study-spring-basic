package study.spring.basic.core.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import study.spring.basic.core.domain.Grade;
import study.spring.basic.core.domain.Member;
import study.spring.basic.core.domain.Order;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        //given
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        //when
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        //then
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}