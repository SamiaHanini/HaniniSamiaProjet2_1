package classesMetiers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {

    /**
     * identifiant du client
     */
    private int id;
    /**
     * mail du client
     * nom du client
     * prenom du client
     * numéro de téléphone du client
     */
    private String mail, nom, prenom, tel;
    /**
     * liste des locations
     */
    private List<Location> locations = new ArrayList<>();
    
    public Client() {
    }

    /**
     * constructeur paramétré
     *
     * @param id = identifiant client
     * @param mail = mail client
     * @param nom = nom client
     * @param prenom = prenom client
     * @param tel = numéro de téléphone du client
     */

    public Client(int id, String mail, String nom, String prenom, String tel) {
        this.id = id;
        this.mail = mail;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
    }

    /**
     * méthode afficher location par client
     * @param cl
     * @return List<Location>
     */

    public List<Location> afficherLocations(Client cl){

        List<Location> lcl = new ArrayList<>();

        for(Location loc : locations){
            if(loc.getClient().equals(cl)){

                lcl.add(loc);
            }
        }
        return lcl;
    }

    /**
     * getter identifiant client
     * @return id identifiant client
     */
    public int getId() {
        return id;
    }

    /**
     * setter identifiant
     * @param id = identifiant client
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter mail du client
     * @return mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * setter mail du client
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * getter nom client
     * @return nom du client
     */
    public String getNom() {
        return nom;
    }

    /**
     * setter nom client
     * @param nom nom client
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * getter prenom client
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * setter prenom client
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * getter numéro de téléphone
     * @return tel numéro de téléphone
     */
    public String getTel() {
        return tel;
    }

    /**
     * setter numéro de téléphone
     * @param tel numéro de téléphone
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * getter liste des locations
     * @return locations
     */

    public List<Location> getLocations() {
        return locations;
    }

    /**
     * setter liste des locations
     * @param locations
     */
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    /**
     * methode toString
     * @return totalité des informations
     */
    @Override
    public String toString() {
        return "classesMetiers.Client [id=" + id + ", locations=" + locations + ", mail=" + mail + ", nom=" + nom + ", prenom="
                + prenom + ", tel=" + tel + "]";
    }

    /**
     * methode equals
     * @param o
     * @return boolean
     */
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client c = (Client) o;
        return Objects.equals(mail, c.mail);

    }

    /**
     * methode hashCode
     * @return integer
     */
    @Override
    public int hashCode() {
        return Objects.hash(mail);
    }
    
}
