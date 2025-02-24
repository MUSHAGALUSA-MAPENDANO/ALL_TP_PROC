import java.io.*;

public class LectureObjet{
    public static void main(String[] args) throws Exception {
        // Création des objets Voiture
       try {
        
       
            Voiture voiture1 = new Voiture("berlinebentley", 4, 4, 4);
            Voiture voiture2 = new Voiture("rolls royces", 2, 4, 2);

            // Écriture des voitures dans le fichier voiture.txt
            FileWriter fileEcriture = new FileWriter("voiture.txt");
            BufferedWriter fluxEcriture = new BufferedWriter(fileEcriture);

            fluxEcriture.write(voiture1.getMarqueVoiture()+ "," + voiture1.getNombrePorte() + "," + voiture1.getNombrePneu() + "," + voiture1.getNombreChaise());
            fluxEcriture.newLine();
            fluxEcriture.write(voiture2.getMarqueVoiture()+ "," + voiture2.getNombrePorte() + "," + voiture2.getNombrePneu() + "," + voiture2.getNombreChaise());
            fluxEcriture.newLine();

            fluxEcriture.close();
            System.out.println("mes voitures");
            System.out.println("****************\n");
            System.out.println(voiture1.description());
            System.out.println(voiture2.description());
            System.out.println("***************\n");
        

       // br.close();
    } catch (IOException e) {
        System.out.println("ERREUR"+ e.getMessage());
       }
    }
}

