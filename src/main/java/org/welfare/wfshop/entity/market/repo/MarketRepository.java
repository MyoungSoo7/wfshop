package org.welfare.wfshop.entity.market.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.welfare.wfshop.entity.market.Market;

public interface MarketRepository extends JpaRepository<Market, Integer> {
}