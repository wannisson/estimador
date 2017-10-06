package br.com.gerencial.project.userpermission;

import br.com.gerencial.project.utils.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "tb_user_permission")
public class UserPermission extends BaseEntity<UserPermissionKey> {

    private static final long serialVersionUID = 201602010251L;
}
