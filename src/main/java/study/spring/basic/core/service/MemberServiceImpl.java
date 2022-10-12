package study.spring.basic.core.service;

import study.spring.basic.core.domain.Member;
import study.spring.basic.core.repository.MemberRepository;
import study.spring.basic.core.repository.MemoryMemberRepository;

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
