package quesito.onze;

import java.util.List;

public class Resultado {

	private Integer candidatoId;
	
	private List<ServidorDeVotos> servidores;
	
	public Resultado() {
	}
	
	public Integer getCandidatoId() {
		return candidatoId;
	}
	
	public void setCandidatoId(Integer candidatoId) {
		this.candidatoId = candidatoId;
	}
	
	public List<ServidorDeVotos> getServidores(){
		return servidores;
	}
	
	public void addServidores(ServidorDeVotos servidor) {
		servidores.add(servidor);
	}
	
	public void removeServidores(ServidorDeVotos servidor) {
		servidores.remove(servidor);
	}
	
	public Integer getTotalVotos() {
		return null;
	}
	
	public void divulgarVencedor() {
		
	}
}
