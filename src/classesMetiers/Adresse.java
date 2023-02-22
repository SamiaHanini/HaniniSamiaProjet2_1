package classesMetiers;

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
     */
    public Adresse(int id, int cp, String localite, String rue, String num) {
        this.id = id;
        this.cp = cp;
        this.localite = localite;
        this.rue = rue;
        this.num = num;
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
     *méthode to String
     *
     * @return informations complètes
     */
    @Override
    public String toString() {
        return "classesMetiers.Adresse [cp=" + cp + ", id=" + id + ", localite=" + localite + ", num=" + num + ", rue="
                + rue + "]";
    }  
}
