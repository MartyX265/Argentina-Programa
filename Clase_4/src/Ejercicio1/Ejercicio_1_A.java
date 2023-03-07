package Ejercicio1;
import java.util.Arrays;
/*
haga un main, donde por parámetro ponga 3 números y una letra que
represente ascendente o descendente y los muestre ordenados por tal criterio
*/
public class Ejercicio_1_A {
    public static String OrdenarNumeros(int nroA, int nroB, int nroC, String modo){
        int[] numeros=new int[]{nroA,nroB,nroC};
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
        System.out.println(OrdenarNumeros(3,5,7,"D"));
    }
}
