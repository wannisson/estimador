package br.com.gerencial.project.tecnologia;

import br.com.gerencial.project.pendencia.Pendencia;
import br.com.gerencial.project.premissa.Premissa;
import br.com.gerencial.project.risco.Risco;
import br.com.gerencial.project.utils.BaseEntity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


@Entity
@Table(name = "tb_tecnologia")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class Tecnologia extends BaseEntity<Long> {

    private static final long serialVersionUID = 201602010251L;

    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "desc_tecnologia", length = 255, nullable = false)
    private String name;

    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "sigla", length = 255, nullable = false)
    private String sigla;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tb_risco_tecnologia", joinColumns = @JoinColumn(name = "id_risco"), inverseJoinColumns = @JoinColumn(name = "id_tecnologia"))
    private List<Risco> riscos;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tb_pendencia_tecnologia", joinColumns = @JoinColumn(name = "id_pendencia"), inverseJoinColumns = @JoinColumn(name = "id_tecnologia"))
    private List<Pendencia> pendencia;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tb_premissa_tecnologia", joinColumns = @JoinColumn(name = "id_premissa"), inverseJoinColumns = @JoinColumn(name = "id_tecnologia"))
    private List<Premissa> premissa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Risco> getRiscos() {
        return riscos;
    }

    public void setRiscos(List<Risco> riscos) {
        this.riscos = riscos;
    }

    public List<Pendencia> getPendencia() {
        return pendencia;
    }

    public void setPendencia(List<Pendencia> pendencia) {
        this.pendencia = pendencia;
    }

    public List<Premissa> getPremissa() {
        return premissa;
    }

    public void setPremissa(List<Premissa> premissa) {
        this.premissa = premissa;
    }
}