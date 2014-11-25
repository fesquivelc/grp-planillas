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
@Table(name = "regimen_salud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegimenSalud.findAll", query = "SELECT r FROM RegimenSalud r"),
    @NamedQuery(name = "RegimenSalud.findByIdregimenSalud", query = "SELECT r FROM RegimenSalud r WHERE r.idregimenSalud = :idregimenSalud"),
    @NamedQuery(name = "RegimenSalud.findByFechaInicial", query = "SELECT r FROM RegimenSalud r WHERE r.fechaInicial = :fechaInicial"),
    @NamedQuery(name = "RegimenSalud.findByFechaFinal", query = "SELECT r FROM RegimenSalud r WHERE r.fechaFinal = :fechaFinal"),
    @NamedQuery(name = "RegimenSalud.findByVigente", query = "SELECT r FROM RegimenSalud r WHERE r.vigente = :vigente"),
    @NamedQuery(name = "RegimenSalud.findByEliminado", query = "SELECT r FROM RegimenSalud r WHERE r.eliminado = :eliminado")})
public class RegimenSalud implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idregimen_salud")
    private Long idregimenSalud;
    @Column(name = "fecha_inicial")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicial;
    @Column(name = "fecha_final")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @JoinColumn(name = "idcontrato", referencedColumnName = "idcontrato")
    @ManyToOne(optional = false)
    private Contrato idcontrato;
    @JoinColumn(name = "idtrabajador", referencedColumnName = "idtrabajador")
    @ManyToOne(optional = false)
    private Trabajador idtrabajador;

    public RegimenSalud() {
    }

    public RegimenSalud(Long idregimenSalud) {
        this.idregimenSalud = idregimenSalud;
    }

    public Long getIdregimenSalud() {
        return idregimenSalud;
    }

    public void setIdregimenSalud(Long idregimenSalud) {
        this.idregimenSalud = idregimenSalud;
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

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public Contrato getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(Contrato idcontrato) {
        this.idcontrato = idcontrato;
    }

    public Trabajador getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(Trabajador idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idregimenSalud != null ? idregimenSalud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegimenSalud)) {
            return false;
        }
        RegimenSalud other = (RegimenSalud) object;
        if ((this.idregimenSalud == null && other.idregimenSalud != null) || (this.idregimenSalud != null && !this.idregimenSalud.equals(other.idregimenSalud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.RegimenSalud[ idregimenSalud=" + idregimenSalud + " ]";
    }
    
}
