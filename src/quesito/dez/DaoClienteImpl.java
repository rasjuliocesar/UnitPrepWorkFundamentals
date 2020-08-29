package quesito.dez;

import java.util.ArrayList;

public class DaoClienteImpl implements DaoCliente {

	private ArrayList<Cliente> lista;
	
	private ConexaoImpl conexao;
	
	public DaoClienteImpl() {
	}
	
	public DaoClienteImpl(ArrayList<Cliente> lista, ConexaoImpl conexao) {
		this.lista = lista;
		this.conexao = conexao;
	}
	
	public ConexaoImpl getConexao() {
		return conexao;
	}

	public void setConexao(ConexaoImpl conexao) {
		this.conexao = conexao;
	}

	@Override
	public Cliente incluir(Cliente cliente) {
		lista.add(cliente);
		return cliente;
	}

	@Override
	public void excluir(Integer id) {
		for(Cliente c : lista) {
			if(c.getCodigo().equals(id)) {
				lista.remove(c);
			}
		}
		
	}

	@Override
	public Cliente alterar(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente get() {
		// TODO Auto-generated method stub
		return null;
	}
}
