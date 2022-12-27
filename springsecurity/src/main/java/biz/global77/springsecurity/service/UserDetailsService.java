package biz.global77.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import biz.global77.springsecurity.model.User;
import biz.global77.springsecurity.repository.UserRepository;
 
@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
 
    @Autowired
    private UserRepository repository;
 
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
 
        User user = repository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
 
        return user;
    }
 
}