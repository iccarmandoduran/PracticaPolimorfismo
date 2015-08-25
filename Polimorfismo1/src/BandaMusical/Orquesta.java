package BandaMusical;
import java.util.Scanner;
public class Orquesta {
	 public static void main (String[] arg){
		 Scanner leer= new Scanner(System.in);
	 int tiempo;
		 IInstrumento Clarinete = new Viento("Clarinete");
		 IInstrumento Bateria = new Percusiones("Bateria");
		 IInstrumento Guitarra = new Cuerdas("Guitarra");
		 
	
		 System.out.print("Dame tiempo de interpretacion:");
		 tiempo=leer.nextInt();
		 for(int i=0;i<tiempo;i++){
			 Bateria.Tocar();
			 Clarinete.Tocar();
			 Guitarra.Tocar();
			 
		 }
		 
		  
		 
	 }

}
