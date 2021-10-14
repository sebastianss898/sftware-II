package net.sofware.backendcursojava.services;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import net.sofware.backendcursojava.UserRepository;
import net.sofware.backendcursojava.entities.UserEntity;
import net.sofware.backendcursojava.shared.dto.UserDTO;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder bcCryptPasswordEncoder;

    @Override
    public UserDTO createUser (UserDTO userDTO){

        if(userRepository.findUserByEmail(userDTO.getEmail()) != null){
            throw new RuntimeException("Ususario ya existe ");
        }

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDTO, userEntity);

        userEntity.setEncryptedPasword(bcCryptPasswordEncoder.encode(userDTO.getPassword()));
        
        UUID userid = UUID.randomUUID();
        userEntity.setUserid(userid.toString());


        UserEntity storedUserDetail = userRepository.save(userEntity);

        userRepository.save(userEntity);

        UserDTO userToReturn = new UserDTO();
        BeanUtils.copyProperties(storedUserDetail, userToReturn);


        return userToReturn ;
    }

    @Override
    public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }


}
