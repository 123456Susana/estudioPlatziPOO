import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    protected Integer pasajero;

    public UberVan(String license, Account driver){
        super(license, driver);
    }

    @Override
    public void setPasajeros(Integer pasajeros) {
        if(pasajeros == 6){
            this.pasajero = pasajeros;
            }else{
                System.out.println("Necesitas asignar 6 pasajeros");
            }
    }
}
