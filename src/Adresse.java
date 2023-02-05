import java.util.ArrayList;
import java.util.List;

public class Adresse {
    
    private int id, cp;
    private String localite, rue, num;
    private List<Location> listeLocationsDebut = new ArrayList<>();
    private List<Location> listeLocationsFin = new ArrayList<>();

    public Adresse() {
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getLocalite() {
        return localite;
    }

    public void setLocalite(String localite) {
        this.localite = localite;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public List<Location> getListeLocationsDebut() {
        return listeLocationsDebut;
    }

    public void setListeLocationsDebut(List<Location> listeLocationsDebut) {
        this.listeLocationsDebut = listeLocationsDebut;
    }

    public List<Location> getListeLocationsFin() {
        return listeLocationsFin;
    }

    public void setListeLocationsFin(List<Location> listeLocationsFin) {
        this.listeLocationsFin = listeLocationsFin;
    }

    @Override
    public String toString() {
        return "Adresse [cp=" + cp + ", id=" + id + ", listeLocationsDebut=" + listeLocationsDebut
                + ", listeLocationsFin=" + listeLocationsFin + ", localite=" + localite + ", num=" + num + ", rue="
                + rue + "]";
    }  
}
