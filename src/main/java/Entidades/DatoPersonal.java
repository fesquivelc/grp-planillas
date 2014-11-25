/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.io.Serializable;
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
@Table(name = "dato_personal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatoPersonal.findAll", query = "SELECT d FROM DatoPersonal d"),
    @NamedQuery(name = "DatoPersonal.findByIdDatoPersonal", query = "SELECT d FROM DatoPersonal d WHERE d.idDatoPersonal = :idDatoPersonal"),
    @NamedQuery(name = "DatoPersonal.findByFechaNacimiento", query = "SELECT d FROM DatoPersonal d WHERE d.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "DatoPersonal.findBySexo", query = "SELECT d FROM DatoPersonal d WHERE d.sexo = :sexo"),
    @NamedQuery(name = "DatoPersonal.findByCentroAsistencial", query = "SELECT d FROM DatoPersonal d WHERE d.centroAsistencial = :centroAsistencial"),
    @NamedQuery(name = "DatoPersonal.findByTelefono", query = "SELECT d FROM DatoPersonal d WHERE d.telefono = :telefono"),
    @NamedQuery(name = "DatoPersonal.findByCelular", query = "SELECT d FROM DatoPersonal d WHERE d.celular = :celular"),
    @NamedQuery(name = "DatoPersonal.findByEmail", query = "SELECT d FROM DatoPersonal d WHERE d.email = :email"),
    @NamedQuery(name = "DatoPersonal.findByCusspp", query = "SELECT d FROM DatoPersonal d WHERE d.cusspp = :cusspp"),
    @NamedQuery(name = "DatoPersonal.findByCategoria", query = "SELECT d FROM DatoPersonal d WHERE d.categoria = :categoria"),
    @NamedQuery(name = "DatoPersonal.findByEstadoCivil", query = "SELECT d FROM DatoPersonal d WHERE d.estadoCivil = :estadoCivil")})
public class DatoPersonal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idDato_Personal")
    private Integer idDatoPersonal;
    @Column(name = "Fecha_Nacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(name = "Sexo")
    private Character sexo;
    @Column(name = "Centro_Asistencial")
    private Integer centroAsistencial;
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "Celular")
    private String celular;
    @Column(name = "Email")
    private String email;
    @Column(name = "Cusspp")
    private String cusspp;
    @Column(name = "Categoria")
    private Character categoria;
    @Column(name = "EstadoCivil")
    private String estadoCivil;
    @JoinColumn(name = "idDato_Persona", referencedColumnName = "idDato_Persona")
    @ManyToOne(optional = false)
    private DatoPersona idDatoPersona;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datopersonalidDatoPersonal")
    private List<Direccion> direccionList;

    public DatoPersonal() {
    }

    public DatoPersonal(Integer idDatoPersonal) {
        this.idDatoPersonal = idDatoPersonal;
    }

    public Integer getIdDatoPersonal() {
        return idDatoPersonal;
    }

    public void setIdDatoPersonal(Integer idDatoPersonal) {
        this.idDatoPersonal = idDatoPersonal;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Integer getCentroAsistencial() {
        return centroAsistencial;
    }

    public void setCentroAsistencial(Integer centroAsistencial) {
        this.centroAsistencial = centroAsistencial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCusspp() {
        return cusspp;
    }

    public void setCusspp(String cusspp) {
        this.cusspp = cusspp;
    }

    public Character getCategoria() {
        return categoria;
    }

    public void setCategoria(Character categoria) {
        this.categoria = categoria;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public DatoPersona getIdDatoPersona() {
        return idDatoPersona;
    }

    public void setIdDatoPersona(DatoPersona idDatoPersona) {
        this.idDatoPersona = idDatoPersona;
    }

    @XmlTransient
    public List<Direccion> getDireccionList() {
        return direccionList;
    }

    public void setDireccionList(List<Direccion> direccionList) {
        this.direccionList = direccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatoPersonal != null ? idDatoPersonal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatoPersonal)) {
            return false;
        }
        DatoPersonal other = (DatoPersonal) object;
        if ((this.idDatoPersonal == null && other.idDatoPersonal != null) || (this.idDatoPersonal != null && !this.idDatoPersonal.equals(other.idDatoPersonal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DatoPersonal[ idDatoPersonal=" + idDatoPersonal + " ]";
    }
    
}
