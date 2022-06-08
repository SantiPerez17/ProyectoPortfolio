/**
 * 
 */
package com.proyecto.portfolio.models;

import java.util.ArrayList;
/**
 * @author santi
 *
 */
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PreRemove;
import javax.persistence.Table;

/**
 * @author Santiago
 *
 */
@Entity
@Table(name = "portfolios")
public class Portfolio {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    
	    @OneToOne(fetch = FetchType.EAGER)
	    @JoinColumn
	    private User owner;
	    
	    @OneToMany(fetch = FetchType.EAGER)
	    @JoinColumn
	    private List<InfoPersonal> infoPersonal;
	    

		/**
		 * @return the infoPersonal
		 */
		public List<InfoPersonal> getInfoPersonal() {
			return infoPersonal;
		}

		/**
		 * @param infoPersonal the infoPersonal to set
		 */
		public void setInfoPersonal(List<InfoPersonal> infoPersonal) {
			this.infoPersonal = infoPersonal;
		}

		public Long getId() {
			return id;
		}
		
		@PreRemove
		public void nullificarPortafolios() {
			this.owner=null;
		}
		
		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public User getOwner() {
			return owner;
		}

		public void setOwner(User owner) {
			this.owner = owner;
		}


}
