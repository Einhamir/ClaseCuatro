/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.registro.clase4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Java
 */
public class MiException extends Exception {

    private int code;
    private String desc;
    private Date date;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDate() {
        
        DateFormat fecha = new SimpleDateFormat("dd-MMMM-yyyy");
        
        return fecha.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public MiException() {
    }

    public MiException(int codig, String descripcion,Date date,String mensaje) {
        super(mensaje); // EL LLAMADO AL SUPER SIEMRPRE DEBE SER LA PRIMER SENTENCIA EN EL METODO
        this.code = codig;
        this.desc = descripcion;
        this.date = date;
    }
    public MiException(String string) {
        super(string); // EL LLAMADO AL SUPER SIEMRPRE DEBE SER LA PRIMER SENTENCIA EN EL METODO
    }

    public MiException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MiException(Throwable thrwbl) {
        super(thrwbl);
    }

    public MiException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}
