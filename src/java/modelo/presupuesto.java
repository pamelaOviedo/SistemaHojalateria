/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class presupuesto {

    String idpresupuesto;	
    String detalledecliente;
         Date fecha;
    String descripcióndeltrabajo;	
        int total;

    public presupuesto() {
    }

    public presupuesto(String idpresupuesto, String detalledecliente, Date fecha, String descripcióndeltrabajo, int total) {
        this.idpresupuesto = idpresupuesto;
        this.detalledecliente = detalledecliente;
        this.fecha = fecha;
        this.descripcióndeltrabajo = descripcióndeltrabajo;
        this.total = total;
    }

    
    public String getIdpresupuesto() {
        return idpresupuesto;
    }

    public void setIdpresupuesto(String idpresupuesto) {
        this.idpresupuesto = idpresupuesto;
    }

    public String getDetalledecliente() {
        return detalledecliente;
    }

    public void setDetalledecliente(String detalledecliente) {
        this.detalledecliente = detalledecliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcióndeltrabajo() {
        return descripcióndeltrabajo;
    }

    public void setDescripcióndeltrabajo(String descripcióndeltrabajo) {
        this.descripcióndeltrabajo = descripcióndeltrabajo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
        
        
        
        

    
}
