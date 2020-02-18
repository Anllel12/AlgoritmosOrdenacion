package codigo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Jorge Cisneros
 */
public class AlgoritmoBurbuja {

    
    int [] lista; 
             
             
    public void ordenacionBurbuja(int[] numeros) {
        //el método recibe un array de números
        //y lo ordenará mediante el algoritmo de la burbuja
        for (int j = 0; j < numeros.length; j++) {
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    //si se cumple, intercambio los valores de i e i+1
                    int aux = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = aux;
                }
            }
        }
    }
       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlgoritmoBurbuja ordenacion =new AlgoritmoBurbuja();
        
        int rango=10000;//numero de numeros con los que probamos
        int[] numeros=ordenacion.numerosRandom(rango);//generamos los numeros
        
        ordenacion.lista=new int[rango];
        
        for (int i = 0; i < rango; i++) {
            ordenacion.lista[i]=numeros[i];
        }
        
        long tiempoInicio=System.currentTimeMillis();
        ordenacion.ordenacionBurbuja(ordenacion.lista);
        long tiempoFinal=System.currentTimeMillis();
        
        System.out.println("Ha tardado: "+(tiempoFinal-tiempoInicio));
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