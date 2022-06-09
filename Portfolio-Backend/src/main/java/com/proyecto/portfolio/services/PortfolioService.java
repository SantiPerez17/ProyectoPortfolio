/**
 * 
 */
package com.proyecto.portfolio.services;

import java.util.List;

import com.proyecto.portfolio.models.Portfolio;

/**
 * @author santi
 *
 */
public interface PortfolioService {
	public List<Portfolio> getPortfolios();
	public Portfolio addPortfolio(Portfolio portfolio, String loggedEmail) throws Exception;
	public Portfolio findPortfolio(Long id) throws Exception;
	public void deletePortfolio(Long id, String loggedEmail) throws Exception;
	public void updatePortfolio(Portfolio portfolio, String name, String loggedEmail) throws Exception;  
}
