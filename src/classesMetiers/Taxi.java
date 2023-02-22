package classesMetiers;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
public class Taxi{

    /**
     * identifiant du taxi
     */
    private int id;
    /**
     * immatriculation du taxi
     * carburant du taxi
     */
    private String immatriculation, carburant;
    /**
     * prixKm prix au kilomètre
     */
    private float prixKm;
    /**
     * liste de locations
     */
    private List<Location> locations = new ArrayList<>();

    public Taxi() {
    }

    /**
     * constructeur paramétré
     * @param id = identifiant du taxi
     * @param immatriculation = immatriculation du taxi
     * @param carburant = carburant du taxi
     * @param prixKm = prix au kilomètrz
     */

    public Taxi(int id, String immatriculation, String carburant, float prixKm) {
        this.id = id;
        this.immatriculation = immatriculation;
        this.carburant = carburant;
        this.prixKm = prixKm;
    }


    /**
     * getter identifiant
     * @return id identifiant
     */
    public int getId() {
        return id;
    }

    /**
     * setter identifiant
     * @param id identifiant
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter immatriculation
     * @return immatriculation
     */
    public String getImmatriculation() {
        return immatriculation;
    }


    /**
     * setter immatriculation
     * @param immatriculation
     */
    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    /**
     * getter carburant
     * @return carburant
     */
    public String getCarburant() {
        return carburant;
    }

    /**
     * setter carburant
     * @param carburant
     */
    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }


    /**
     * getter prix au km
     * @return prixKm prix au km
     */
    public float getPrixKm() {
        return prixKm;
    }

    /**
     * setter prix au km
     * @param prixKm prix au km
     */

    public void setPrixKm(float prixKm) {
        this.prixKm = prixKm;
    }


    /**
     * getter liste des locations
     * @return locations
     */
    public List<Location> getLocations() {
        return locations;
    }


    /**
     * setter des locations
     * @param locations
     */
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    /**
     * methode to string
     * @return totalité des informations
     */

    @Override
    public String toString() {
        return "classesMetiers.Taxi [carburant=" + carburant + ", id=" + id + ", immatriculation=" + immatriculation + ", locations="
                + locations + ", prixKm=" + prixKm + "]";
    }

    /**
     * méthode equals
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taxi t = (Taxi) o;
        return Objects.equals(immatriculation, t.immatriculation);

    }

    /**
     *methode hashCode
     * @return integer
     */
    @Override
    public int hashCode() {
        return Objects.hash(immatriculation);
    }

}

