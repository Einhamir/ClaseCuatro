/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.registro.clase4.order;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Java
 */
public class TestOrder {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.nombre = "Jorge";
        alumno.edad = 20;
        
        Alumno alumno2 = new Alumno();
        alumno2.nombre = "Luis";
        alumno2.edad = 21;
        
        Alumno alumno3 = new Alumno();
        alumno3.nombre = "Angel";
        alumno3.edad = 40;
        
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        
        Collections.sort(alumnos);
        System.out.println("************");
        System.out.println("orden");
        System.out.println(alumnos);
    }
}
