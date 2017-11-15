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
public class Calcular2 {
    
    public void calcularB(){
    Scanner sc = new Scanner(System.in);
    int num;
    
    System.out.println("Introduce un valor");
    int var = sc.nextInt();
    for(num = 1;num<=var;num++)
        if (num%2 == 0){
            System.out.print(" + "+num);
        } else{
            System.out.print(" - "+num);
        }
    }   
}
