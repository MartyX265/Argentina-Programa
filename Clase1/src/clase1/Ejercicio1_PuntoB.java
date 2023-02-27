/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1;

public class Ejercicio1_PuntoB {
    /*Ejercicio 1 Punto B
        Utilizando la sentencia while, imprima todos los números PARES entre 2 variables “a”
        y “b” */
    public static void main(String[] args){
        int inicio=1;
        int fin=50;
        while(inicio<fin){
            if(inicio%2==0){//Un numero es par si el numero es divisible por 2  
                System.out.println(inicio);
            }
            inicio++;
        }
    }
}
