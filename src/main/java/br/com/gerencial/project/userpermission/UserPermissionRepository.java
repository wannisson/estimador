package br.com.gerencial.project.userpermission;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPermissionRepository  extends JpaRepository<UserPermission, UserPermissionKey> {

}
