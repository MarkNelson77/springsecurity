package biz.global77.springsecurity.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "user")
public class User implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	
	 @Id
	 private Integer id;
	 private String username;
	 private String password;
	 private String role;

	 public String getRole() {
			return role;
	 	}

	 public void setRole(String role) {
			this.role = role;
	 	}

	 public Integer getId() {
	        return id;
	    }
	 
	 public void setId(Integer id) {
	        this.id = id;
	    }
	 
	 public String getUsername() {
	        return username;
	    }
	 
	 public void setUsername(String username) {
	        this.username = username;
	    }
	 
	 public String getPassword() {
	        return password;
	    }
	 
	 public void setPassword(String password) {
	        this.password = password;
	    }
	
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			List<SimpleGrantedAuthority> authorities = new ArrayList<>();
				authorities.add(new SimpleGrantedAuthority(role));
			return authorities;
		}
	 
	    @Override
	   public boolean isAccountNonExpired() {
	        return true;
	    }
	 
	    @Override
	    public boolean isAccountNonLocked() {
	        return true;
	    }
	 
	    @Override
	    public boolean isCredentialsNonExpired() {
	        return true;
	    }
	 
	    @Override
	    public boolean isEnabled() {
	        return true;
	    }
	 
	    @Override
	    public String toString() {
	        return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	    }

}
