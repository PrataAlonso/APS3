package Auxiliar.SQL;
    import java.sql.*;

public class Updates {
    static String user = "root", password = "1234", host = "jdbc:mysql://127.0.0.1:4890/aps3";
    static Connection conn;
    PreparedStatement stmt;
    
     public void updateSQLSaldo(String n){
        try {
            conn = DriverManager.getConnection(host, user, password);
            stmt = conn.prepareStatement("UPDATE usuario SET saldo = ? WHERE cpf = 0123456789");
            
            stmt.setString(1, n);
            
            stmt.executeUpdate();
        } catch (SQLException e){
            System.out.println("Falha ao conectar no banco de dados");
        }
    }
     
     public void updateSQLExtrato(String x, int i){
         String num = Integer.toString(i);
         
         try{
             conn = DriverManager.getConnection(host, user, password);
             stmt = conn.prepareStatement("UPDATE protocolo SET extrato = ? WHERE id_protocolo = ?");
             
             stmt.setString(1, x);
             stmt.setString(2, num);
             
             stmt.executeUpdate();
         } catch (SQLException e){
             throw new IllegalStateException("Falha ao conectar no banco de dados", e);
         }
     }
     
     public void updateSQLDeposito(String x, int i){
         String num = Integer.toString(i);
         
         try{
             conn = DriverManager.getConnection(host, user, password);
             stmt = conn.prepareStatement("UPDATE protocolo SET deposito = ? WHERE id_protocolo = ?");
             
             stmt.setString(1, x);
             stmt.setString(2, num);
             
             stmt.executeUpdate();
         } catch (SQLException e){
             throw new IllegalStateException("Falha ao conectar no banco de dados", e);
         }
     }
     
     public void updateSQLBoleano(boolean x){
         String boleano = "";
         if (x == true){
             boleano = "1";
         }
         else if(x == false){
             boleano = "0";
         }
         
         try{
             conn = DriverManager.getConnection(host, user, password);
             stmt = conn.prepareStatement("UPDATE booleano SET lembre = ? where id = 1");
             
             stmt.setString(1, boleano);
             stmt.executeUpdate();
         } catch (SQLException e){
             throw new IllegalStateException("Falha ao conectar no banco de dados", e);
         }
         
     }
}
