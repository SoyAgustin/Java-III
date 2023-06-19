
public class Gerente extends Funcionario { //Gerente ES UN funcionario
	private String clave;
	public void setClave(String clave){
		this.clave = clave;
	}
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnline";
	}
}
