package VEHICULE_INTERFACE;

public class TestVehicule {
    public static void main(String[] args) {
        Moto moto_1 =new Moto(180);
        Voiture voiture_1=new Voiture(200);
        Velo velo_1 = new Velo(30);
       
        System.out.println("====================================================================");
        moto_1.Demarrer();
        moto_1.arreter();
        System.out.println("VITESSE: la vitesse maximale de la moto est "+moto_1.VitesseMaxVehicule()+"Km/h");
        
        System.out.println("====================================================================");
        voiture_1.Demarrer();
        voiture_1.arreter();
        System.out.println("VITESSE: la vitesse maximale de la voiture est "+voiture_1.VitesseMaxVehicule()+"Km/h");
        
        System.out.println("====================================================================");
        velo_1.Demarrer();
        velo_1.arreter();
        System.out.println("VITESSE: la vitesse maximale du velo est "+velo_1.VitesseMaxVehicule()+"Km/h");
        System.out.println("====================================================================");

    }
    
}
