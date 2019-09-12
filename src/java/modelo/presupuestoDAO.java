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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class presupuestoDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public List listar() throws SQLException {
        String sql = "select * from presupuesto";
        List<presupuesto> lista = new ArrayList<>();

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                presupuesto pre = new presupuesto();
                pre.setIdpresupuesto(rs.getString(1));
                pre.setDetalledecliente(rs.getString(2));
                pre.setFecha(rs.getDate(3));
                pre.setDescripcióndeltrabajo(rs.getString(4));
                pre.setTotal(rs.getInt(5));

            }
        } catch (Exception e) {
        }
        return pre;
    }

}
