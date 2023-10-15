package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short goles, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = goles;
		this.dorsal = dorsal;
	}
	
	public String toString() {
		return super.toString() + " con el dorsal " + this.dorsal + " . Le han marcado " + this.golesRecibidos; 
	}
	
	public int compareTo(Portero p) {
		if (this.golesRecibidos > p.golesRecibidos) {
			return this.golesRecibidos - p.golesRecibidos;
		}
		else if (this.golesRecibidos < p.golesRecibidos) {
			return p.golesRecibidos - this.golesRecibidos;
		}
		else { return 0;}
	}
	
	public boolean jugarConLasManos() {
		return true;
	}
	
}
