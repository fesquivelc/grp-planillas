/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "dato_persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatoPersona.findAll", query = "SELECT d FROM DatoPersona d"),
    @NamedQuery(name = "DatoPersona.findByIdDatoPersona", query = "SELECT d FROM DatoPersona d WHERE d.idDatoPersona = :idDatoPersona"),
    @NamedQuery(name = "DatoPersona.findByNombres", query = "SELECT d FROM DatoPersona d WHERE d.nombres = :nombres"),
    @NamedQuery(name = "DatoPersona.findByApellidopaterno", query = "SELECT d FROM DatoPersona d WHERE d.apellidopaterno = :apellidopaterno"),
    @NamedQuery(name = "DatoPersona.findByApellidoMaterno", query = "SELECT d FROM DatoPersona d WHERE d.apellidoMaterno = :apellidoMaterno"),
    @NamedQuery(name = "DatoPersona.findByNumerodocumento", query = "SELECT d FROM DatoPersona d WHERE d.numerodocumento = :numerodocumento"),
    @NamedQuery(name = "DatoPersona.findByVigente", query = "SELECT d FROM DatoPersona d WHERE d.vigente = :vigente"),
    @NamedQuery(name = "DatoPersona.findByCodigohouse", query = "SELECT d FROM DatoPersona d WHERE d.codigohouse = :codigohouse")})
public class DatoPersona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idDato_Persona")
    private Integer idDatoPersona;
    @Column(name = "Nombres")
    private String nombres;
    @Basic(optional = false)
    @Column(name = "Apellido_paterno")
    private String apellidopaterno;
    @Column(name = "Apellido_Materno")
    private String apellidoMaterno;
    @Column(name = "Numero_documento")
    private String numerodocumento;
    @Column(name = "Vigente")
    private String vigente;
    @Column(name = "Codigo_house")
    private BigInteger codigohouse;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDatoPersona")
    private List<DatoPersonal> datoPersonalList;

    public DatoPersona() {
    }

    public DatoPersona(Integer idDatoPersona) {
        this.idDatoPersona = idDatoPersona;
    }

    public DatoPersona(Integer idDatoPersona, String apellidopaterno) {
        this.idDatoPersona = idDatoPersona;
        this.apellidopaterno = apellidopaterno;
    }

    public Integer getIdDatoPersona() {
        return idDatoPersona;
    }

    public void setIdDatoPersona(Integer idDatoPersona) {
        this.idDatoPersona = idDatoPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNumerodocumento() {
        return numerodocumento;
    }

    public void setNumerodocumento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    public String getVigente() {
        return vigente;
    }

    public void setVigente(String vigente) {
        this.vigente = vigente;
    }

    public BigInteger getCodigohouse() {
        return codigohouse;
    }

    public void setCodigohouse(BigInteger codigohouse) {
        this.codigohouse = codigohouse;
    }

    @XmlTransient
    public List<DatoPersonal> getDatoPersonalList() {
        return datoPersonalList;
    }

    public void setDatoPersonalList(List<DatoPersonal> datoPersonalList) {
        this.datoPersonalList = datoPersonalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatoPersona != null ? idDatoPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatoPersona)) {
            return false;
        }
        DatoPersona other = (DatoPersona) object;
        if ((this.idDatoPersona == null && other.idDatoPersona != null) || (this.idDatoPersona != null && !this.idDatoPersona.equals(other.idDatoPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DatoPersona[ idDatoPersona=" + idDatoPersona + " ]";
    }
    
}
