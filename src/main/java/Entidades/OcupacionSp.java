/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gabriel
 */
@Entity
@Table(name = "ocupacion_sp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcupacionSp.findAll", query = "SELECT o FROM OcupacionSp o"),
    @NamedQuery(name = "OcupacionSp.findByCodigo", query = "SELECT o FROM OcupacionSp o WHERE o.codigo = :codigo"),
    @NamedQuery(name = "OcupacionSp.findByNombre", query = "SELECT o FROM OcupacionSp o WHERE o.nombre = :nombre"),
    @NamedQuery(name = "OcupacionSp.findByEjecutivo", query = "SELECT o FROM OcupacionSp o WHERE o.ejecutivo = :ejecutivo"),
    @NamedQuery(name = "OcupacionSp.findByEmpleado", query = "SELECT o FROM OcupacionSp o WHERE o.empleado = :empleado"),
    @NamedQuery(name = "OcupacionSp.findByObrero", query = "SELECT o FROM OcupacionSp o WHERE o.obrero = :obrero"),
    @NamedQuery(name = "OcupacionSp.findByVigencia", query = "SELECT o FROM OcupacionSp o WHERE o.vigencia = :vigencia")})
public class OcupacionSp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Codigo")
    private String codigo;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Ejecutivo")
    private Character ejecutivo;
    @Column(name = "Empleado")
    private Character empleado;
    @Column(name = "Obrero")
    private Character obrero;
    @Column(name = "Vigencia")
    private Boolean vigencia;

    public OcupacionSp() {
    }

    public OcupacionSp(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getEjecutivo() {
        return ejecutivo;
    }

    public void setEjecutivo(Character ejecutivo) {
        this.ejecutivo = ejecutivo;
    }

    public Character getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Character empleado) {
        this.empleado = empleado;
    }

    public Character getObrero() {
        return obrero;
    }

    public void setObrero(Character obrero) {
        this.obrero = obrero;
    }

    public Boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(Boolean vigencia) {
        this.vigencia = vigencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcupacionSp)) {
            return false;
        }
        OcupacionSp other = (OcupacionSp) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.OcupacionSp[ codigo=" + codigo + " ]";
    }
    
}
