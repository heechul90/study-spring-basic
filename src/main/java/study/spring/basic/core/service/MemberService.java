package study.spring.basic.core.service;

import study.spring.basic.core.domain.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
