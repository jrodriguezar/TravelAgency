package travelagency;

/**
 *
 * @author Jhon
 */
public class TravelAgency {

    private String name;
    private Hotel[] knownhotels;
    private Travel[] offeredtravels;
    private Airport[] airports;

    public TravelAgency(String name) {
        this.name = name;
        knownhotels = new Hotel[4];
        offeredtravels = new Travel[9];
        airports = new Airport[4];
    }

    public boolean vacio1() {
        for (int i = 0; i < 9; i++) {
            if (offeredtravels[i] == null) {
                return true;
            }
        }
        return false;
    }

    public boolean vacio2() {
        for (int i = 0; i < 4; i++) {
            if (knownhotels[i] == null) {
                return true;
            }
        }
        return false;
    }

    public boolean vacio3() {
        for (int i = 0; i < 4; i++) {
            if (airports[i] == null) {
                return true;
            }
        }
        return false;
    }

    public boolean hay_memoria() {
        if (vacio1()) {
            if (vacio2()) {
                if (vacio3()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void anadir_hotel(Hotel hotel) {
        for (int i = 0; i < 4; i++) {
            if (knownhotels[i] == null) {
                this.knownhotels[i] = hotel;
                break;
            }
        }

    }
    
    public void anadir_travel(Travel travel){
        for (int i = 0; i < 9; i++) {
            if (offeredtravels[i] == null) {
                offeredtravels[i] = travel;
                break;
            }
        }
    }
    
    public void anadir_airport(Airport airport){
        for (int i = 0; i < 4; i++) {
            if (airports[i] == null) {
                airports[i] = airport;
                break;
            }
        }
    }
    
    public void llenar(){
        Date start = new Date(22, 3, 2017);
        Hotel hotel = new Hotel("Fontanar", "CRA. 21a #159a-28");
        Travel viaje = new Travel(start, 30, hotel);        
        Airport salida = new Airport("Jose Maria Cordoba");
        Airport llegada = new Airport("Aeropuertoel Dorado");
        viaje.insertar_outbond(1345, start, start, salida, llegada);
        viaje.insertar_return(1355, start, start, llegada, salida);
        anadir_hotel(hotel);
        anadir_travel(viaje);
        anadir_airport(salida);
        anadir_airport(llegada);
    }
    
    public void lista(){
        int a = 1;
        for (int i = 0; i < 9; i++) {
            if (offeredtravels[i] != null) {
                System.out.println("Vuelo " + a);
                System.out.println("El numero del vuelo de la reserva de salida es: " + offeredtravels[i].getOutbond().getFlightnumber());
                System.out.println("La descripcion del aeropuerto de salida es: " + offeredtravels[i].getOutbond().getFrom().getDescription());
                System.out.println("El numero del vuelo de la reserva de retorno es: " + offeredtravels[i].getReturnd().getFlightnumber());
                System.out.println("La descripcion del aeropuerto de retorno es: " + offeredtravels[i].getReturnd().getFrom().getDescription());
                a++;
            }
        }
    }
}
