import java.util.Scanner;

public class Location {

    private int id, kmtotal;
    private String dateLoc;
    private float acompte, total;
    private Taxi taxi;
    private Client client;

    public Location() {
    }

    public Location(int id, int kmtotal, String dateLoc, float acompte, float total, Taxi taxi, Client client) {
        this.id = id;
        this.kmtotal = kmtotal;
        this.dateLoc = dateLoc;
        this.acompte = acompte;
        this.total = total;
        this.taxi = taxi;
        this.client = client;
    }

    public void total(){

        total = taxi.getPrixKm()*kmtotal;
    }

    public void afficherLocs(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer une date : ");
        String datesc = sc.nextLine();

        for (Location loc : listeLocations) 
        {
            if(dateLoc.toLowerCase().equals(datesc))
            {
                System.out.println(loc.toString() + loc.getClient().toString() + loc.getTaxi().toString());
                
            }
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKmtotal() {
        return kmtotal;
    }

    public void setKmtotal(int kmtotal) {
        this.kmtotal = kmtotal;
    }

    public String getDateLoc() {
        return dateLoc;
    }

    public void setDateLoc(String dateLoc) {
        this.dateLoc = dateLoc;
    }

    public float getAcompte() {
        return acompte;
    }

    public void setAcompte(float acompte) {
        this.acompte = acompte;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Location [acompte=" + acompte + ", client="
                + client + ", dateLoc=" + dateLoc + ", id=" + id + ", kmtotal=" + kmtotal + ", taxi=" + taxi
                + ", total=" + total + "]";
    }

}
