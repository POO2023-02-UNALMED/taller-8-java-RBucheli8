package futbol;

public class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short goles, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = goles;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	@Override
	public int compareTo(Object o) {
		return Math.abs(this.getEdad()-((Futbolista) o).getEdad());
	}
	
	@Override
	public String toString() {
		return super.toString() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
	}
	
	@Override
	public boolean jugarConLasManos() {
		return false;
	}
	
}
