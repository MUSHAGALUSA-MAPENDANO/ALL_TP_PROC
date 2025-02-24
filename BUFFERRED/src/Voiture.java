
import java.io.Serializable;
public class Voiture implements Serializable {
        private String marqueVoiture;

        private int nombrePorte;
        private int nombrePneu;
        private int nombreChaise;
    
    
        public Voiture(String marqueVoiture,int nombrePorte,int nombrePneu,int nombreChaise)  {
            this.marqueVoiture =marqueVoiture;
            this.nombrePorte =nombrePorte;
            this.nombrePneu =nombrePneu;
            this.nombreChaise =nombreChaise;
            }
        public String getMarqueVoiture(){
            return marqueVoiture;

        }
        public int getNombrePorte(){
            return nombrePorte;
        }
        public int getNombrePneu(){
            return nombrePneu;
        }
        public int getNombreChaise(){
            return nombreChaise;
        }

        public void setMarqueVoiture(String marqueVoiture){
            this.marqueVoiture = marqueVoiture;
        }
        public void setNombrePorte(int nombrePorte){
            this.nombrePorte = nombrePorte;
        }
        public void setNombrePneu(int nombrePneu){
            this.nombrePneu = nombrePneu;
        }
        public void setNombreChaise(int nombreChaise){
            this.nombreChaise = nombreChaise;
        }
        public String description(){
            return "Marque: "+this.marqueVoiture+"\n le nombre des pneus: "+this.nombrePneu+"\n le nombre des porte: "+this.nombrePorte+
            "\n le nombre des chaises: "+this.nombreChaise;
        }
      
        
}
