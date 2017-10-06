package br.com.gerencial.project.premissa;

import br.com.gerencial.project.utils.BaseEntity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_premissa")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class Premissa extends BaseEntity<Long> {

    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "desc_premissa", length = 255, nullable = false)
    private String name;

    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "texto_premissa", length = 255, nullable = false)
    private String texto;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
