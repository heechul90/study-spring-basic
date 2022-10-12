package study.spring.basic.core.member.service;

import study.spring.basic.core.member.domain.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
