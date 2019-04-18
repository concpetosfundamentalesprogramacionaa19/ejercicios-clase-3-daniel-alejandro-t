/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetePrincipal2;
import paqueteDatos.variable;
/**
 *
 * @author daniel
 */
public class principal {
    public static void main(String []Args){
    //    Scanner entrada=new Scanner (System.in);
        
        double resultado;
        resultado = variable.numero1 + variable.numero2;
        
        System.out.printf("El resultado es: %.1f\n", resultado);
        
        double resultado2;
        resultado2 = variable.numero1 + variable.numero2;
        
        System.out.printf("El resultado es: %.1f\n", resultado2);
        
    }
    
}
