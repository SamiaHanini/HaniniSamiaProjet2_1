import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {

    private int id;
    private String mail, nom, prenom, tel;
    private List<Location> locations = new ArrayList<>();
    
    public Client() {
    }

    public Client(int id, String mail, String nom, String prenom, String tel, List<Location> locations) {
        this.id = id;
        this.mail = mail;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.locations = locations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", locations=" + locations + ", mail=" + mail + ", nom=" + nom + ", prenom="
                + prenom + ", tel=" + tel + "]";
    } 
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client c = (Client) o;
        return Objects.equals(mail, c.mail);

    }

    @Override
    public int hashCode() {
        return Objects.hash(mail);
    }
    
}
