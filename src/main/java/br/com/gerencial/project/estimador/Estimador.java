package br.com.gerencial.project.estimador;

import br.com.gerencial.project.utils.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "tb_estimador")
@AttributeOverride(name="id", column = @Column(name = "id"))
public class Estimador extends BaseEntity<Long> {


}
