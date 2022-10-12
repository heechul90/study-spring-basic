package study.spring.basic.core.member.repository;

import study.spring.basic.core.member.domain.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
