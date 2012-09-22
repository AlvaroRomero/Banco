package ar.edu.unlam.tallerweb2.clase20120915

class CajaAhorro extends Cuenta {
	
	def validarOperacion(def importe){
		if(importe<=0){
			throw new ImporteNegativoException('El importe a extraer debe ser positivo.')
		}
		if(importe>1000){
			throw new SuperaLimiteException('Supera Limite permitido')
		}
	true
	}
	

	def extraer(def importe) {
		
		if((validarOperacion(importe)==true)){
			saldo-=importe
			}
	saldo		
	}

}
