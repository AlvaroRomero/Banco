package ar.edu.unlam.tallerweb2.clase20120915;
import static org.junit.Assert.*;
import org.junit.Test;


class misExceptionsTest extends GroovyTestCase{
	
	@Test 
	void superaLimteTest1() {
	
	Cliente cliente1 = new Cliente(nombre:'Juan')
	CajaAhorro miCaja1 = new CajaAhorro(saldo:3000, cliente:cliente1)
	System.println(miCaja1.saldo)
	
	shouldFail(SuperaLimiteException){
		miCaja1.extraer(2000)
		}
	}
	
	
	@Test
	void superaLimteConAssertTest() {
	
	Cliente cliente1 = new Cliente(nombre:'Juan')
	CajaAhorro miCaja1 = new CajaAhorro(saldo:3000, cliente:cliente1)
	
	def msg=shouldFail(SuperaLimiteException){
		miCaja1.extraer(2001)
		}
	assert 'Supera Limite permitido'==msg
	}
	
	

	
}