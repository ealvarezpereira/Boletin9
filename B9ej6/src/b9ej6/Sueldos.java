/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b9ej6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author quique
 */
public class Sueldos {
    Scanner sc = new Scanner(System.in);
    double sueldo;
    
    public void calcularSueldo(){
    
        int ntrab = 1;
        int count=0;
        double count2=0;
        double count3=0;
        System.out.println("Introduce el sueldo del trabajador "+ntrab);
        sueldo = sc.nextDouble();
        if (sueldo>0){count2++;}
        while(sueldo > 0){
            ntrab++;
            System.out.println("Introduce el sueldo del trabajador "+ntrab);
            sueldo = sc.nextDouble();
            if (sueldo>0){count2++;}
            if (sueldo >= 1000 && sueldo <= 1750){
            count++;
            }   
            
            if (sueldo <1000){
                count3++;
            }
        }
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("Numero de trabajadores que cobran entre 1000 y 1750: "+count);
        System.out.println("Porcentaje: "+df.format((count3/count2)*100)+"%");
    }
    
    
    
    
}
