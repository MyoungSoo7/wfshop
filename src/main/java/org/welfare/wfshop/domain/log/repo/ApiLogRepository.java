package org.welfare.wfshop.domain.log.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.welfare.wfshop.domain.log.ApiLog;

public interface ApiLogRepository extends JpaRepository<ApiLog, Long> {
}