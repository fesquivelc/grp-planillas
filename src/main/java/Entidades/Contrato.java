/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author alejandra
 */
@Entity
@Table(name = "contrato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c"),
    @NamedQuery(name = "Contrato.findByIdcontrato", query = "SELECT c FROM Contrato c WHERE c.idcontrato = :idcontrato"),
    @NamedQuery(name = "Contrato.findByFechaInicial", query = "SELECT c FROM Contrato c WHERE c.fechaInicial = :fechaInicial"),
    @NamedQuery(name = "Contrato.findByFechaFinal", query = "SELECT c FROM Contrato c WHERE c.fechaFinal = :fechaFinal"),
    @NamedQuery(name = "Contrato.findByEssaludVida", query = "SELECT c FROM Contrato c WHERE c.essaludVida = :essaludVida"),
    @NamedQuery(name = "Contrato.findByAsignacionFamiliar", query = "SELECT c FROM Contrato c WHERE c.asignacionFamiliar = :asignacionFamiliar"),
    @NamedQuery(name = "Contrato.findBySueldo", query = "SELECT c FROM Contrato c WHERE c.sueldo = :sueldo"),
    @NamedQuery(name = "Contrato.findByVigente", query = "SELECT c FROM Contrato c WHERE c.vigente = :vigente"),
    @NamedQuery(name = "Contrato.findByEliminado", query = "SELECT c FROM Contrato c WHERE c.eliminado = :eliminado")})
public class Contrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idcontrato")
    private Long idcontrato;
    @Column(name = "fecha_inicial")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicial;
    @Column(name = "fecha_final")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;
    @Column(name = "essalud_vida")
    private String essaludVida;
    @Column(name = "asignacion_familiar")
    private String asignacionFamiliar;
    @Column(name = "sueldo")
    private BigInteger sueldo;
    @Column(name = "vigente")
    private Boolean vigente;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcontrato")
    private List<PeriodoTipotrabajador> periodoTipotrabajadorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcontrato")
    private List<RegimenPension> regimenPensionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcontrato")
    private List<RegimenSalud> regimenSaludList;
    @JoinColumn(name = "idtrabajador", referencedColumnName = "idtrabajador")
    @ManyToOne(optional = false)
    private Trabajador idtrabajador;

    public Contrato() {
    }

    public Contrato(Long idcontrato) {
        this.idcontrato = idcontrato;
    }

    public Long getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(Long idcontrato) {
        this.idcontrato = idcontrato;
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

    public String getEssaludVida() {
        return essaludVida;
    }

    public void setEssaludVida(String essaludVida) {
        this.essaludVida = essaludVida;
    }

    public String getAsignacionFamiliar() {
        return asignacionFamiliar;
    }

    public void setAsignacionFamiliar(String asignacionFamiliar) {
        this.asignacionFamiliar = asignacionFamiliar;
    }

    public BigInteger getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigInteger sueldo) {
        this.sueldo = sueldo;
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

    @XmlTransient
    public List<PeriodoTipotrabajador> getPeriodoTipotrabajadorList() {
        return periodoTipotrabajadorList;
    }

    public void setPeriodoTipotrabajadorList(List<PeriodoTipotrabajador> periodoTipotrabajadorList) {
        this.periodoTipotrabajadorList = periodoTipotrabajadorList;
    }

    @XmlTransient
    public List<RegimenPension> getRegimenPensionList() {
        return regimenPensionList;
    }

    public void setRegimenPensionList(List<RegimenPension> regimenPensionList) {
        this.regimenPensionList = regimenPensionList;
    }

    @XmlTransient
    public List<RegimenSalud> getRegimenSaludList() {
        return regimenSaludList;
    }

    public void setRegimenSaludList(List<RegimenSalud> regimenSaludList) {
        this.regimenSaludList = regimenSaludList;
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
        hash += (idcontrato != null ? idcontrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.idcontrato == null && other.idcontrato != null) || (this.idcontrato != null && !this.idcontrato.equals(other.idcontrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Contrato[ idcontrato=" + idcontrato + " ]";
    }
    
}
