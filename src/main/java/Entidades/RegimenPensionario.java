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
@Table(name = "regimen_pensionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegimenPensionario.findAll", query = "SELECT r FROM RegimenPensionario r"),
    @NamedQuery(name = "RegimenPensionario.findByCodigo", query = "SELECT r FROM RegimenPensionario r WHERE r.codigo = :codigo"),
    @NamedQuery(name = "RegimenPensionario.findByDescripcion", query = "SELECT r FROM RegimenPensionario r WHERE r.descripcion = :descripcion"),
    @NamedQuery(name = "RegimenPensionario.findByAbreviatura", query = "SELECT r FROM RegimenPensionario r WHERE r.abreviatura = :abreviatura"),
    @NamedQuery(name = "RegimenPensionario.findBySectorPrivado", query = "SELECT r FROM RegimenPensionario r WHERE r.sectorPrivado = :sectorPrivado"),
    @NamedQuery(name = "RegimenPensionario.findBySectorPublico", query = "SELECT r FROM RegimenPensionario r WHERE r.sectorPublico = :sectorPublico"),
    @NamedQuery(name = "RegimenPensionario.findByOtraEntidad", query = "SELECT r FROM RegimenPensionario r WHERE r.otraEntidad = :otraEntidad"),
    @NamedQuery(name = "RegimenPensionario.findByVigencia", query = "SELECT r FROM RegimenPensionario r WHERE r.vigencia = :vigencia")})
public class RegimenPensionario implements Serializable {
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

    public RegimenPensionario() {
    }

    public RegimenPensionario(String codigo) {
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
        if (!(object instanceof RegimenPensionario)) {
            return false;
        }
        RegimenPensionario other = (RegimenPensionario) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.RegimenPensionario[ codigo=" + codigo + " ]";
    }
    
}
