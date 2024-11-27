package com.jdbc.example.service;

import com.jdbc.example.model.User;

import com.jdbc.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository ur;

    public List<User> obtenerUsuarios(){
        return ur.findAll();
    }

    public void agregarUsuario(User usuario){
        ur.save(usuario);
    }
    /*
    public User obtenerUsuarioID(int id){
    }

    public void actualizarUsuario(Usuario usuario){

    }

    public void eliminarUsuario(int id){

    }

    public int getUltimoId(){

    }*/

}
