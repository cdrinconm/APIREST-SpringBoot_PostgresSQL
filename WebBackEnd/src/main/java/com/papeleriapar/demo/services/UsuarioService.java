package com.papeleriapar.demo.services;

import com.papeleriapar.demo.repositories.UsuarioRepository;
import com.papeleriapar.demo.models.UsuarioModel;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario); // Si se envia el id del usuario, se actualiza el usuario.
    }
    
    public UsuarioModel obtenerPorId(Integer id) { // Optional por si depronto no encuentra el id.
        return usuarioRepository.findById(id);
    }
    
    public ArrayList<UsuarioModel> obtenerPorRol(Integer rol) {
        return usuarioRepository.findByRol(rol);
    }
    
    public boolean eliminarUsuario(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return true;
        }
    }
}
