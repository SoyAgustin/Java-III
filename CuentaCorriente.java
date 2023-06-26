
public class CuentaCorriente extends Cuenta {
	public CuentaCorriente(int agencia, int numero) {
		//llamamos al constructor por defecto que recibe agencia y numero
		super(agencia,numero);
	}
	
	@Override
	public boolean retirar(double valor) {
		double comision = 0.2;
		return super.retirar(valor+comision);//10 centavos de comisión 
	}
}
