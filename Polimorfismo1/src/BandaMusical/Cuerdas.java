package BandaMusical;

public class Cuerdas extends Instrumento {
	public Cuerdas(String nombre) {
		  super(nombre);
		 System.out.println("Cuerda, nombre : "+nombre);
		    }
		 
		    public void tipoInstrumento() {
		 System.out.println("Tipo : Cuerda");
		    }
		 
		    public void Tocar(){
		  System.out.println("Tocar: rasgeo");
		    }
}
