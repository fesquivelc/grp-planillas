/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author alejandra
 */
@Entity
@Table(name = "trabajador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trabajador.findAll", query = "SELECT t FROM Trabajador t"),
    @NamedQuery(name = "Trabajador.findByIdtrabajador", query = "SELECT t FROM Trabajador t WHERE t.idtrabajador = :idtrabajador"),
    @NamedQuery(name = "Trabajador.findByDiscapacidad", query = "SELECT t FROM Trabajador t WHERE t.discapacidad = :discapacidad"),
    @NamedQuery(name = "Trabajador.findBySctr", query = "SELECT t FROM Trabajador t WHERE t.sctr = :sctr"),
    @NamedQuery(name = "Trabajador.findBySujetoRegimen", query = "SELECT t FROM Trabajador t WHERE t.sujetoRegimen = :sujetoRegimen"),
    @NamedQuery(name = "Trabajador.findByJornadaMaxima", query = "SELECT t FROM Trabajador t WHERE t.jornadaMaxima = :jornadaMaxima"),
    @NamedQuery(name = "Trabajador.findByHorarioNocturno", query = "SELECT t FROM Trabajador t WHERE t.horarioNocturno = :horarioNocturno"),
    @NamedQuery(name = "Trabajador.findBySindicalizado", query = "SELECT t FROM Trabajador t WHERE t.sindicalizado = :sindicalizado"),
    @NamedQuery(name = "Trabajador.findBySituacionEspecial", query = "SELECT t FROM Trabajador t WHERE t.situacionEspecial = :situacionEspecial"),
    @NamedQuery(name = "Trabajador.findByRuc", query = "SELECT t FROM Trabajador t WHERE t.ruc = :ruc"),
    @NamedQuery(name = "Trabajador.findByMadreResponsabilidad", query = "SELECT t FROM Trabajador t WHERE t.madreResponsabilidad = :madreResponsabilidad"),
    @NamedQuery(name = "Trabajador.findByRucEmpleador", query = "SELECT t FROM Trabajador t WHERE t.rucEmpleador = :rucEmpleador"),
    @NamedQuery(name = "Trabajador.findByTipoCentroformacion", query = "SELECT t FROM Trabajador t WHERE t.tipoCentroformacion = :tipoCentroformacion"),
    @NamedQuery(name = "Trabajador.findByRentaQuinta", query = "SELECT t FROM Trabajador t WHERE t.rentaQuinta = :rentaQuinta")})
public class Trabajador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idtrabajador")
    private Long idtrabajador;
    @Column(name = "discapacidad")
    private Boolean discapacidad;
    @Column(name = "sctr")
    private String sctr;
    @Column(name = "sujeto_regimen")
    private Boolean sujetoRegimen;
    @Column(name = "jornada_maxima")
    private Boolean jornadaMaxima;
    @Column(name = "horario_nocturno")
    private Boolean horarioNocturno;
    @Column(name = "sindicalizado")
    private Boolean sindicalizado;
    @Column(name = "situacion_especial")
    private Integer situacionEspecial;
    @Column(name = "ruc")
    private String ruc;
    @Column(name = "madre_responsabilidad")
    private Boolean madreResponsabilidad;
    @Column(name = "ruc_empleador")
    private String rucEmpleador;
    @Column(name = "tipo_centroformacion")
    private Integer tipoCentroformacion;
    @Column(name = "renta_quinta")
    private Boolean rentaQuinta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtrabajador")
    private List<PeriodoTipotrabajador> periodoTipotrabajadorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtrabajador")
    private List<RegimenPension> regimenPensionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtrabajador")
    private List<RegimenSalud> regimenSaludList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtrabajador")
    private List<Contrato> contratoList;

    public Trabajador() {
    }

    public Trabajador(Long idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public Long getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(Long idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public Boolean getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(Boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getSctr() {
        return sctr;
    }

    public void setSctr(String sctr) {
        this.sctr = sctr;
    }

    public Boolean getSujetoRegimen() {
        return sujetoRegimen;
    }

    public void setSujetoRegimen(Boolean sujetoRegimen) {
        this.sujetoRegimen = sujetoRegimen;
    }

    public Boolean getJornadaMaxima() {
        return jornadaMaxima;
    }

    public void setJornadaMaxima(Boolean jornadaMaxima) {
        this.jornadaMaxima = jornadaMaxima;
    }

    public Boolean getHorarioNocturno() {
        return horarioNocturno;
    }

    public void setHorarioNocturno(Boolean horarioNocturno) {
        this.horarioNocturno = horarioNocturno;
    }

    public Boolean getSindicalizado() {
        return sindicalizado;
    }

    public void setSindicalizado(Boolean sindicalizado) {
        this.sindicalizado = sindicalizado;
    }

    public Integer getSituacionEspecial() {
        return situacionEspecial;
    }

    public void setSituacionEspecial(Integer situacionEspecial) {
        this.situacionEspecial = situacionEspecial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Boolean getMadreResponsabilidad() {
        return madreResponsabilidad;
    }

    public void setMadreResponsabilidad(Boolean madreResponsabilidad) {
        this.madreResponsabilidad = madreResponsabilidad;
    }

    public String getRucEmpleador() {
        return rucEmpleador;
    }

    public void setRucEmpleador(String rucEmpleador) {
        this.rucEmpleador = rucEmpleador;
    }

    public Integer getTipoCentroformacion() {
        return tipoCentroformacion;
    }

    public void setTipoCentroformacion(Integer tipoCentroformacion) {
        this.tipoCentroformacion = tipoCentroformacion;
    }

    public Boolean getRentaQuinta() {
        return rentaQuinta;
    }

    public void setRentaQuinta(Boolean rentaQuinta) {
        this.rentaQuinta = rentaQuinta;
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

    @XmlTransient
    public List<Contrato> getContratoList() {
        return contratoList;
    }

    public void setContratoList(List<Contrato> contratoList) {
        this.contratoList = contratoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtrabajador != null ? idtrabajador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabajador)) {
            return false;
        }
        Trabajador other = (Trabajador) object;
        if ((this.idtrabajador == null && other.idtrabajador != null) || (this.idtrabajador != null && !this.idtrabajador.equals(other.idtrabajador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Trabajador[ idtrabajador=" + idtrabajador + " ]";
    }
    
}
