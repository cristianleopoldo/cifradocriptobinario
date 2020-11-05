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
        Scanner leer = new Scanner(System.in);
        char opc;
        String cadena;
        
        System.out.println("Escoge una opccion"+"\n1.-Cifrar Mensaje"+"\n2.-Descifrar Mensaje");
        opc=leer.nextLine().charAt(0);
       
        // TODO code application logic here
        System.out.println("Escribir mensaje a cifrar");
        Scanner mensaje = new Scanner(System.in); 
        String palabra = mensaje.nextLine();
        
              for(int i =0; i<palabra.length();i++){
              char characterValue = palabra.charAt(i);
              int asciiValue = (int) characterValue;
              // System.out.println("NUMERO_ASCII " + asciiValue );
                 
              int exp, digito;
              double binario;

                            
    while(asciiValue <0);
    exp=0;
    binario=0;
    while(asciiValue!=0){
	digito = asciiValue %2;
	binario = binario + digito * Math.pow(10, exp);
	exp++;
	asciiValue = asciiValue/2;

       }

         System.out.print("0"+(int)binario +"");
    }
      
     String W = "00000000";        
    int contador = 0;
         if(W.charAt(7)=='1'){
	contador =contador + 1;
} 
        if(W.charAt(6)=='1'){
	contador =contador + 2;
} 
        if(W.charAt(5)=='1'){
	contador =contador + 4;
} 
        if(W.charAt(4)=='1'){
	contador =contador + 8;
} 
        if(W.charAt(3)=='1'){
	contador =contador + 16;
} 
        if(W.charAt(2)=='1'){
	contador =contador + 32;
} 
        if(W.charAt(1)=='1'){
	contador =contador + 64;
} 
        if(W.charAt(0)=='1'){
	contador =contador + 128;
} 
        System.out.println();
        System.out.println(contador);
    
  System.out.println("Escribir mensaje a desifrar");
        Scanner mensaj = new Scanner(System.in); 
        String palabr = mensaj.nextLine();
    }
     String W = "00000000";  
    }



 
                             
              

    
    

