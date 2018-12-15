package com.andrushenko.security;

import com.andrushenko.model.User;
import com.andrushenko.service.UserService;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.inject.Inject;

public class AuthProviderImpl implements AuthenticationProvider {
    @Inject
    private UserService userService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        User user = userService.getByEmail(authentication.getName());
        if (user == null) {
            throw new UsernameNotFoundException("Cant obtain user with this email!");
        }
        if (!user.getPassword().equals(authentication.getCredentials())) {
            throw new BadCredentialsException("Wrong password!");
        }
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
