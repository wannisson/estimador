package br.com.gerencial.project.risco;

import br.com.gerencial.project.utils.GenericService;
import br.com.gerencial.project.utils.ResourcePaths;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = ResourcePaths.RISCO_PATH)
public class RiscoResource extends GenericService<Risco, Long> {
}
