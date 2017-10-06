package br.com.gerencial.project.premissatecnologia;

import br.com.gerencial.project.utils.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_premissa_tecnologia")
public class PremissaTecnologia extends BaseEntity<PremissaTecnologiaKey>{
}
