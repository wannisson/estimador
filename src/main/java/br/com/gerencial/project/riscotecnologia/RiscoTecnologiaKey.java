package br.com.gerencial.project.riscotecnologia;

import br.com.gerencial.project.utils.BaseKey;

import javax.persistence.Column;

public class RiscoTecnologiaKey extends BaseKey {

    @Column(name = "id_tecnologia", length = 11, nullable = false)
    private Long tecnologiaId;


    @Column(name = "id_risco", length = 11, nullable = false)
    private Long riscoId;

    public RiscoTecnologiaKey() {
    }

    public RiscoTecnologiaKey(Long tecnologiaId, Long riscoId) {
        super();
        this.tecnologiaId = tecnologiaId;
        this.riscoId = riscoId;
    }

    public Long getTecnologiaId() {
        return tecnologiaId;
    }

    public void setTecnologiaId(Long tecnologiaId) {
        this.tecnologiaId = tecnologiaId;
    }

    public Long getRiscoId() {
        return riscoId;
    }

    public void setRiscoId(Long riscoId) {
        this.riscoId = riscoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RiscoTecnologiaKey that = (RiscoTecnologiaKey) o;

        if (tecnologiaId != null ? !tecnologiaId.equals(that.tecnologiaId) : that.tecnologiaId != null) return false;
        return riscoId != null ? riscoId.equals(that.riscoId) : that.riscoId == null;
    }

    @Override
    public int hashCode() {
        int result = tecnologiaId != null ? tecnologiaId.hashCode() : 0;
        result = 31 * result + (riscoId != null ? riscoId.hashCode() : 0);
        return result;
    }
}
