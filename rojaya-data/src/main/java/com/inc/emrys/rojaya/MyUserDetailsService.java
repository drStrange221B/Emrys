package com.inc.emrys.rojaya;

import com.inc.emrys.rojaya.converters.MyUserDetails;
import com.inc.emrys.rojaya.model.UserEntity;
import com.inc.emrys.rojaya.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<UserEntity> user = userRepository.findByUserName(userName);

        if(user.isPresent()) {
            return new MyUserDetails(user);
        }else
            throw new UsernameNotFoundException("User not found "+ userName);


    }
}
