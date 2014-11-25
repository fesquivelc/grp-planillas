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
@Table(name = "categoria_ocupacional")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriaOcupacional.findAll", query = "SELECT c FROM CategoriaOcupacional c"),
    @NamedQuery(name = "CategoriaOcupacional.findByCodigo", query = "SELECT c FROM CategoriaOcupacional c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "CategoriaOcupacional.findByDescripcion", query = "SELECT c FROM CategoriaOcupacional c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "CategoriaOcupacional.findBySectorPrivado", query = "SELECT c FROM CategoriaOcupacional c WHERE c.sectorPrivado = :sectorPrivado"),
    @NamedQuery(name = "CategoriaOcupacional.findBySectorPublico", query = "SELECT c FROM CategoriaOcupacional c WHERE c.sectorPublico = :sectorPublico"),
    @NamedQuery(name = "CategoriaOcupacional.findByOtraEntidad", query = "SELECT c FROM CategoriaOcupacional c WHERE c.otraEntidad = :otraEntidad"),
    @NamedQuery(name = "CategoriaOcupacional.findByVigencia", query = "SELECT c FROM CategoriaOcupacional c WHERE c.vigencia = :vigencia")})
public class CategoriaOcupacional implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Codigo")
    private String codigo;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "SectorPrivado")
    private Boolean sectorPrivado;
    @Column(name = "SectorPublico")
    private Boolean sectorPublico;
    @Column(name = "OtraEntidad")
    private Boolean otraEntidad;
    @Column(name = "Vigencia")
    private Boolean vigencia;

    public CategoriaOcupacional() {
    }

    public CategoriaOcupacional(String codigo) {
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

    public Boolean getSectorPrivado() {
        return sectorPrivado;
    }

    public void setSectorPrivado(Boolean sectorPrivado) {
        this.sectorPrivado = sectorPrivado;
    }

    public Boolean getSectorPublico() {
        return sectorPublico;
    }

    public void setSectorPublico(Boolean sectorPublico) {
        this.sectorPublico = sectorPublico;
    }

    public Boolean getOtraEntidad() {
        return otraEntidad;
    }

    public void setOtraEntidad(Boolean otraEntidad) {
        this.otraEntidad = otraEntidad;
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
        if (!(object instanceof CategoriaOcupacional)) {
            return false;
        }
        CategoriaOcupacional other = (CategoriaOcupacional) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.CategoriaOcupacional[ codigo=" + codigo + " ]";
    }
    
}
