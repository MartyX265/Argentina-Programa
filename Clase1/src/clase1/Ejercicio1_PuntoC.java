
package clase1;
class Ejercicio1_PuntoC {
    /*Ejercicio 1 Punto C
  Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
  y “b” utilizando una variable extra para imprimir numeros pares o impares*/
    public static void main(String[] args){
        int inicio=1;
        int fin=50;
        String mostrarImpar="SI"; //Colocar SI/NO
        switch(mostrarImpar){
            case "SI" -> {
                while(inicio<fin){
                    if(inicio%2 != 0){
                        System.out.println(inicio);
                    }
                    inicio++;
                }
            }
            case "NO" ->{
                while(inicio<fin){
                    if(inicio%2==0){
                        System.out.println(inicio);
                    }
                    inicio++;
                }
            }
        }
    }
}
