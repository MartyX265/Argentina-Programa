//Martin Ribotta
package clase3;
/*Dados 3 números y un orden (ascendente o decreciente) que ordene los
mismos y los retorne en un vector de 3*/
import java.util.Arrays;
public class Clase3_Ejercicio1B {
    public static int[] Ascendente(int nroA,int nroB,int nroC){
        int[] numeros=new int[]{nroA,nroB,nroC}; //Ordenamiento Burbuja Ascendente
        int aux;
        for(int i=0;i<numeros.length-1;i++){
            for(int j=0;j<numeros.length-i-1;j++){
                if(numeros[j]<numeros[j+1]){
                    aux=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=aux;
                }
            }
        }
        return numeros;
    }
    public static int[] Descendente(int nroA,int nroB,int nroC){
        int[] numeros=new int[]{nroA,nroB,nroC}; //Ordenamiento Burbuja Descendiente
        int aux;
        for(int i=0;i<numeros.length-1;i++){
            for(int j=0;j<numeros.length-i-1;j++){
                if(numeros[j]>numeros[j+1]){
                    aux=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=aux;
                }
            }
        }
        return numeros;
    }
    
    public static void main(String[] args){
        System.out.println("Array Ascendente: "+Arrays.toString(Ascendente(5,1,7)));
        System.out.println("Array Descendente: "+Arrays.toString(Descendente(12,-6,-90)));
    }
}
