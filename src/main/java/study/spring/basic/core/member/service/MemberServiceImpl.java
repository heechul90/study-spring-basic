package study.spring.basic.core.member.service;

import study.spring.basic.core.member.domain.Member;
import study.spring.basic.core.member.repository.MemberRepository;
import study.spring.basic.core.member.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
