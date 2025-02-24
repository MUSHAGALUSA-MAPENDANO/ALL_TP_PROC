

import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class LectureEcritureFichier {
    public static void main(String[] args) {
        File file1 = new File("texte.txt");
        File file2 = new File("fichier.docs");

        try {

            FileReader fichierLecture = new FileReader(file1);
            BufferedReader BufferLecture = new BufferedReader(fichierLecture);

            FileWriter fichierEcriture = new FileWriter(file2);
            BufferedWriter BufferEcriture = new BufferedWriter(fichierEcriture);

            int n;
            char[] buffer = new char[1024];
            while ((n=BufferLecture.read(buffer)) != -1) {

                    String texte= new String(buffer);
                    System.out.println(texte.toString());
            
                    BufferEcriture.write(buffer,0, n);
                
            }
            FileWriter fichierEffacer = new FileWriter(file1);
            BufferedWriter BufferEffacer = new BufferedWriter(fichierEffacer);
            BufferEffacer.write("", 0, n);
 
            BufferEcriture.close();
            BufferLecture.close();
            BufferEffacer.close();


            
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Erreur dans les fichiers "+e.getMessage());
        }
        
    }
    
}
