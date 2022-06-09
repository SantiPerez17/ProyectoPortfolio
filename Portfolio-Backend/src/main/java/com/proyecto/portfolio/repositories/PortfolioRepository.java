/**
 * 
 */
package com.proyecto.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.portfolio.models.Portfolio;

/**
 * @author santi
 *
 */
@Repository("portfolioRepository")
public interface PortfolioRepository extends JpaRepository<Portfolio,Long>{
	
}
