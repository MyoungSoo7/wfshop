package org.welfare.wfshop.domain.market.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.welfare.wfshop.domain.market.Market;

public interface MarketRepository extends JpaRepository<Market, Integer> {
}