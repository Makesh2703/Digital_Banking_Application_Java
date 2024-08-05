package com.wecp.progressive.controller;


import com.wecp.progressive.dto.LoginRequest;
import com.wecp.progressive.dto.LoginResponse;
import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.jwt.JwtUtil;
import com.wecp.progressive.service.CustomerLoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/customer")
public class CustomerLoginController {

    private final CustomerLoginService customerLoginService;

    private final AuthenticationManager authenticationManager;

    private final JwtUtil jwtUtil;

    @Autowired
    public CustomerLoginController(CustomerLoginService customerLoginService, JwtUtil jwtUtil, AuthenticationManager authenticationManager ) {
        this.customerLoginService = customerLoginService;
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/register")
    public ResponseEntity<Customers> registerUser(@RequestBody Customers user) {
        return ResponseEntity.ok(customerLoginService.createUser(user));
    }

    @PostMapping("/login")
    public ResponseEntity loginUser(@RequestBody LoginRequest loginRequest) {
        try {

            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
            );
        } catch (AuthenticationException e) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid username or password", e);
        }
        final UserDetails userDetails = customerLoginService.loadUserByUsername(loginRequest.getUsername());
        Customers foundUser = customerLoginService.getUserByName(loginRequest.getUsername());
        final String token = jwtUtil.generateToken(loginRequest.getUsername());
        String role = foundUser.getRole();
        Integer userId = foundUser.getCustomerId();
        //this.userService.getUser(u);
        System.out.println("User Roles: " + role);
        return ResponseEntity.ok(new LoginResponse(token, role,userId));
    }
}