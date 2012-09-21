package ar.edu.unlam.tallerweb2.clase20120915

class CuentaCorriente extends Cuenta {
	
	def validarOperacion(def importe){
		if(importe<=0){
			throw new ImporteNegativoException('El importe a extraer debe ser positivo.')
		}
		if(importe>(saldo+1000)){
			throw new SaldoInsuficienteException('El saldo actual $'+saldo+' no le permite realizar la extracción.')
		}
	true
	}
	
	def calculoRecargo(def cantidadMovimientos){
		if(cantidadMovimientos+1>5){			
				saldo-=2						
		}
	saldo				
	}
	
	def extraer(def importe) {		
		if((validarOperacion(importe)==true)){
			calculoRecargo(cantidadMovimientos)
			saldo-=importe	
			cantidadMovimientos++
			}
	saldo		
	}
}
