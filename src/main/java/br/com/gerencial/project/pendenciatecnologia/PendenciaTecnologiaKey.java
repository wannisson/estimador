package br.com.gerencial.project.pendenciatecnologia;

import br.com.gerencial.project.utils.BaseKey;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


public class PendenciaTecnologiaKey extends BaseKey {

    @Column(name = "id_tecnologia", length = 11, nullable = false)
    private Long tecnologiaId;

    @Column(name = "id_pendencia", length = 11, nullable = false)
    private Long pendenciaId;

    public PendenciaTecnologiaKey() {
    }

    public PendenciaTecnologiaKey(Long tecnologiaId, Long pendenciaId) {
        super();
        this.tecnologiaId = tecnologiaId;
        this.pendenciaId = pendenciaId;
    }


    public Long getTecnologiaId() {
        return tecnologiaId;
    }

    public void setTecnologiaId(Long tecnologiaId) {
        this.tecnologiaId = tecnologiaId;
    }

    public Long getPendenciaId() {
        return pendenciaId;
    }

    public void setPendenciaId(Long pendenciaId) {
        this.pendenciaId = pendenciaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PendenciaTecnologiaKey that = (PendenciaTecnologiaKey) o;

        if (tecnologiaId != null ? !tecnologiaId.equals(that.tecnologiaId) : that.tecnologiaId != null) return false;
        return pendenciaId != null ? pendenciaId.equals(that.pendenciaId) : that.pendenciaId == null;
    }

    @Override
    public int hashCode() {
        int result = tecnologiaId != null ? tecnologiaId.hashCode() : 0;
        result = 31 * result + (pendenciaId != null ? pendenciaId.hashCode() : 0);
        return result;
    }
}
