
package Auxiliar.SQL;
    import java.sql.*;
    import Auxiliar.*;
    import Auxiliar.SQL.*;
public class Inserts {
    
    static String password = "1234", user = "root", host = "jdbc:mysql://127.0.0.1:4890/aps3";
    static Connection conn;
    static PreparedStatement stmt;
    static ProtocoloIdGen protoId = new ProtocoloIdGen();
    
    public void insertSQLProtocolo (String tipo, String data){
        String protocolo = Integer.toString(protoId.geradorId());
         try {
            conn = DriverManager.getConnection(host, user, password);
            Retrieve get = new Retrieve();
            
            
            
            stmt = conn.prepareStatement("INSERT INTO protocolo(id_protocolo, tipo, data, historico, cpf_cliente) VALUES (?, ?, ?, 'pedido de ajuda', '0123456789')");
            
            stmt.setString(1, protocolo);
            stmt.setString(2, tipo);
            stmt.setString(3, data);
            
            stmt.executeUpdate();
            
            
        } catch (SQLException e){
            throw new IllegalStateException("Falha ao conectar no banco de dados", e);
        }
    }
    
    public void insertSQLHistorico (String historico, String tipo, String data){
        String protocolo = Integer.toString(protoId.geradorId());
         try {
            conn = DriverManager.getConnection(host, user, password);
            stmt = conn.prepareStatement("INSERT INTO protocolo(historico, id_protocolo, tipo, data) VALUES (?, ?, ?, ?)");
            
            stmt.setString(1, historico);
            stmt.setString(2, protocolo);
            stmt.setString(3, tipo);
            stmt.setString(4, data);
            
            stmt.executeUpdate();
        } catch (SQLException e){
            throw new IllegalStateException("Falha ao conectar no banco de dados", e);
        }
    }
    
}
