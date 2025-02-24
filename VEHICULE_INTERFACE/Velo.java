package VEHICULE_INTERFACE;

public class Velo implements VehiculeInterface{
    private int vitesseMax;
    public Velo(int vitesseMax){
        this.vitesseMax=vitesseMax;
    }
    public int getVitesseMax(){
        return vitesseMax;
    }
    public void setVitesseMax(int vitesseMax){
        this.vitesseMax=vitesseMax;
    }
    public void Demarrer(){
        System.out.println("DEMARRAGE: le cycliste pedale le velo!");
    }
    public void arreter(){
        System.out.println("L'ARRET: le cycliste cesse de pedaler et appuie le frein du velo");
    }
    public int VitesseMaxVehicule(){

        return  this.vitesseMax;
    }
}
