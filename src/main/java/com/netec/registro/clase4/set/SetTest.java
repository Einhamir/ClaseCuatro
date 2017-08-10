/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.registro.clase4.set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Java
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<>();
        
        lista.add("h");
        lista.add("i");
        lista.add("j");
        lista.add("k");
        lista.add("l");
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        lista.add("e");
        lista.add("f");
        lista.add("g");
        
        Set<Integer> lista2;
        lista2 = new HashSet<Integer>();
        
        lista2.add(10);
        lista2.add(9);
        lista2.add(8);
        lista2.add(7);
        lista2.add(6);
        lista2.add(5);
        lista2.add(4);
        lista2.add(3);
        lista2.add(2);
        
        lista.forEach((item) -> {
            System.out.println(item);
        });
        
        lista2.forEach(item -> {
            System.out.println(item);
        });
    }
}
