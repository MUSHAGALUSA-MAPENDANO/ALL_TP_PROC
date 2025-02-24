package VEHICULE_INTERFACE;

public class Voiture implements VehiculeInterface {
    private int vitesseMax;
    public Voiture(int vitesseMax){
        this.vitesseMax=vitesseMax;
    }
    public int getVitesseMax(){
        return vitesseMax;
    }
    public void setVitesseMax(int vitesseMax){
        this.vitesseMax=vitesseMax;
    }
    public void Demarrer(){
        System.out.println("DEMARRAGE: le chauffeur tourne la cle dans le boitier et demarre avec un bouton !");
    }
    public void arreter(){
        System.out.println("L'ARRET: le chauffeur appuie sur le frein avec son pied et tourne la cle dans l'autre sens (sens contraire a celui d'une montre) ");
    }
    public int VitesseMaxVehicule(){

        return  this.vitesseMax;
    }
    
}
