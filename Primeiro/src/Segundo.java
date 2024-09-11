import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Segundo {
	public static void main(String[] args) {
		//executa operações no banco de dados
		Statement stml = null;
		
		// faz conexão com banco de dados
		Connection conn = Conexao.getConexaoMySQL();
		
		try {
			stml = (Statement) conn.createStatement();
			//Traz os resultados da consulta SQL
			ResultSet resl = null;
			resl = stml.executeQuery("SELECT * FROM CLIENTES");
			System.out.println("ID            NOME         E-MAIL");
			while(resl.next()) {
				System.out.println(resl.getInt("id") +     "           " + resl.getString("nome") +    "             "  + resl.getString("email"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}

}
