package quesito.doze;

public class RelogioPulso extends RelogioImpl{

	private Integer tipoPulseira;
	
	public RelogioPulso() {
	}

	public RelogioPulso(String marca, String tipo, Integer tipoPulseira) {
		super(marca, tipo);
		this.tipoPulseira = tipoPulseira;
	}

	public Integer getTipoPulseira() {
		return tipoPulseira;
	}

	public void setTipoPulseira(Integer tipoPulseira) {
		this.tipoPulseira = tipoPulseira;
	}	
	
	@Override
	public void ajustarAlarme() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void ajustarHora() {
		// TODO Auto-generated method stub
		
	}
}
