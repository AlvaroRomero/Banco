package ar.edu.unlam.tallerweb2.clase20120915;

import static org.junit.Assert.*;

import org.junit.Test;

class CajaAhorroTest {
	
	@Test
	void crearCajaAhorroTest(){
		Cliente cliente1 = new Cliente(nombre:'Juan')
		CajaAhorro miCaja = new CajaAhorro(saldo:3000, cliente:cliente1)
		assert miCaja.saldo == 3000		
	}
	
	@Test
	void extraerCajaAhorroTest(){
		Cliente cliente1 = new Cliente(nombre:'Juan')
		CajaAhorro miCaja = new CajaAhorro(saldo:3000, cliente:cliente1)
		miCaja.extraer(100)
		assert miCaja.saldo == 2900
	}
	
	@Test
	void extraerMaximoCajaAhorroTest(){
		Cliente cliente1 = new Cliente(nombre:'Juan')
		CajaAhorro miCaja = new CajaAhorro(saldo:3000, cliente:cliente1)
		miCaja.extraer(1000)
		assert miCaja.saldo == 2000
	}
	
	@Test
	//Salta eXception : ROJO
		void extraerMasDePermitidoCajaAhorroTest(){
		Cliente cliente1 = new Cliente(nombre:'Juan')
		CajaAhorro miCaja = new CajaAhorro(saldo:3000, cliente:cliente1)
		miCaja.extraer(1001)		
		assert miCaja.saldo == 1999
	}

	@Test
	//Salta eXception : ROJO
		void extraerNegativoCajaAhorroTest(){
		Cliente cliente1 = new Cliente(nombre:'Juan')
		CajaAhorro miCaja = new CajaAhorro(saldo:3000, cliente:cliente1)
		miCaja.extraer(-1000)
		assert miCaja.saldo == 3000
	}
	
	
}
