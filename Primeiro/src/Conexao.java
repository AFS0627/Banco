import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
public static Connection getConexaoMySQL() {
	Connection connection = null;
	// driver de conexão
	String driverName = "com.mysql.cj.jdbc.Drive";
	try {
	Class.forName(driverName);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		System.out.println("O driver especificado não foi encontrado");
	}
	String serverName = "localhost";
	String mydatabase = "teste";
	String url = "jdbc:mysql://" + serverName + ":3306/" + mydatabase;
	
	String username = "root";
	
	String password = "aluno";
	
	try {
		connection = DriverManager.getConnection(url, username, password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("não foi possivel se conectar");
	}
	
	
	
	return connection;
}
}
