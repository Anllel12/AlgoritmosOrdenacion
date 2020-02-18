/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author angel
 */
public class AlgoritmoInserccion {
    
    int [] lista;
    
    
    public static void main(String[] args) {
        AlgoritmoInserccion ordenacion =new AlgoritmoInserccion();
        
        int rango=100000;//numero de numeros con los que probamos
        int[] numeros=ordenacion.numerosRandom(rango);//generamos los numeros
        
        ordenacion.lista=new int[rango];
        
        for (int i = 0; i < rango; i++) {
            ordenacion.lista[i]=numeros[i];
        }
        
        long tiempoInicio=System.currentTimeMillis();
        ordenacion.insercionDirecta(ordenacion.lista);
        long tiempoFinal=System.currentTimeMillis();
        
        System.out.println("Ha tardado: "+(tiempoFinal-tiempoInicio)/1000);
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
    
    public int[] numerosRandom(int dimension){
        int[] numeros=new int[dimension];
        Random r=new Random();
        for (int i = 0; i < dimension; i++) {
            numeros[i]=r.nextInt();
        }
        return numeros;
    }
    
}
