package VEHICULE_INTERFACE;

public class Moto implements VehiculeInterface {
    private int vitesseMax;
    public Moto(int vitesseMax){
        this.vitesseMax=vitesseMax;
    }
    public int getVitesseMax(){
        return vitesseMax;
    }
    public void setVitesseMax(int vitesseMax){
        this.vitesseMax=vitesseMax;
    }
    public void Demarrer(){
        System.out.println("DEMARRAGE:  le motard fait tourner la cle de contact dans le boitier et appuie sur le bouton de demarrage ");
    }
    public void arreter(){
        System.out.println("l'ARRET: le motard freine et tourner la cle dans le sens contraire a la montre");
    }
    public int VitesseMaxVehicule(){

        return  this.vitesseMax;
    }

    
}
