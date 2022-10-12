package study.spring.basic.core.member;

import study.spring.basic.core.member.domain.Grade;
import study.spring.basic.core.member.domain.Member;
import study.spring.basic.core.member.service.MemberServiceImpl;

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
