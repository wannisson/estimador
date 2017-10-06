package br.com.gerencial.project.pendencia;

import br.com.gerencial.project.tecnologia.Tecnologia;
import br.com.gerencial.project.utils.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "tb_pendencia")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class Pendencia extends BaseEntity<Long> {

    private static final long serialVersionUID = 201602010251L;

    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "desc_pendencia", length = 255, nullable = false)
    private String name;

    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "texto_pendencia", length = 255, nullable = false)
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

