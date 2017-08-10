/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.registro.clase4.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Java
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> dicc = new HashMap<Integer,String>();
        
        dicc.put(20, "ID");
        dicc.put(30, "NOMBRE");
        dicc.put(40, "APELLIDO");
        
        System.out.println(dicc.size());
        
        //HASHMAPS SE RECORREN POR MEDIO DEL ENTRY
        for (Map.Entry<Integer, String> entry : dicc.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println("KEY:"+key);
            System.out.println("VALUE:"+value);
            
        }
    }
}
