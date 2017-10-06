package br.com.gerencial.project.premissatecnologia;

import br.com.gerencial.project.utils.BaseKey;

import javax.persistence.Column;

public class PremissaTecnologiaKey extends BaseKey {

    @Column(name = "id_tecnologia", length = 11, nullable = false)
    private Long tecnologiaId;

    @Column(name = "id_premissa", length = 11, nullable = false)
    private Long premissaId;

    public PremissaTecnologiaKey() {
    }

    public PremissaTecnologiaKey(Long tecnologiaId, Long premissaId) {
        super();
        this.tecnologiaId = tecnologiaId;
        this.premissaId = premissaId;
    }

    public Long getTecnologiaId() {
        return tecnologiaId;
    }

    public void setTecnologiaId(Long tecnologiaId) {
        this.tecnologiaId = tecnologiaId;
    }

    public Long getPremissaId() {
        return premissaId;
    }

    public void setPremissaId(Long premissaId) {
        this.premissaId = premissaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PremissaTecnologiaKey that = (PremissaTecnologiaKey) o;

        if (tecnologiaId != null ? !tecnologiaId.equals(that.tecnologiaId) : that.tecnologiaId != null) return false;
        return premissaId != null ? premissaId.equals(that.premissaId) : that.premissaId == null;
    }

    @Override
    public int hashCode() {
        int result = tecnologiaId != null ? tecnologiaId.hashCode() : 0;
        result = 31 * result + (premissaId != null ? premissaId.hashCode() : 0);
        return result;
    }
}
