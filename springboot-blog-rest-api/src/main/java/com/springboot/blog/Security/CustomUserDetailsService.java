//package com.springboot.blog.Security;
//
//import com.springboot.blog.entity.User;
//import com.springboot.blog.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class CustomUserDetailsService implements UserDetailsService {
//
//    private final UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String userNameOrEmail) throws UsernameNotFoundException {
//        User user = userRepository.findByUserNameOrEmail(userNameOrEmail, userNameOrEmail)
//                .orElseThrow(() -> new UsernameNotFoundException("user not found with username or email " + userNameOrEmail));
//    }
//}
