package org.welfare.wfshop.domain.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.welfare.wfshop.domain.member.entity.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, String> {
    Optional<Member> findByUsername(String username);
}