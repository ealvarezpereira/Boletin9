/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b9ej1;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class Contador {
    
    int p = 0, n = 0, c = 0, i, valor;
    Scanner sc = new Scanner (System.in);
    
    public void contadorNum (){
    
        for (i=0;i<10;i++){
            System.out.println("Introduce un valor:");
            valor = sc.nextInt();
            if (valor > 0){
                p++;    
            } else if (valor == 0){    
                c++;
            } else {
                n++;
            }   
        }
        System.out.println("Numeros positivos: "+p+"\nNumeros negativos: "+n+"\nNumero de 0: "+c);
    }
}
