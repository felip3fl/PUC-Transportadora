package a.transportadora;

import java.util.ArrayList;
import java.util.List;


public class Frota {

	private List<Caminhao> lista = new ArrayList<>();
	
	public void adiciona(Caminhao obj){
		lista.add(obj);
	}
	
	public int capacidadeTransporte(){
		int carga = 0;
		for (Caminhao caminhao : lista) {
			carga = carga + caminhao.getCapacidade();
		}
		
		return carga;
	}
	
}
