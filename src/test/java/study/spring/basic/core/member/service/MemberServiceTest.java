package study.spring.basic.core.member.service;

import org.junit.jupiter.api.Test;
import study.spring.basic.core.member.domain.Grade;
import study.spring.basic.core.member.domain.Member;

import static org.assertj.core.api.Assertions.*;

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