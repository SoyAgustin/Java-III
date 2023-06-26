
public class Contador extends Funcionario {
	//Contador es un funcionario
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando bonificacion desde CONTADOR");
		return super.getBonificacion();
	}
}
