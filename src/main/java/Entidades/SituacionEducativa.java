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
@Table(name = "situacion_educativa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SituacionEducativa.findAll", query = "SELECT s FROM SituacionEducativa s"),
    @NamedQuery(name = "SituacionEducativa.findByCodigo", query = "SELECT s FROM SituacionEducativa s WHERE s.codigo = :codigo"),
    @NamedQuery(name = "SituacionEducativa.findByDescripcion", query = "SELECT s FROM SituacionEducativa s WHERE s.descripcion = :descripcion"),
    @NamedQuery(name = "SituacionEducativa.findByAbreviatura", query = "SELECT s FROM SituacionEducativa s WHERE s.abreviatura = :abreviatura"),
    @NamedQuery(name = "SituacionEducativa.findByVigencia", query = "SELECT s FROM SituacionEducativa s WHERE s.vigencia = :vigencia")})
public class SituacionEducativa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Codigo")
    private String codigo;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Abreviatura")
    private String abreviatura;
    @Column(name = "Vigencia")
    private Boolean vigencia;

    public SituacionEducativa() {
    }

    public SituacionEducativa(String codigo) {
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

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
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
        if (!(object instanceof SituacionEducativa)) {
            return false;
        }
        SituacionEducativa other = (SituacionEducativa) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.SituacionEducativa[ codigo=" + codigo + " ]";
    }
    
}
