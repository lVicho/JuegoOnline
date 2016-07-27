/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journaldev.prime.faces.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author David
 */
@ManagedBean
@SessionScoped
public class InicioBean implements Serializable {

    private Boolean estadoRegistro = Boolean.FALSE;
    private String user;
    private String password;
    
    private String userRegistro;
    private String passwordRegistro;
    private String emailRegistro;
    private String razaRegistro;

    public Boolean getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(Boolean estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRegistro() {
        return userRegistro;
    }

    public void setUserRegistro(String userRegistro) {
        this.userRegistro = userRegistro;
    }

    public String getPasswordRegistro() {
        return passwordRegistro;
    }

    public void setPasswordRegistro(String passwordRegistro) {
        this.passwordRegistro = passwordRegistro;
    }

    public String getEmailRegistro() {
        return emailRegistro;
    }

    public void setEmailRegistro(String emailRegistro) {
        this.emailRegistro = emailRegistro;
    }

    public String getRazaRegistro() {
        return razaRegistro;
    }

    public void setRazaRegistro(String razaRegistro) {
        this.razaRegistro = razaRegistro;
    }
    
    
    
    public void cambiarAEstadoRegistro(ActionEvent actionEvent) {
        setEstadoRegistro(Boolean.TRUE);
    }

    public void cambiarAEstadoLogin(ActionEvent actionEvent) {
        setEstadoRegistro(Boolean.FALSE);
    }
    
    public void iniciarSesion(ActionEvent actionEvent) {
       
    }
    
    
}
