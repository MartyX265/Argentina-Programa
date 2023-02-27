package clase1;
//Determinar si una persona pertenece al segmento de ingresos altos
/*
Una persona está en el segmento de ingresos altos si cumple con ALGUNA de las siguientes condiciones:
->Tiene ingresos mensuales mayores o iguales a $572400 (Redondeado para simplificar cálculos)
->Posee 3 o más vehículos con una antigüedad de 5 años o menos (suponemos que los vehículos cumplen con la antigüedad)
->Posee 3 o más inmuebles
->Posee una embarcación o una aeronave o posee activos económicos
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int ingresosTotales = 200000;
        short cantidadVehiculos = 0;
        short cantidadInmuebles = 0;
        boolean poseeEmbarcacion = false;
        boolean poseeAeronave = false;
        boolean poseeActivos = false;

        if ((ingresosTotales >= 572400) || 
            (cantidadVehiculos >= 3) || 
            (cantidadInmuebles >= 3) || 
            ((poseeEmbarcacion)||(poseeAeronave)||(poseeActivos))) {
            System.out.println("Usted pertenece al segmento de ingresos altos");
        } else {
            System.out.println("Usted pertenece a otro segmento de ingresos");
        }
    }
}
