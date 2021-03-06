/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author irvin
 */
@Entity
@Table(name = "tipo_responsable", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoResponsable.findAll", query = "SELECT t FROM TipoResponsable t")
    , @NamedQuery(name = "TipoResponsable.findByNombreLike", query = "SELECT t FROM TipoResponsable t WHERE LOWER(t.nombre) LIKE CONCAT('%',LOWER(:name),'%')")
    , @NamedQuery(name = "TipoResponsable.findByIdTipoResponsable", query = "SELECT t FROM TipoResponsable t WHERE t.idTipoResponsable = :idTipoResponsable")
    , @NamedQuery(name = "TipoResponsable.findByNombre", query = "SELECT t FROM TipoResponsable t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TipoResponsable.findByObservacion", query = "SELECT t FROM TipoResponsable t WHERE t.observacion = :observacion")})
public class TipoResponsable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_responsable")
    private Integer idTipoResponsable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "observacion")
    private String observacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoReponsable")
    private List<Responsable> responsableList;

    public TipoResponsable() {
    }

    public TipoResponsable(Integer idTipoResponsable) {
        this.idTipoResponsable = idTipoResponsable;
    }

    public TipoResponsable(Integer idTipoResponsable, String nombre) {
        this.idTipoResponsable = idTipoResponsable;
        this.nombre = nombre;
    }

    public Integer getIdTipoResponsable() {
        return idTipoResponsable;
    }

    public void setIdTipoResponsable(Integer idTipoResponsable) {
        this.idTipoResponsable = idTipoResponsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @XmlTransient
    public List<Responsable> getResponsableList() {
        return responsableList;
    }

    public void setResponsableList(List<Responsable> responsableList) {
        this.responsableList = responsableList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoResponsable != null ? idTipoResponsable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoResponsable)) {
            return false;
        }
        TipoResponsable other = (TipoResponsable) object;
        if ((this.idTipoResponsable == null && other.idTipoResponsable != null) || (this.idTipoResponsable != null && !this.idTipoResponsable.equals(other.idTipoResponsable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.tpi2018.ejb.entitiesI.TipoResponsable[ idTipoResponsable=" + idTipoResponsable + " ]";
    }
    
}
