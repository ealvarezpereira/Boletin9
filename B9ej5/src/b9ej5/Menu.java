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
public class Menu {
    
    public void menuSwitch(){
        Calcular1 calc1 = new Calcular1();
        Calcular2 calc2 = new Calcular2();
        Calcular3 calc3 = new Calcular3();

        Scanner sc = new Scanner(System.in);
        System.out.println("****Menu****\n1-Serie 1\n2-Serie 2\n3-Serie 3\n0-Salir");
        int op = sc.nextInt();
        while(op == 1 || op == 2 || op == 3){
        switch (op){ 
            case 1: calc1.calcularA();
                break;
            case 2: calc2.calcularB();
                break;
            case 3: calc3.calcularC();
                break;
            default: System.out.println("Error");
 
        }
        
        System.out.println("\n\n****Menu****\n1-Serie 1\n2-Serie 2\n3-Serie 3\n0-Salir");
        
        op = sc.nextInt();
        }
    
    }
    
}
