package quesito.dez;

import java.sql.Connection;

public interface Conexao {
	
	Connection conectar();
	void desconectar(Connection con);
}
