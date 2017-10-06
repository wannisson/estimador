package br.com.gerencial.project.permission;

import br.com.gerencial.project.utils.BaseEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_permission")
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class Permission extends BaseEntity<Long> {

    private static final long serialVersionUID = 201602010401L;

    @NotNull
    @NotEmpty
    @Size(max = 45)
    @Column(name = "role", length = 45, nullable = false, unique = true)
    private String role;

    public Permission() {
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}