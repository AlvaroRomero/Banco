package ar.edu.unlam.tallerweb2.clase20120915

import org.junit.Test


class CuentaCorrienteTest {
	
	@Test
	void crearCuentaCorrienteTest(){
		Cliente cliente1 = new Cliente(nombre:'Pedro')
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente(saldo:3000, cliente:cliente1, cantidadMovimientos:0)
		assert cuentaCorriente1.saldo == 3000
		
	}
	
	
	@Test
	void extraerCuentaCorrienteTest(){
		Cliente cliente1 = new Cliente(nombre:'Pedro')
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente(saldo:3000, cliente:cliente1, cantidadMovimientos:0)
		cuentaCorriente1.extraer(350) 
		assert cuentaCorriente1.saldo == 2650
		
			
	}
	
	@Test
	void extraerVariosMovimientosCuentaCorrienteTest(){
		Cliente cliente1 = new Cliente(nombre:'Pedro')
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente(saldo:3000, cliente:cliente1, cantidadMovimientos:0)
		cuentaCorriente1.extraer(1)
		cuentaCorriente1.extraer(1)
		cuentaCorriente1.extraer(1)
		cuentaCorriente1.extraer(1)
		cuentaCorriente1.extraer(1)
		cuentaCorriente1.extraer(1)
		assert cuentaCorriente1.saldo == 2992
		
			
	}
	
	//Nuevos Test despues del ReFactor
	
	@Test
	void extraerdeCuentaCorrienteTest(){
		Cliente cliente1 = new Cliente(nombre:'Carlos')
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente(saldo:3000, cliente:cliente1, cantidadMovimientos:0)
		cuentaCorriente1.extraer(1000)
		assert cuentaCorriente1.saldo == 2000
		
	}

	@Test
	void extraerTodoCuentaCorrienteTest(){
		Cliente cliente1 = new Cliente(nombre:'Carlos')
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente(saldo:3000, cliente:cliente1, cantidadMovimientos:0)
		cuentaCorriente1.extraer(4000)
		assert cuentaCorriente1.saldo == -1000		
	}
	
	@Test
	void extraerCincoVecesCuentaCorrienteTest(){
		Cliente cliente1 = new Cliente(nombre:'Carlos')
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente(saldo:3000, cliente:cliente1, cantidadMovimientos:0)
		cuentaCorriente1.extraer(100)
		cuentaCorriente1.extraer(100)
		cuentaCorriente1.extraer(100)
		cuentaCorriente1.extraer(100)
		cuentaCorriente1.extraer(100)
		System.println(cuentaCorriente1.cantidadMovimientos)
		System.println(cuentaCorriente1.saldo)
		assert cuentaCorriente1.saldo == 2500
		
	}
	
	@Test
	void extraerConRecargoCuentaCorrienteTest(){
		Cliente cliente1 = new Cliente(nombre:'Carlos')
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente(saldo:3000, cliente:cliente1, cantidadMovimientos:0)
		cuentaCorriente1.extraer(1000)
		cuentaCorriente1.extraer(100)
		cuentaCorriente1.extraer(100)
		cuentaCorriente1.extraer(100)
		cuentaCorriente1.extraer(100)
		cuentaCorriente1.extraer(100)
		System.println(cuentaCorriente1.cantidadMovimientos)
		System.println(cuentaCorriente1.saldo)
		assert cuentaCorriente1.saldo == 1498
		
	}
	
	
	
	@Test
	//esta Test da Rojo xq salta la exception de Saldo insuficiente	
	void extraerDemasCuentaCorrienteTest(){
		Cliente cliente1 = new Cliente(nombre:'Carlos')
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente(saldo:3000, cliente:cliente1, cantidadMovimientos:0)
		cuentaCorriente1.extraer(4001)
		assert cuentaCorriente1.saldo == -1001
	}
	


}
