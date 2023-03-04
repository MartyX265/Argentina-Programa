//Martin Ribotta
package clase3;
/*Dado un vector de números, y un número X, que sume todos los números > X y
retorne el resultado*/

public class Clase3_Ejercicio1C {
    public static int SumaMayor(int[]array,int numero){
        int sumatoria=0;
        
        for(int num:array){
            if(num>numero){
                sumatoria+=num;
            }
        }
        return sumatoria;
    }
    public static void main(String[] args){
        int[] numeros=new int[]{5,8,1,9,79,4,24,87,53,17};
        int num=20;
        System.out.println("La sumatoria de todos los numeros mayores a "+num+" es: "+SumaMayor(numeros,num));
    }
}
