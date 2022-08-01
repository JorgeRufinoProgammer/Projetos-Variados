package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class InserindoDados {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
				"INSERT INTO SELLER (Name,Email,BirthDate,BaseSalary,DepartmentId) "
				+ "VALUES"
				+"(?,?,?,?,?)",			//Valores ser�o preenchidos depois
				Statement.RETURN_GENERATED_KEYS); //Faz com que retorne os IDs dos elementos que foram criados na tabela
			
			//Preencher os valores das interroga��es
			//Primeiro argumento � a posi��o da Interroga��o, e o segundo � o valor que ser� passado
			st.setString(1, "Carl Purple");			//Nome
			st.setString(2, "carl@gmail.com");		//Email
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));	//Data de Nascimento
			st.setDouble(4, 3000.0);				//Salario
			st.setInt(5, 4);						//Id do Departamento

//			st = conn.prepareStatement("insert into department (Name) values ('D1'),('D2')",
//					Statement.RETURN_GENERATED_KEYS);

			int rowsAffect = st.executeUpdate();	//Executa a query e retonar um "int" com o numero de linhas afetadas
			
			if (rowsAffect > 0) {
				ResultSet rs = st.getGeneratedKeys();	//Pega os IDs dos elementos que foram criados, e retorna um ResultSet
				
				while(rs.next()) {			
					int id = rs.getInt(1);
					System.out.println("Created! Id = " + id);
				}
			}	
			else {
				System.out.println("No rows affect");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ParseException e) {
			e.printStackTrace();
		}		
		finally {
			DB.closeStatement(st);
			DB.closeConnections();
		}
	}

}
