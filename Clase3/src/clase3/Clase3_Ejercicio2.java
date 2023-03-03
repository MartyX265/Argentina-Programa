
package clase3;

public class Clase3_Ejercicio2 {
    public static String CodificarMas1(String texto){
        String resultado="";
        String diccionario="abcdefghijklmnñopqrstuvwxyz0";
        for(int i=0;i<texto.length();i++){
            if(texto.charAt(i)=='z'){
               resultado+=diccionario.charAt(diccionario.length()-1);
            }else{
                if(texto.charAt(i)==' '){
                    resultado+=diccionario.charAt(0);
                }else{
                  resultado+=diccionario.charAt(diccionario.indexOf(texto.charAt(i))+1);  
                }
            }
        }
        return resultado;
    }
    public static String DecodificarMenos1(String texto){
        String resultado="";
        String diccionario="abcdefghijklmnñopqrstuvwxyz0";
        for(int i=0;i<texto.length();i++){
            if(texto.charAt(i)=='0'){
               resultado+=diccionario.charAt(diccionario.length()-2);
            }else{
                if(texto.charAt(i)=='a'){
                    resultado+=' ';
                }else{
                  resultado+=diccionario.charAt(diccionario.indexOf(texto.charAt(i))-1);  
                }
            }
        }
        return resultado;
    }
    public static void main(String[] args){
        System.out.println(CodificarMas1("hola que tal"));
        System.out.println(DecodificarMenos1("ipmbarvfaubm"));
    }
}
