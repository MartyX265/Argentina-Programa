
package Ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

/*haga un main, donde por consola ponga 3 números y una letra que
represente ascendente o descendente y los muestre ordenados por tal criterio
 */
public class Ejercicio_1_B {
    public static String OrdenarNumeros(int[] numeros,String modo){
        int aux;
        switch(modo){
            case "A"->{
                for(int i=0;i<numeros.length-1;i++){//Ordenamiento Burbuja Ascendente
                    for(int j=0;j<numeros.length-i-1;j++){
                        if(numeros[j]<numeros[j+1]){
                            aux=numeros[j];
                            numeros[j]=numeros[j+1];
                            numeros[j+1]=aux;
                        }
                    }
                }
            }
            case "D"->{
                for(int i=0;i<numeros.length-1;i++){//Ordenamiento Burbuja Descendente
                    for(int j=0;j<numeros.length-i-1;j++){
                        if(numeros[j]>numeros[j+1]){
                            aux=numeros[j];
                            numeros[j]=numeros[j+1];
                            numeros[j+1]=aux;
                        }
                    }
                }
            }
            default->{
                return "Error";
            }
        }
        return Arrays.toString(numeros);
    }
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        String opcion;
        int[] numeros=new int[3];
        System.out.println("Ingrese el primer numero: ");
        numeros[0]=entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numeros[1]=entrada.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        numeros[2]=entrada.nextInt();
        System.out.println("Ingrese (A) para orden Ascendente o (B) para Descendente");
        opcion=entrada.next();
        entrada.close();
    }
}
