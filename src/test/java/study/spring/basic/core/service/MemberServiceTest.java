package study.spring.basic.core.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import study.spring.basic.core.domain.Grade;
import study.spring.basic.core.domain.Member;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(member.getId());

        //then
        assertThat(member).isEqualTo(findMember);
    }
}