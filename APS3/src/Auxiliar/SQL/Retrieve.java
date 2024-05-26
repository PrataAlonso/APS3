package Auxiliar.SQL;
import Code.AdmScreen;
    import java.sql.*;
import javax.swing.JLabel;
public class Retrieve {
    static String user = "root", password = "1234", host = "jdbc:mysql://127.0.0.1:4890/aps3";
    static Connection conn;
    Statement stmt;
    ResultSet rs;
    
    AdmScreen adm = new AdmScreen();
            
    public String selectSaldo(){
        try {
            conn = DriverManager.getConnection(host, user, password);
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT saldo FROM usuario");
            rs.next();
            return rs.getString("saldo");
        } catch (SQLException e){
            throw new IllegalStateException("FALHA AO CONECTAR AO BANCO DE DADOS", e);
        }
    }
    
    public String selectBooleano(){
        try {
            conn = DriverManager.getConnection(host, user, password);
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT lembre FROM booleano");
            rs.next();
            return rs.getString(1);
        } catch (SQLException e){
            throw new IllegalStateException("FALHA AO CONECTAR AO BANCO DE DADOS", e);
        }
    }
    
     public String selectAgencia(){
        try {
            conn = DriverManager.getConnection(host, user, password);
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT codigo_agencia FROM usuario");
            rs.next();
            return rs.getString("codigo_agencia");
        } catch (SQLException e){
            throw new IllegalStateException("FALHA AO CONECTAR AO BANCO DE DADOS", e);
        }
    }
     
      public String selectSenha(){
        try {
            conn = DriverManager.getConnection(host, user, password);
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT senha FROM usuario");
            rs.next();
            return rs.getString("senha");
        } catch (SQLException e){
            throw new IllegalStateException("FALHA AO CONECTAR AO BANCO DE DADOS", e);
        }
    }
      
      public String selectSenhaAdm(){
        try {
            conn = DriverManager.getConnection(host, user, password);
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT senha FROM admin");
            rs.next();
            return rs.getString("senha");
        } catch (SQLException e){
            throw new IllegalStateException("FALHA AO CONECTAR AO BANCO DE DADOS", e);
        }
    }
            
    public String selectExtratoBol(){
        try {
            conn = DriverManager.getConnection(host, user, password);
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT extrato FROM protocolo");
            rs.next();
            return rs.getString("extrato");
        } catch (SQLException e){
            throw new IllegalStateException("FALHA AO CONECTAR AO BANCO DE DADOS", e);
        }
    }
    
    public String selectDepositoBol(){
        try {
            conn = DriverManager.getConnection(host, user, password);
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT deposito FROM protocolo");
            rs.next();
            return rs.getString("deposito");
        } catch (SQLException e){
            throw new IllegalStateException("FALHA AO CONECTAR AO BANCO DE DADOS", e);
        }
    }
}
