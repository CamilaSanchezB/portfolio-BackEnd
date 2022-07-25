
public class Mensaje {
	private String cuerpo;	
	public Mensaje(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mensaje m1=new Mensaje("Este es un archivo de prueba");
		System.out.println(m1.getCuerpo());
	}

}
