
package clase3;
/*Genere una clase que tenga los métodos para realizar la codificación y decodificación
de un string, dado un número de desplazamiento.*/
public class Clase3_Ejercicio2 {
    public static String Codificar(String texto,int desplazamiento){
        String resultado="";
        String abecedario="abcdefghijklmnñopqrstuvwxyz";
        
        for(int i=0;i<texto.length();i++){
            char caracterActual=texto.charAt(i);//Se analiza cada caracter
            if(caracterActual==' '){//Si es un espacio se le coloca el arroba para diferenciarlo
                resultado+='@';
                continue;//Saltar al siguiente ciclo del for
            }
            int indice=abecedario.indexOf(caracterActual);//Guardamos el indice del caracter en referencia a su posicion en el abecedario
            if(indice+desplazamiento>abecedario.length()-1){//Verficamos que el indice mas su desplazamiento no salga del limite
                indice=((indice+desplazamiento)-abecedario.length()-1);//Si se sale del limite calculamos la diferencia y lo colocamos al principio del abecedario
                resultado+=abecedario.charAt(indice);//Añadimos el caracter al String
            }else{
                resultado+=abecedario.charAt(indice+desplazamiento);
            }
        }
        return resultado;
    }
    public static String Decodificar(String texto, int desplazamiento){
        String resultado="";
        String abecedario="abcdefghijklmnñopqrstuvwxyz";
        
        for(int i=0;i<texto.length();i++){
            char caracterActual=texto.charAt(i);
            if(caracterActual=='@'){//Revertimos la codificacion del espacio
                resultado+=' ';
                continue;
            }
            int indice=abecedario.indexOf(caracterActual);
            if(indice-desplazamiento<0){
                indice=(abecedario.length()-1)-(indice-desplazamiento);
                resultado+=abecedario.charAt(indice);
            }else{
                resultado+=abecedario.charAt(indice-desplazamiento);
            }
        }
        return resultado;
    }
    public static void main(String[] args){
       System.out.println(Codificar("hola que tal",1));
       System.out.println(Decodificar("ipmb@rvf@ubm",1));
       System.out.println(Codificar("hola que tal",2));
       System.out.println(Decodificar("jqnc@swg@vcn",2));
    }
}
