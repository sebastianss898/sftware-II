package net.sofware.backendcursojava.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import net.sofware.backendcursojava.shared.dto.UserDTO;

public interface UserServiceInterface extends UserDetailsService{

    public UserDTO createUser(UserDTO userDTO);
    
}
