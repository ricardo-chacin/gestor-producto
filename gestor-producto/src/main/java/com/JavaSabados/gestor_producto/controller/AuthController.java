package com.JavaSabados.gestor_producto.controller;

import com.JavaSabados.gestor_producto.dto.AuthResponse;
import com.JavaSabados.gestor_producto.dto.LoginRequest;
import com.JavaSabados.gestor_producto.dto.RegistroRequest;
import com.JavaSabados.gestor_producto.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService s){ this.authService = s; }

    @PostMapping("/register")
    public AuthResponse register(@Valid @RequestBody RegistroRequest req){
        return authService.registrar(req);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest req){
        return authService.login(req);
    }
}