/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionsqlserver;


import java.sql.*; //Importación de todas las librerias del driver JDBC 
import javax.swing.*; //Importación de todas las librerias Swing para hacer uso de algunas de ellas

public class ConexionSQLServer {


    public static void main(String[] args) {
        Connection conect; //Creación de objeto de la clase Connection, nos permitirá interactuar con los métodos de la clase para realizar la conexión
        
        try { //Inicio try para capturar errores de conexión con SQL server
  String connectionUrl = "jdbc:sqlserver://;database=Sistema;integratedSecurity=true;"; //Se estblece la info necesaria para conectar JAVA con SQL server(Se hace autentificación de windows para establecer la conexión)
         conect = DriverManager.getConnection(connectionUrl); //Se intenta realizar conexión con sql server 
  JOptionPane.showMessageDialog(null,"Conexión correcta");
} //Fin de try
catch (SQLException ex) //captura de errores en una variable llamada ex
{ //Inicio de bloque de instrucciones catch
  JOptionPane.showMessageDialog(null," Error " + ex); //Mostramos información del error en caso de que exista uno
}//Fin de bloque catch
    }//Fin de metodo principal
    
}//Fin de la clase
