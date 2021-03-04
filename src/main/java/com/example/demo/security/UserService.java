package com.example.demo.security;

import com.example.demo.domain.model.User;
import com.example.demo.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<User> user = userRepository.findByName(username);
//        if(!user.isPresent()) throw new UsernameNotFoundException("User Not Found with username: " + username);
        User user = new User();
        user.setName("test");
        user.setId("123");
        user.setPasswordHash("123");
        return UserDetailsImpl.build(user);
    }
}
