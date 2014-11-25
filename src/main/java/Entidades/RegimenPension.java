/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alejandra
 */
@Entity
@Table(name = "regimen_pension")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegimenPension.findAll", query = "SELECT r FROM RegimenPension r"),
    @NamedQuery(name = "RegimenPension.findByIdregimenPension", query = "SELECT r FROM RegimenPension r WHERE r.idregimenPension = :idregimenPension"),
    @NamedQuery(name = "RegimenPension.findByFechaInicial", query = "SELECT r FROM RegimenPension r WHERE r.fechaInicial = :fechaInicial"),
    @NamedQuery(name = "RegimenPension.findByFechaFinal", query = "SELECT r FROM RegimenPension r WHERE r.fechaFinal = :fechaFinal"),
    @NamedQuery(name = "RegimenPension.findByVigente", query = "SELECT r FROM RegimenPension r WHERE r.vigente = :vigente"),
    @NamedQuery(name = "RegimenPension.findByTipoComision", query = "SELECT r FROM RegimenPension r WHERE r.tipoComision = :tipoComision"),
    @NamedQuery(name = "RegimenPension.findByEliminado", query = "SELECT r FROM RegimenPension r WHERE r.eliminado = :eliminado")})
public class RegimenPension implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idregimen_pension")
    private Long idregimenPension;
    @Column(name = "fecha_inicial")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicial;
    @Column(name = "fecha_final")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;
    @Column(name = "vigente")
    private Boolean vigente;
    @Column(name = "tipo_comision")
    private Character tipoComision;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @JoinColumn(name = "idtrabajador", referencedColumnName = "idtrabajador")
    @ManyToOne(optional = false)
    private Trabajador idtrabajador;
    @JoinColumn(name = "idcontrato", referencedColumnName = "idcontrato")
    @ManyToOne(optional = false)
    private Contrato idcontrato;

    public RegimenPension() {
    }

    public RegimenPension(Long idregimenPension) {
        this.idregimenPension = idregimenPension;
    }

    public Long getIdregimenPension() {
        return idregimenPension;
    }

    public void setIdregimenPension(Long idregimenPension) {
        this.idregimenPension = idregimenPension;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public Character getTipoComision() {
        return tipoComision;
    }

    public void setTipoComision(Character tipoComision) {
        this.tipoComision = tipoComision;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public Trabajador getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(Trabajador idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public Contrato getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(Contrato idcontrato) {
        this.idcontrato = idcontrato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idregimenPension != null ? idregimenPension.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegimenPension)) {
            return false;
        }
        RegimenPension other = (RegimenPension) object;
        if ((this.idregimenPension == null && other.idregimenPension != null) || (this.idregimenPension != null && !this.idregimenPension.equals(other.idregimenPension))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.RegimenPension[ idregimenPension=" + idregimenPension + " ]";
    }
    
}
