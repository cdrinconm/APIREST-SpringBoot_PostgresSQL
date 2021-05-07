/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.papeleriapar.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.papeleriapar.demo.models.UsuarioModel;
import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long>{
    public abstract ArrayList<UsuarioModel> findByRol(Integer rol);
    public abstract UsuarioModel findById(Integer id);
}
