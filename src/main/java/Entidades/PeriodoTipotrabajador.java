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
@Table(name = "periodo_tipotrabajador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PeriodoTipotrabajador.findAll", query = "SELECT p FROM PeriodoTipotrabajador p"),
    @NamedQuery(name = "PeriodoTipotrabajador.findByIdperiodoTipotrabajador", query = "SELECT p FROM PeriodoTipotrabajador p WHERE p.idperiodoTipotrabajador = :idperiodoTipotrabajador"),
    @NamedQuery(name = "PeriodoTipotrabajador.findByFechaInicial", query = "SELECT p FROM PeriodoTipotrabajador p WHERE p.fechaInicial = :fechaInicial"),
    @NamedQuery(name = "PeriodoTipotrabajador.findByFechaFinal", query = "SELECT p FROM PeriodoTipotrabajador p WHERE p.fechaFinal = :fechaFinal"),
    @NamedQuery(name = "PeriodoTipotrabajador.findByVigente", query = "SELECT p FROM PeriodoTipotrabajador p WHERE p.vigente = :vigente"),
    @NamedQuery(name = "PeriodoTipotrabajador.findByEliminado", query = "SELECT p FROM PeriodoTipotrabajador p WHERE p.eliminado = :eliminado")})
public class PeriodoTipotrabajador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idperiodo_tipotrabajador")
    private Long idperiodoTipotrabajador;
    @Column(name = "fecha_inicial")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicial;
    @Column(name = "fecha_final")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;
    @Column(name = "vigente")
    private Boolean vigente;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @JoinColumn(name = "idcontrato", referencedColumnName = "idcontrato")
    @ManyToOne(optional = false)
    private Contrato idcontrato;
    @JoinColumn(name = "idtrabajador", referencedColumnName = "idtrabajador")
    @ManyToOne(optional = false)
    private Trabajador idtrabajador;

    public PeriodoTipotrabajador() {
    }

    public PeriodoTipotrabajador(Long idperiodoTipotrabajador) {
        this.idperiodoTipotrabajador = idperiodoTipotrabajador;
    }

    public Long getIdperiodoTipotrabajador() {
        return idperiodoTipotrabajador;
    }

    public void setIdperiodoTipotrabajador(Long idperiodoTipotrabajador) {
        this.idperiodoTipotrabajador = idperiodoTipotrabajador;
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
        hash += (idperiodoTipotrabajador != null ? idperiodoTipotrabajador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeriodoTipotrabajador)) {
            return false;
        }
        PeriodoTipotrabajador other = (PeriodoTipotrabajador) object;
        if ((this.idperiodoTipotrabajador == null && other.idperiodoTipotrabajador != null) || (this.idperiodoTipotrabajador != null && !this.idperiodoTipotrabajador.equals(other.idperiodoTipotrabajador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.PeriodoTipotrabajador[ idperiodoTipotrabajador=" + idperiodoTipotrabajador + " ]";
    }
    
}
