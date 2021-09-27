package calculadora;

public class Calculadora implements Operaciones{
	
	Operaciones suma = (n, m) -> n+m;
	Operaciones resta = (n, m) -> n-m;
	Operaciones multiplicacion = (n, m) -> n*m;
	Operaciones division = (n, m) -> n/m;
	
	public float sumar(float num1, float num2) {
		return suma.operar(num1, num2);
	}
	
	public float restar(float num1, float num2) {
		return resta.operar(num1, num2);
	}
	
	public float multiplicar(float num1, float num2) {
		return multiplicacion.operar(num1, num2);
	}
	
	public float dividir(float num1, float num2) {
		return division.operar(num1, num2);
	}

	@Override
	public float operar(float num1, float num2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
