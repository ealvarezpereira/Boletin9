/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b9ej4;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class TablaMultiplicar {
    
    int cond; double numero, mult;
    Scanner sc = new Scanner(System.in);
    
    public void calcularTabla(){
        System.out.println("****MENU****\n1-Empezar\n2-Salir");
        cond = sc.nextInt();

        while (cond == 1){
                System.out.println("Introduce un valor");
                numero = sc.nextDouble();
                
                for (int i=0;i<=10;i++){
                mult= numero*i;
                System.out.println(numero+" x "+i+" = "+mult);
                }
                
                System.out.println("\n\n****MENU****\n1-Empezar\n2-Salir");
                cond = sc.nextInt();
        
        }
    }    
}
    

