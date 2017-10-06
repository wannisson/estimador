package br.com.gerencial.test.project.userpermission;

import br.com.gerencial.project.permission.PermissionRepository;
import br.com.gerencial.project.user.UserRepository;
import br.com.gerencial.project.userpermission.UserPermission;
import br.com.gerencial.project.userpermission.UserPermissionKey;
import br.com.gerencial.project.userpermission.UserPermissionRepository;
import br.com.gerencial.test.project.utils.BaseEntityTest;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class UserPermissionRepositoryTest extends BaseEntityTest {

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    @Autowired
    private UserPermissionRepository userPermissionRepository;

    @Autowired
    private PermissionRepository permissionRepository;

    @Autowired
    private UserRepository userRepository;


    @Ignore
    @Test
    public void findAll_success() {
        List<UserPermission> userPermissions = userPermissionRepository.findAll();

        LOGGER.debug(userPermissions);

        assertNotNull(userPermissions);
        assertTrue(userPermissions.size() > 0);
    }

    @Ignore
    @Test
    public void insert() {
        UserPermissionKey objUserPermissionKey = new UserPermissionKey();
        UserPermission objUserPermission = new UserPermission();

        objUserPermissionKey.setUserId(userRepository.getOne(1L).getId());
        objUserPermissionKey.setPermissionId(permissionRepository.getOne(1L).getId());

        objUserPermission.setId(objUserPermissionKey);

        userPermissionRepository.save(objUserPermission);
    }

}
