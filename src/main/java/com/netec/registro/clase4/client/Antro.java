/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.registro.clase4.client;

import com.netec.registro.clase4.MiException;
import java.util.Date;

/**
 *
 * @author Java
 */
public class Antro {
    
    public static void main(String[] args){
       
        Antro a = new Antro();
        try{
            a.validaEntrar("JUAN", 17);
        }
        catch(MiException e){
            System.out.println(e.getMessage());
            System.out.println("Codigo Error: "+e.getCode());
            System.out.println("Fecha: "+e.getDate());
            System.out.println("Descripcion: "+e.getDesc());
            
        }
        
    }
    
    public boolean validaEntrar(String name, int edad) throws MiException
    {
        boolean paso = false;
        if(edad >= 18)
        {
            System.out.println("PASA");
            paso = true;
        }
        else
        {
            
            throw new MiException(001, "Error de Validación", new Date(), "Error de Edad");
            
        }
        
       return paso;
    }
}
