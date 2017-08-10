/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.registro.clase4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

/**
 *
 * @author Java
 */
public class ArrayListTest {
    
    public static void main(String[] args) {
        ArrayList arrList = new ArrayList();
      
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);
        
        arrList.size();
        
        System.out.println(arrList.size());
        
        
        ArrayList<Persona> personaList = new ArrayList<Persona>();
        ArrayList<Profesor> profeList = new ArrayList<Profesor>();
        Persona p1 = new Persona();
        p1.setApellido("Rojas");
        p1.setNombre("Marco");
        p1.setEdad(33);
        
        personaList.add(p1);
        
        Profesor prof1 = new Profesor();
        prof1.setNombre("Jorge");
        prof1.setApellido("Lopez");
        prof1.setEdad(30);
        prof1.setMateria("Java 1");
        prof1.setEscuela("Netec");
     
        personaList.add(prof1);
        
        profeList.add(prof1);
        //profeList.add(p1);
        
        for (Profesor p : profeList) {
            System.out.println(p.getMateria());
        }
        
        profeList.forEach((p) -> {
            System.out.println(p.getMateria());
        });
        
        Iterator iterator = profeList.iterator();
        
        while (iterator.hasNext()) {
            System.out.println("");
            Object nextElement = iterator.next();
            
        }
    }
}

