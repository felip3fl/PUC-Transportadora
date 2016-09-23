package a.transportadora;

public class Transportadora {
	
	private int capacidadeDiariaTransporte;
	
	
	public int getCapacidadeDiariaTransporte() {
		return capacidadeDiariaTransporte;
	}

	public void setCapacidadeDiariaTransporte(int capacidadeDiariaTransporte) throws Exception {
		
		if(capacidadeDiariaTransporte < 1){
			throw new Exception("Capacidade n�o permitida");
		}else{
			this.capacidadeDiariaTransporte = capacidadeDiariaTransporte;
		}		
	}
	
	public int calculoDiasTransporte(int cargaTransporte){
		
		int dias = 0;
		//int numeroMaximoCaminhao = 2;
		int totalTransportado = 0;

		while(totalTransportado < cargaTransporte){
			
			
			dias++;
			
			Frota frota = new Frota();
			
			if (dias > 2){
				Caminhao caminhao1 = new Caminhao(capacidadeDiariaTransporte );
				frota.adiciona(caminhao1);
			}else{ 
				Caminhao caminhao1 = new Caminhao(capacidadeDiariaTransporte );
				Caminhao caminhao1 = new Caminhao(capacidadeDiariaTransporte );
				Caminhao caminhao2 = new Caminhao(capacidadeDiariaTransporte);
				frota.adiciona(caminhao1);
				frota.adiciona(caminhao2);
			}
			
			totalTransportado = totalTransportado + frota.capacidadeTransporte();

		}
		
		
		return dias;
	}
	
	
}
