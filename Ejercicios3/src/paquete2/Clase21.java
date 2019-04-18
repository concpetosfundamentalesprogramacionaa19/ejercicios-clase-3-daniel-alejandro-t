/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Clase21 {
    
    public static void main(String[] args) {
        
        boolean bandera;
        int valor1 = 1;
        int valor2 = 10;
        
        bandera = valor1 < valor2;
        
        System.out.printf("Valor 1 es mayor que valor2?: %s\n", bandera);
        
        bandera = (valor1 < valor2) & (valor1 > valor2); // Producto lógico – \AND (binario)
        //& = AND
        System.out.printf("Si valor 1 es menor que valor2 y valor1 es mayor que valor 2: %s\n", bandera);
        
        bandera = (valor1 < valor2) | (valor1 > valor2);
        
        System.out.printf("Si valor 1 es menor que valor2 o valor1 es mayor que valor 2: %s\n", bandera);
        
        bandera = !((valor1 < valor2) | (valor1 > valor2)); // Negación - NOT (unario)
        //El operador ! = diferente
        System.out.printf("%s\n", bandera);
    }
    
}
