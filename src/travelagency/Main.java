package travelagency;

/**
 *
 * @author Jhon
 */
public class Main {
    public static void main(String[] args) {
        TravelAgency Aviatur = new TravelAgency("Aviatur");
        
        if (Aviatur.hay_memoria()) {
            System.out.println("Hay memoria disponible!");
            Aviatur.llenar();
        }else{
            System.out.println("Lo sentimos, no hay memoria en este momento.");
        }
        Aviatur.lista();
    }
}
