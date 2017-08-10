/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.registro.clase4.dao;

/**
 *
 * @author Java
 */
public class accesoDAO {
    //SI EL METODO ARROJA UNA EXCEPTION HACIA EL COMPONENTE QUE LO CONSUMA
    //SE DEBE INDICAR O AVISAR QUE ESTE METODO POSIBLEMENTE PODRIA ARROJAR UNA EXCEPTION
    //ESTO SE HACE POR MEDIO DEL throws Exception
    
    //CUANDO SE DELEGA LA EXCEPTION POR MEDIO DEL throws Exception EL METODO QUE INVOCA AL METODO 
    //DEBE HACERCE CARGO DEL MANEJO DE LA EXCEPTION
    public void connectorBase() throws Exception {
        try{
            System.out.println("Intentando Conectar");
        }
        
        /*
        catch (Exception e){
            //EN EL CATCH PODEMOS ARROJAR UNA EXCEPTION HACIA EL COMPONENTE QUE CONSUMA ESTE METODO
            //PERO SE DEBE DECLARAR CON throws Exception
            throw new Exception(e); 
        }
        */
        //MULTI CATCH
        
        catch (ArithmeticException | ArrayIndexOutOfBoundsException ex){
            
            if(ex instanceof RuntimeException)
            {
                System.out.println("Exception RUNTIME");
            }
        }
        //SI SE EVALUAN VARIAS EXCEPCIONES Exception e DEBERIA SER LA ULTIMA EN EVALUAR POR LA JERARQUIA DE HERENCIA
         catch (Exception e){
            //EN EL CATCH PODEMOS ARROJAR UNA EXCEPTION HACIA EL COMPONENTE QUE CONSUMA ESTE METODO
            //PERO SE DEBE DECLARAR CON throws Exception
            throw new Exception(e); 
        }
        //FINALLY SE EJECUTA SIEMPRE ENTRE O NO EN EL CATCH
        finally{
            System.out.println("BLOQUE FINALLY");
        }
    }
            
}
