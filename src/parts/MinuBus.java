package parts;
public class MinuBus extends Bus {

     private String tipoViaje;

	public MinuBus() {
	}

	public MinuBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
		super(color, patente, cantidadDeAsientos);
		this.tipoViaje = tipoViaje;
	}
    
	public String getTipoViaje() {
		return tipoViaje;
	}

	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}


    public void imprimeBus() {
		System.out.println("Pasaje impreso");
    }

}
