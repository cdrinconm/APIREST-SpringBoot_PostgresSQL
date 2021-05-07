/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.papeleriapar.demo.controllers;

import com.papeleriapar.demo.models.UsuarioModel;
import com.papeleriapar.demo.services.UsuarioService;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }
    
    @GetMapping( path="/{id}" )
    public UsuarioModel obtenerUsuarioPorId(@PathVariable("id") Integer id){
        return usuarioService.obtenerPorId(id);
    }
    
    @GetMapping(path="/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorRol(@RequestParam("rol") Integer rol){
        return usuarioService.obtenerPorRol(rol);
    }
    
    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return usuarioService.guardarUsuario(usuario);
    }
    
    @DeleteMapping( path="/{id}" )
    public String eliminarUsuarioPorId(@PathVariable("id") Long id){
        boolean ok = usuarioService.eliminarUsuario(id);
        if(ok){
            return "Se eliminó el usuario con id: " + id;
        }else{
            return "No se pudo eliminar el usuario con id: " + id;
        }
    }
}
