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
@Table(name = "ubigeo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ubigeo.findAll", query = "SELECT u FROM Ubigeo u"),
    @NamedQuery(name = "Ubigeo.findByCodigo", query = "SELECT u FROM Ubigeo u WHERE u.codigo = :codigo"),
    @NamedQuery(name = "Ubigeo.findByDepartamento", query = "SELECT u FROM Ubigeo u WHERE u.departamento = :departamento"),
    @NamedQuery(name = "Ubigeo.findByDistrito", query = "SELECT u FROM Ubigeo u WHERE u.distrito = :distrito"),
    @NamedQuery(name = "Ubigeo.findByProvincia", query = "SELECT u FROM Ubigeo u WHERE u.provincia = :provincia"),
    @NamedQuery(name = "Ubigeo.findByVigencia", query = "SELECT u FROM Ubigeo u WHERE u.vigencia = :vigencia")})
public class Ubigeo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Codigo")
    private String codigo;
    @Column(name = "Departamento")
    private String departamento;
    @Column(name = "Distrito")
    private String distrito;
    @Column(name = "Provincia")
    private String provincia;
    @Column(name = "Vigencia")
    private Boolean vigencia;

    public Ubigeo() {
    }

    public Ubigeo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
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
        if (!(object instanceof Ubigeo)) {
            return false;
        }
        Ubigeo other = (Ubigeo) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Ubigeo[ codigo=" + codigo + " ]";
    }
    
}
