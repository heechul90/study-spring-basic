package study.spring.basic;

import study.spring.basic.core.domain.Grade;
import study.spring.basic.core.domain.Member;
import study.spring.basic.core.service.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberServiceImpl memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("newMember = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
