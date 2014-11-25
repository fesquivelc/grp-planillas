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
@Table(name = "codigo_distancia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CodigoDistancia.findAll", query = "SELECT c FROM CodigoDistancia c"),
    @NamedQuery(name = "CodigoDistancia.findByCodigo", query = "SELECT c FROM CodigoDistancia c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "CodigoDistancia.findByDescripcion", query = "SELECT c FROM CodigoDistancia c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "CodigoDistancia.findByVigencia", query = "SELECT c FROM CodigoDistancia c WHERE c.vigencia = :vigencia")})
public class CodigoDistancia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Codigo")
    private String codigo;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Vigencia")
    private Boolean vigencia;

    public CodigoDistancia() {
    }

    public CodigoDistancia(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        if (!(object instanceof CodigoDistancia)) {
            return false;
        }
        CodigoDistancia other = (CodigoDistancia) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.CodigoDistancia[ codigo=" + codigo + " ]";
    }
    
}
