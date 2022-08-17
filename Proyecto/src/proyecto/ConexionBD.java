/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.sql.*;

public class ConexionBD {
 Connection cn;
 Statement st;
   public Connection conexion()
   {
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           cn=DriverManager.getConnection("jdbc:mysql://localhost/isunah_prog2(2)","root","");
           System.out.println("Conexion Exitosa");
       }
       catch (Exception e)
       {
           System.out.println(e.getMessage());
       }return cn;
   }
   Statement createStatement(){
       throw new UnsupportedOperationException("No Soportado");
   }
}
