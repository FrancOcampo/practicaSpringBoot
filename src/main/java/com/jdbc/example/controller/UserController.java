package com.jdbc.example.controller;

import com.jdbc.example.model.User;
import com.jdbc.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UserController {
    @Autowired
    private UserService us;

    @GetMapping("/usuarioss")
    public void obtenerUsuarios(){
        List<User> listaU = us.obtenerUsuarios();
        for(User u: listaU){
            System.out.println(u.toString());
        }
    }

    @PostMapping
    public void agregarUsuario(@RequestBody User usuario){
        us.agregarUsuario(usuario);
        System.out.println("Usuario agregado con exito!");
    }

    @PostMapping("/hola")
    public void holaMundo(){
        System.out.println("HOLA SPRINGBOOT!!");
    }

}
