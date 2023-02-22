package classesMetiers;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Location {

    /**
     * id de la location
     * kmtotal nb de km au total
     */
    private int id, kmtotal;
    /**
     * date de la location
     */
    private LocalDate dateLoc;

    /**
     * acompte
     * total du prix de la location
     */
    private float acompte, total;
    /**
     * taxi
     */
    private Taxi taxi;
    /**
     * client
     */
    private Client client;

    public Location() {
    }

    /**
     * constructeur paramétré
     *
     * @param id = identifiant de la location
     * @param kmtotal = nombre de km au total
     * @param dateLoc = date de la location
     * @param acompte = acompte
     * @param total = prix total
     * @param taxi = taxi
     * @param client = client
     */

    public Location(int id, int kmtotal, LocalDate dateLoc, float acompte, float total, Taxi taxi, Client client) {
        this.id = id;
        this.kmtotal = kmtotal;
        this.dateLoc = dateLoc;
        this.acompte = acompte;
        this.total = total;
        this.taxi = taxi;
        this.client = client;
    }

    /**
     * methode calculant le prix total
     */
    public void total(){

        total = taxi.getPrixKm()*kmtotal;
    }

    //TODO A VERIFIER
    /**
     * méthode affichant les locations d'une date
     */
    public void afficherLocs(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer une date : ");
        String datesc = sc.nextLine();
        //transformer string en localdate
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate datetime = LocalDate.parse(oldDate, pattern);

        for (Location loc : listeLocations)
        {

            //boucle pour parcourir les locations ?
            if(dateLoc.isEqual(datetime))
            {
                System.out.println(loc.toString() + loc.getClient().toString() + loc.getTaxi().toString());

            }
        }

    }

    /**
     * getter de l'identifiant
     * @return id identifiant
     */
    public int getId() {
        return id;
    }

    /**
     * setter id
     * @param id identifiant
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter kmtotal du nombre km total
     * @return kmtotal = nombre de km total
     */
    public int getKmtotal() {
        return kmtotal;
    }

    /**
     * setter kmtotal = nb de km au total
     * @param kmtotal nb de km au totla
     */
    public void setKmtotal(int kmtotal) {
        this.kmtotal = kmtotal;
    }

    /**
     * getter dateloc date de location
     * @return dateLoc date de location
     */
    public Date getDateLoc() {
        return dateLoc;
    }

    /**
     * setter dateLoc date de location
     * @param dateLoc date de location
     */
    public void setDateLoc(Date dateLoc) {
        this.dateLoc = dateLoc;
    }

    /**
     * getter acompte
     * @return acompte
     */
    public float getAcompte() {
        return acompte;
    }

    /**
     * setter acompte
     * @param acompte
     */
    public void setAcompte(float acompte) {
        this.acompte = acompte;
    }

    /**
     * getter total du prix
     * @return total = total prix
     */
    public float getTotal() {
        return total;
    }

    /**
     * setter prix total
     * @param total prix total
     */

    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * getter taxi
     * @return taxi
     */

    public Taxi getTaxi() {
        return taxi;
    }

    /**
     * setter taxi
     * @param taxi
     */
    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    /**
     * getter client
     * @return client
     */
    public Client getClient() {
        return client;
    }

    /**
     * setter client
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * methode to string
     * @return la totalité des informations
     */
    @Override
    public String toString() {
        return "classesMetiers.Location [acompte=" + acompte + ", client="
                + client + ", dateLoc=" + dateLoc + ", id=" + id + ", kmtotal=" + kmtotal + ", taxi=" + taxi
                + ", total=" + total + "]";
    }

}
