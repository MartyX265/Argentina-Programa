
package clase1;


public class Ejercicio1_PuntoD {
    /*Ejercicio 1 Punto D
  Utilizando la sentencia for, imprima todos los números PARES entre 2 variables “a”
  y “b” en orden inverso*/
    public static void main(String[] args){
        int inicio=1;
        int fin=50;
        
        for(int i=fin;i>inicio;i--){
            if(i%2 ==0){
                System.out.println(i);
            }
        }
    }
}
