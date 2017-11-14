package b9ej3;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class Area {
    
    int base, altura, area;
    
    public void calcularArea(){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la base");
        
        base = sc.nextInt();
        
        while (base<0){
            System.out.println("Error, la base no puede ser negativa.\nIntroduce la base.");
            base = sc.nextInt();
        }
    
        System.out.println("Introduce la altura");
        
        altura = sc.nextInt();
        
        while (altura<0){
            System.out.println("Error, la altura no puede ser negativa.\nIntroduce la altura.");
            altura = sc.nextInt();
        }
        System.out.println( area = base*altura);
    } 
}
