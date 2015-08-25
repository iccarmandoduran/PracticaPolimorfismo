package BandaMusical;

public class Viento extends Instrumento{
	public Viento(String nombre) {
		  super(nombre);
		 System.out.println("Viento, nombre : "+nombre);
		    }
		 
		    public void tipoInstrumento() {
		 System.out.println("Tipo : Viento");
		    }
		 
		    public void Tocar(){
		  System.out.println("Tocar: soplar");
		    }
}
