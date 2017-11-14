/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b9ej2;

/**
 *
 * @author quique
 */
public class Sumprod {
    
    public void calcularSuma(){
    
        int i;
        int resultado=0;
        for (i=10;i<=90;i++){
        
            resultado = resultado+i;
            
        }
    
        System.out.println("Resultado: "+resultado);
    }
    
    public void calcularProd(){
    
        long i;
        double resultado;
        resultado = 1;
        for (i=10;i<=90;i++){
            resultado = resultado * i;
            
        }
    
        System.out.println("Resultado: "+resultado);
    }
    
}
