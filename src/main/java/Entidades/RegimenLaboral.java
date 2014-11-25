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
@Table(name = "regimen_laboral")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegimenLaboral.findAll", query = "SELECT r FROM RegimenLaboral r"),
    @NamedQuery(name = "RegimenLaboral.findByCodigo", query = "SELECT r FROM RegimenLaboral r WHERE r.codigo = :codigo"),
    @NamedQuery(name = "RegimenLaboral.findByDescripcion", query = "SELECT r FROM RegimenLaboral r WHERE r.descripcion = :descripcion"),
    @NamedQuery(name = "RegimenLaboral.findByAbreviatura", query = "SELECT r FROM RegimenLaboral r WHERE r.abreviatura = :abreviatura"),
    @NamedQuery(name = "RegimenLaboral.findBySectorPrivado", query = "SELECT r FROM RegimenLaboral r WHERE r.sectorPrivado = :sectorPrivado"),
    @NamedQuery(name = "RegimenLaboral.findBySectorPublico", query = "SELECT r FROM RegimenLaboral r WHERE r.sectorPublico = :sectorPublico"),
    @NamedQuery(name = "RegimenLaboral.findByOtraEntidad", query = "SELECT r FROM RegimenLaboral r WHERE r.otraEntidad = :otraEntidad"),
    @NamedQuery(name = "RegimenLaboral.findByVigencia", query = "SELECT r FROM RegimenLaboral r WHERE r.vigencia = :vigencia")})
public class RegimenLaboral implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Codigo")
    private String codigo;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Abreviatura")
    private String abreviatura;
    @Column(name = "SectorPrivado")
    private Boolean sectorPrivado;
    @Column(name = "SectorPublico")
    private Boolean sectorPublico;
    @Column(name = "OtraEntidad")
    private Boolean otraEntidad;
    @Column(name = "Vigencia")
    private Boolean vigencia;

    public RegimenLaboral() {
    }

    public RegimenLaboral(String codigo) {
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
        if (!(object instanceof RegimenLaboral)) {
            return false;
        }
        RegimenLaboral other = (RegimenLaboral) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.RegimenLaboral[ codigo=" + codigo + " ]";
    }
    
}
