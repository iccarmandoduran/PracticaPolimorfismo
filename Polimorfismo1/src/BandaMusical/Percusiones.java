package BandaMusical;

public class Percusiones extends Instrumento {
	public Percusiones(String nombre) {
		  super(nombre);
		 System.out.println("Percusion, nombre : "+nombre);
		    }
		 
		    public void tipoInstrumento() {
		 System.out.println("Tipo : Percusion");
		    }
		 
		    public void Tocar(){
		  System.out.println("Tocar: Golpear");
		    }

}
