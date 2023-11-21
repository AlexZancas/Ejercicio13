package classes;

public class Ciudad {
	private String nombre;
	private int habitantes;
	private int superficie;
	private int habitantes2030;
	private int superfOcupada;
	
	
	
	public Ciudad() {
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public int getHabitantes2030() {
		return habitantes2030;
	}
	public void setHabitantes2030() {
		this.habitantes2030 = (int) Math.round(getHabitantes()* 0.9) ;
	}
	public int getSuperfOcupada() {
		return superfOcupada;
	}
	public void setSuperfOcupada() {
		this.superfOcupada = superficie + 10000;
	}
	
	
}
