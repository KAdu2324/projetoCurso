package br.com.qwasolucoes.mentoria.implementacoes.banco_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static final String url = "jdbc:mysql://localhost:3306/pessoabanco";
	private static final String user = "adm";
	private static final String password = "1234";

	private static Connection conn;

	public static Connection abrirConexao() {
		try {
			if (conn == null || conn.isClosed()) {
				conn = DriverManager.getConnection(url, user, password);
			}
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Connection fecharConexao() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

}
