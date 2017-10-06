package br.com.gerencial.project.permission;

import br.com.gerencial.project.utils.GenericService;
import br.com.gerencial.project.utils.ResourcePaths;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = ResourcePaths.PERMISSION_PATH)
public class PermissionResource extends GenericService<Permission, Long> {

}
