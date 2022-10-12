package study.spring.basic.core.repository;

import study.spring.basic.core.domain.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
