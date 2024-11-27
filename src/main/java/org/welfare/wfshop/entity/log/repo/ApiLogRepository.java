package org.welfare.wfshop.entity.log.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.welfare.wfshop.entity.log.ApiLog;

public interface ApiLogRepository extends JpaRepository<ApiLog, Long> {
}