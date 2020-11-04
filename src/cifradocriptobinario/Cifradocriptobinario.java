/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradocriptobinario;

import java.util.Scanner;

/**
 *
 * @author cristian_leopooldo
 */
public class Cifradocriptobinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribir mensaje a cifrar");
        Scanner mensaje = new Scanner(System.in); 
        String palabra = mensaje.nextLine();
        
              for(int i =0; i<palabra.length();i++){
              char characterValue = palabra.charAt(i);
              int asciiValue = (int) characterValue;
               System.out.println("NUMERO_ASCII " + asciiValue );
                 
                             
              }
                
    }
    
}
