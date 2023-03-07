
package Ejercicio1;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio_1_C {
    /*
    haga un main, donde por consola ponga 3 números y una letra que
represente ascendente o descendente y los muestre ordenados por tal criterio
    */
    public static String OrdenarNumeros(Integer nroA,Integer nroB,Integer nroC,String modo){
        Integer aux;
        Integer[] numeros=new Integer[]{nroA,nroB,nroC};
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
        Integer nroA=null;//Cambiar null por otro entero a preferencia
        Integer nroB=null;
        Integer nroC=null;
        String opcion="";
        Scanner entrada=new Scanner(System.in);
        do{
            if(nroA !=null){//Si los valores no estan definidos pues se le pedira al usuario que ingrese datos
                break;
            }
            System.out.println("Ingrese el primer numero: ");
            nroA=entrada.nextInt();
        }while(true);
        do{
            if(nroB!=null){
                break;
            }
            System.out.println("Ingrese el segundo numero: ");
            nroB=entrada.nextInt();
        }while(true);
        do{
            if(nroC!=null){
                break;
            }
            System.out.println("Ingrese el tercer numero: ");
                nroC=entrada.nextInt();
        }while(true);
        do{
            if(!opcion.isEmpty()){
                break;
            }
            System.out.println("Ingrese (A) para orden Ascendente o (B) para Descendente");
            opcion=entrada.next();
            entrada.close();
        }while(true);
        System.out.println(OrdenarNumeros(nroA,nroB,nroC,opcion));
    }
}
