import java.util.ArrayList;
import java.util.List;

public class Adresse {

    /**
     * id de l'adresse
     * code postal
     */
    private int id, cp;
    /**
     * localite
     * rue
     * numéro
     */
    private String localite, rue, num;
    /**
     * liste des locations de début
     * liste des locations de fin
     */
    private List<Location> listeLocationsDebut = new ArrayList<>();
    private List<Location> listeLocationsFin = new ArrayList<>();


    public Adresse() {
    }

    /**
     *  constructeur paramétré
     *
     * @param id = identifiant de l'adresse
     * @param cp = code postal
     * @param localite = localite
     * @param rue = nom de la rue
     * @param num = numero
     * @param listeLocationsDebut = liste des locations de début
     * @param listeLocationsFin = liste des locations de fin
     */
    public Adresse(int id, int cp, String localite, String rue, String num, List<Location> listeLocationsDebut,
            List<Location> listeLocationsFin) {
        this.id = id;
        this.cp = cp;
        this.localite = localite;
        this.rue = rue;
        this.num = num;
        this.listeLocationsDebut = listeLocationsDebut;
        this.listeLocationsFin = listeLocationsFin;
    }

    /**
     * getter identifiant
     * @return id identifiant de l'adresse
     */
    public int getId() {
        return id;
    }

    /**
     * setter identifiant
     * @param id identifiant de l'adresse
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter code postal
     * @return cp code postal
     */
    public int getCp() {
        return cp;
    }

    /**
     * setter code postal
     * @param cp code postal
     */
    public void setCp(int cp) {
        this.cp = cp;
    }

    /**
     * getter localite
     * @return localite
     */
    public String getLocalite() {
        return localite;
    }

    /**
     * setter localite
     * @param localite
     */
    public void setLocalite(String localite) {
        this.localite = localite;
    }

    /**
     * getter rue
     * @return rue
     */
    public String getRue() {
        return rue;
    }

    /**
     * setter rue
     * @param rue
     */
    public void setRue(String rue) {
        this.rue = rue;
    }

    /**
     * getter numéro de rue
     * @return num numéro de rue
     */
    public String getNum() {
        return num;
    }

    /**
     * setter numéro de rue
     * @param num numéro de rue
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * getter liste des locations de début
     * @return listeLocationsDebut liste des locations de début
     */
    public List<Location> getListeLocationsDebut() {
        return listeLocationsDebut;
    }

    /**
     * setter liste des locations de début
     * @param listeLocationsDebut liste des locations de début
     */
    public void setListeLocationsDebut(List<Location> listeLocationsDebut) {
        this.listeLocationsDebut = listeLocationsDebut;
    }

    /**
     * getter liste des locations de fin
     * @return getListeLocationsFin liste des locations de fin
     */

    public List<Location> getListeLocationsFin() {
        return listeLocationsFin;
    }

    /**
     * setter liste des locations de fin
     * @param listeLocationsFin liste des locations de fin
     */
    public void setListeLocationsFin(List<Location> listeLocationsFin) {
        this.listeLocationsFin = listeLocationsFin;
    }

    /**
     *méthode to String
     *
     * @return informations complètes
     */
    @Override
    public String toString() {
        return "Adresse [cp=" + cp + ", id=" + id + ", listeLocationsDebut=" + listeLocationsDebut
                + ", listeLocationsFin=" + listeLocationsFin + ", localite=" + localite + ", num=" + num + ", rue="
                + rue + "]";
    }  
}
