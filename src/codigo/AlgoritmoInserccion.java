/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Arrays;

/**
 *
 * @author angel
 */
public class AlgoritmoInserccion {
    
    int [] lista1 = {13, 27, 455, 621, 23, 1, 15}; 
    
    public static void main(String[] args) {
        AlgoritmoInserccion ordenacion =new AlgoritmoInserccion();
                
        ordenacion.insercionDirecta(ordenacion.lista1);
        
        System.out.println("Lista ordenada: " + Arrays.toString(ordenacion.lista1));
    }
    
    public void insercionDirecta(int[] numeros) {
        for (int i = 2; i < numeros.length; i++) {//declaro la j fuera del bucle for interior porque necesito utilizar su valor fuera del bucle interior
            
            int aux = numeros[i];          
            int j=0;
            
            for (j = i - 1; j >= 0 && numeros[j] > aux; j--) {//desplaza los números del array en la parte ordenada, hasta que j vale -1 o hasta que es menor que el comparado       
                numeros[j + 1] = numeros[j];               
            }
            
            numeros[j + 1] = aux;//coloca el valor comparado en su posición correspondiente

        }
    }
    
}
