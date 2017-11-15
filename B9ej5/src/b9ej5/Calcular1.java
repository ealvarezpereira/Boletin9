/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b9ej5;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class Calcular1 {
    Scanner sc = new Scanner(System.in);
    int numero=2, var, i, calc;
    
    public void calcularA(){ 
        System.out.println("Introduce un número de elementos:"); 
        var = sc.nextInt(); 
        
        System.out.print(numero);
        for (i=2; i<=var; i++){
            calc = numero*i;
            System.out.print(" + "+calc);
        }
    }  
}
