
public class Administrador extends Funcionario implements Autenticable {

	//Queremos que el administrador tambien se pued autenticar
	//La clase con ese método es Gerente
	
	private String clave;
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public boolean iniciarSesion(String clave) {
		if (this.clave == clave) {
			return true;
		}
		return false;
	}

	@Override
	public void setClave(String clave) {
		this.clave = clave;
		
	}

}
