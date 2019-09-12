/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class clientesDAO {
     Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public List listar() {
        String sql = "select * from clientes";
        List<producto> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
          clientes cl = new clientes();
                cl.setidclientes(rs.getInt(1));
                cl.setnombre(rs.getNString(2));
              cl.setapellido(rs.getString(3));
               cl.settelefono(rs.getInt(5));
             cl.setdireccion(rs.getString(4));
               
      
                lista.add(cl);
                
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    
    
    
    
}
