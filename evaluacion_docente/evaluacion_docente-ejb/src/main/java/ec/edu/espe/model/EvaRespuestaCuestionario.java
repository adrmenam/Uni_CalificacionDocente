/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author adrianmena
 */
@Entity
@Table(name = "eva_respuesta_cuestionario")
public class EvaRespuestaCuestionario implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    private EvaRespuestaCuestionarioPK evaRespuestaCuestionarioPK;

    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @NotNull
    @Column(name = "CALIFICACION_PROMEDIO")
    private BigDecimal calificacionPromedio;

    public EvaRespuestaCuestionario() {
    }

    public EvaRespuestaCuestionario(EvaRespuestaCuestionarioPK evaRespuestaCuestionarioPK) {
        this.evaRespuestaCuestionarioPK = evaRespuestaCuestionarioPK;
    }

    public EvaRespuestaCuestionarioPK getEvaRespuestaCuestionarioPK() {
        return evaRespuestaCuestionarioPK;
    }

    public void setEvaRespuestaCuestionarioPK(EvaRespuestaCuestionarioPK evaRespuestaCuestionarioPK) {
        this.evaRespuestaCuestionarioPK = evaRespuestaCuestionarioPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getCalificacionPromedio() {
        return calificacionPromedio;
    }

    public void setCalificacionPromedio(BigDecimal calificacionPromedio) {
        this.calificacionPromedio = calificacionPromedio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (evaRespuestaCuestionarioPK != null ? evaRespuestaCuestionarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaRespuestaCuestionario)) {
            return false;
        }
        EvaRespuestaCuestionario other = (EvaRespuestaCuestionario) object;
        if ((this.evaRespuestaCuestionarioPK == null && other.evaRespuestaCuestionarioPK != null) || (this.evaRespuestaCuestionarioPK != null && !this.evaRespuestaCuestionarioPK.equals(other.evaRespuestaCuestionarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EvaRespuestaCuestionario{" + "evaRespuestaCuestionarioPK=" + evaRespuestaCuestionarioPK + ", fecha=" + fecha + ", calificacionPromedio=" + calificacionPromedio + '}';
    }

}
