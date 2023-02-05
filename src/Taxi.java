import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Taxi{

    private int id;
    private String immatriculation, carburant;
    private float prixKm;
    private List<Location> locations = new ArrayList<>();

    public Taxi() {
    }

    public Taxi(int id, String immatriculation, String carburant, float prixKm, List<Location> locations) {
        this.id = id;
        this.immatriculation = immatriculation;
        this.carburant = carburant;
        this.prixKm = prixKm;
        this.locations = locations;
    }

    

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getImmatriculation() {
        return immatriculation;
    }



    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }



    public String getCarburant() {
        return carburant;
    }



    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }



    public float getPrixKm() {
        return prixKm;
    }



    public void setPrixKm(float prixKm) {
        this.prixKm = prixKm;
    }



    public List<Location> getLocations() {
        return locations;
    }



    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }


    @Override
    public String toString() {
        return "Taxi [carburant=" + carburant + ", id=" + id + ", immatriculation=" + immatriculation + ", locations="
                + locations + ", prixKm=" + prixKm + "]";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taxi t = (Taxi) o;
        return Objects.equals(immatriculation, t.immatriculation);

    }

    @Override
    public int hashCode() {
        return Objects.hash(immatriculation);
    }

}

