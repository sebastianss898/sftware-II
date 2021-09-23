package net.sofware.backendcursojava.services;

import org.springframework.stereotype.Service;
import net.sofware.backendcursojava.shared.dto.UserDTO;

@Service
public class UserService implements UserServiceInterface {

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        // TODO logica de creacion de usuario 
        return null;
    }


}
