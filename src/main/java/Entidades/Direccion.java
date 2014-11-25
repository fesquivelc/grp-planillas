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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alejandra
 */
@Entity
@Table(name = "direccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direccion.findAll", query = "SELECT d FROM Direccion d"),
    @NamedQuery(name = "Direccion.findByIddireccion", query = "SELECT d FROM Direccion d WHERE d.iddireccion = :iddireccion"),
    @NamedQuery(name = "Direccion.findByNombreVia", query = "SELECT d FROM Direccion d WHERE d.nombreVia = :nombreVia"),
    @NamedQuery(name = "Direccion.findByNroVia", query = "SELECT d FROM Direccion d WHERE d.nroVia = :nroVia"),
    @NamedQuery(name = "Direccion.findByDepartamento", query = "SELECT d FROM Direccion d WHERE d.departamento = :departamento"),
    @NamedQuery(name = "Direccion.findByInterior", query = "SELECT d FROM Direccion d WHERE d.interior = :interior"),
    @NamedQuery(name = "Direccion.findByManzana", query = "SELECT d FROM Direccion d WHERE d.manzana = :manzana"),
    @NamedQuery(name = "Direccion.findByLote", query = "SELECT d FROM Direccion d WHERE d.lote = :lote"),
    @NamedQuery(name = "Direccion.findByKilometro", query = "SELECT d FROM Direccion d WHERE d.kilometro = :kilometro"),
    @NamedQuery(name = "Direccion.findByBlock", query = "SELECT d FROM Direccion d WHERE d.block = :block"),
    @NamedQuery(name = "Direccion.findByEtapa", query = "SELECT d FROM Direccion d WHERE d.etapa = :etapa"),
    @NamedQuery(name = "Direccion.findByNombreZona", query = "SELECT d FROM Direccion d WHERE d.nombreZona = :nombreZona"),
    @NamedQuery(name = "Direccion.findByReferencia", query = "SELECT d FROM Direccion d WHERE d.referencia = :referencia"),
    @NamedQuery(name = "Direccion.findByNumero", query = "SELECT d FROM Direccion d WHERE d.numero = :numero")})
public class Direccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "iddireccion")
    private Integer iddireccion;
    @Column(name = "nombre_via")
    private String nombreVia;
    @Column(name = "nro_via")
    private String nroVia;
    @Column(name = "departamento")
    private String departamento;
    @Column(name = "interior")
    private String interior;
    @Column(name = "manzana")
    private String manzana;
    @Column(name = "lote")
    private String lote;
    @Column(name = "kilometro")
    private String kilometro;
    @Column(name = "block")
    private String block;
    @Column(name = "etapa")
    private String etapa;
    @Column(name = "nombre_zona")
    private String nombreZona;
    @Column(name = "referencia")
    private String referencia;
    @Column(name = "numero")
    private Integer numero;
    @JoinColumn(name = "dato_personal_idDato_Personal", referencedColumnName = "idDato_Personal")
    @ManyToOne(optional = false)
    private DatoPersonal datopersonalidDatoPersonal;

    public Direccion() {
    }

    public Direccion(Integer iddireccion) {
        this.iddireccion = iddireccion;
    }

    public Integer getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(Integer iddireccion) {
        this.iddireccion = iddireccion;
    }

    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public String getNroVia() {
        return nroVia;
    }

    public void setNroVia(String nroVia) {
        this.nroVia = nroVia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getKilometro() {
        return kilometro;
    }

    public void setKilometro(String kilometro) {
        this.kilometro = kilometro;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public DatoPersonal getDatopersonalidDatoPersonal() {
        return datopersonalidDatoPersonal;
    }

    public void setDatopersonalidDatoPersonal(DatoPersonal datopersonalidDatoPersonal) {
        this.datopersonalidDatoPersonal = datopersonalidDatoPersonal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddireccion != null ? iddireccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.iddireccion == null && other.iddireccion != null) || (this.iddireccion != null && !this.iddireccion.equals(other.iddireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Direccion[ iddireccion=" + iddireccion + " ]";
    }
    
}
