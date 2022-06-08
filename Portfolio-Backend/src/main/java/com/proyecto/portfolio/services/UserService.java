/**
 * 
 */
package com.proyecto.portfolio.services;

/**
 * @author santi
 *
 */
import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.proyecto.portfolio.models.User;

public interface UserService extends UserDetailsService  {
	public List<User> getUsers();
	public User addUser(User user) throws Exception;
	public User findUser(Long id) throws Exception;
	public User findByEmail(String email) throws Exception;
	public void deleteUser(Long id, String loggedEmail) throws Exception;
	public void updateUser(User user, Long id, String loggedEmail) throws Exception;  

}