package BandaMusical;

public abstract class Instrumento implements IInstrumento{
	 
	
	private String nombre;
	  
	 
	 public Instrumento (String nombre){
	  this.nombre=nombre;
	  System.out.println("Constructor Instrumento, " +
	    "Tipo de Instrumento : "+this.nombre);
	 }
	 
	 public String getNombre(){
	  return nombre;
	 }
	 
	  
	 public abstract void tipoInstrumento();
}
