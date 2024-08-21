package com.MakerSharks.ManufactureApi.security;



import com.MakerSharks.ManufactureApi.user.User;
import com.MakerSharks.ManufactureApi.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(userEmail).orElseThrow(()->new UsernameNotFoundException("user is not found"));
        log.info("Loaded user: " + user.getUsername() + ", Authorities: " + user.getAuthorities());
        return user;
    }


}
