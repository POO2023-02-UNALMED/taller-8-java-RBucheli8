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
		if (o instanceof Jugador) {
			Jugador j = (Jugador) o;
			if (this.getEdad() > j.getEdad()) {
				return this.getEdad() - j.getEdad();
			}
			else if (this.getEdad() < j.getEdad()) {
				return j.getEdad() - this.getEdad();
			}
			else { return 0;}
		}
		else { return 0;}
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
