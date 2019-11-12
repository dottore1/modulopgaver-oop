/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modulopgave_19;

/**
 *
 * @author Nichlas
 */
public class Contact {
    String firstname;
    String lastname;
    String email; 
    String phone;
    
    public Contact(String fname, String lname, String email, String phone){
        this.firstname = fname;
        this.lastname = lname;
        this.email = email;
        this.phone = phone;
    }
    @Override
    public String toString(){
        String txt = this.lastname;
        return txt;
    }
}
