package org.welfare.wfshop.entity.member.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.welfare.wfshop.entity.member.Member;

public interface MemberRepository extends JpaRepository<Member, String> {
}