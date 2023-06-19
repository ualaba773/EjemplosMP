package ejercicio2Ordinaria2020;

public interface Serializable {

	
}

//Las clases Banco, CuentaCorriente y Movimiento deben implementar la interfaz Serializable



// b) El método getSaldo()

public double getSaldo() {
	double saldo = 0;
	
	for(int i = 0; i < movimientos.size(); i++) {
		saldo += movimientos.get(i).getImporte();
	}
	
	return saldo;
}


//c) El método generarExtracto()

public void generarExtracto() {
	Sytem.out.println("Número de cuenta: "+numero);
	Sytem.out.println("Titular de la cuenta: "+titular);
	
	for(int i = 0; i < movimientos.size(); i++) {
		System.out.println("Movimiento nº "+(i+1)+": "+movimientos.get(i).toString());
	}
}