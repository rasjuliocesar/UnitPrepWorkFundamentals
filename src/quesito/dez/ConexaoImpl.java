package quesito.dez;

import java.sql.Connection;

public class ConexaoImpl implements Conexao{

	private String usuario;
	private String senha;
	private String url;
	
	public ConexaoImpl() {
	}

	public ConexaoImpl(String usuario, String senha, String url) {
		this.usuario = usuario;
		this.senha = senha;
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public Connection conectar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void desconectar(Connection con) {
		// TODO Auto-generated method stub
		
	}	
}
