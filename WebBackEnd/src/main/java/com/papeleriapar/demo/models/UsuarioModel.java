/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.papeleriapar.demo.models;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class UsuarioModel {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String nombres;
    private String apellidos;
    private int tipo_documento;
    private String numero_documento;
    private String usuarionombre;
    private String pass;
    private String estado;
    private int rol;
    private String desvincular;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTipodocumento() {
        return tipo_documento;
    }

    public void setTipodocumento(int tipodocumento) {
        this.tipo_documento = tipodocumento;
    }

    public String getNumerodocumento() {
        return numero_documento;
    }

    public void setNumerodocumento(String numerodocumento) {
        this.numero_documento = numerodocumento;
    }

    public String getUsuarionombre() {
        return usuarionombre;
    }

    public void setUsuarionombre(String usuarionombre) {
        this.usuarionombre = usuarionombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getDesvincular() {
        return desvincular;
    }

    public void setDesvincular(String desvincular) {
        this.desvincular = desvincular;
    }
}
