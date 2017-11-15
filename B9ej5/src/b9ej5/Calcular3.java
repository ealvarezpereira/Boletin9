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
public class Calcular3 {
    
    public void calcularC(){
        Scanner sc = new Scanner(System.in);
        
        
        //0,1,1,2,3,5,8,13,21
        
        int num1 = 0, num2 = 1, num3;
        System.out.println("Introduce el numero de valores");
        int var = sc.nextInt();
        System.out.print(num1+", "+num2);
        for (int i=0;i<=var;i++){
        
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            
            System.out.print(", "+num3);
            
        
        }
    
    }
}
