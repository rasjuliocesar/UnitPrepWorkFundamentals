package quesito.dez;

import java.util.ArrayList;

public interface DaoCliente {

	public static Cliente cliente = new Cliente();
	
	Cliente incluir(Cliente cliente);
	void excluir(Integer id);
	Cliente alterar(Cliente cliente);
	ArrayList<Cliente> listar();
	Cliente get();
}
