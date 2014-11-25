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
@Table(name = "tipo_trabajador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoTrabajador.findAll", query = "SELECT t FROM TipoTrabajador t"),
    @NamedQuery(name = "TipoTrabajador.findByCodigo", query = "SELECT t FROM TipoTrabajador t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TipoTrabajador.findByDescripcion", query = "SELECT t FROM TipoTrabajador t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TipoTrabajador.findByAbreviatura", query = "SELECT t FROM TipoTrabajador t WHERE t.abreviatura = :abreviatura"),
    @NamedQuery(name = "TipoTrabajador.findBySectorPrivado", query = "SELECT t FROM TipoTrabajador t WHERE t.sectorPrivado = :sectorPrivado"),
    @NamedQuery(name = "TipoTrabajador.findBySectorPublico", query = "SELECT t FROM TipoTrabajador t WHERE t.sectorPublico = :sectorPublico"),
    @NamedQuery(name = "TipoTrabajador.findByOtraEntidad", query = "SELECT t FROM TipoTrabajador t WHERE t.otraEntidad = :otraEntidad"),
    @NamedQuery(name = "TipoTrabajador.findByVigencia", query = "SELECT t FROM TipoTrabajador t WHERE t.vigencia = :vigencia")})
public class TipoTrabajador implements Serializable {
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

    public TipoTrabajador() {
    }

    public TipoTrabajador(String codigo) {
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
        if (!(object instanceof TipoTrabajador)) {
            return false;
        }
        TipoTrabajador other = (TipoTrabajador) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TipoTrabajador[ codigo=" + codigo + " ]";
    }
    
}
