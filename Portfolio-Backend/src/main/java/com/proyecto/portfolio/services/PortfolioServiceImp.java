/**
 * 
 */
package com.proyecto.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyecto.portfolio.models.Portfolio;
import com.proyecto.portfolio.models.User;
import com.proyecto.portfolio.repositories.PortfolioRepository;
import com.proyecto.portfolio.repositories.UserRepository;

/**
 * @author santi
 *
 */
public class PortfolioServiceImp implements PortfolioService {
	
	@Autowired
	private PortfolioRepository portfolioRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public List<Portfolio> getPortfolios() {
		return portfolioRepository.findAll() ;
	}

	@Override
	public Portfolio addPortfolio(Portfolio p, String loggedEmail) {
		User currentUser = userRepository.findByEmail(loggedEmail);
	    p.setOwner(currentUser);
		return portfolioRepository.save(p);
	}

	@Override
	public Portfolio findPortfolio(Long id) throws Exception {
		return portfolioRepository.getById(id);
	}

	@Override
	public void deletePortfolio(Long id, String loggedEmail) throws Exception {
		User user = userRepository.findByEmail(loggedEmail);
		 if(portfolioRepository.existsById(id)==false){
	            throw new Exception("Portfolio not exists.");
      }else{
    	  Portfolio p = portfolioRepository.findById(id).get();
      	 if(p.getOwner().equals(user)){
      		portfolioRepository.deleteById(id); 
               }  	
        else {
          throw new Exception("You cannot delete another Portfolio.");
      }}}
		

	@Override
	public void updatePortfolio(Portfolio portfolio, String name, String loggedEmail) throws Exception {
		
		
	}

}
