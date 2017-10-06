package br.com.gerencial.project.pendencia;

import br.com.gerencial.project.utils.GenericService;
import br.com.gerencial.project.utils.ResourcePaths;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = ResourcePaths.PENDENCIA_PATH)
public class PendenciaResource extends GenericService<Pendencia, Long>{

}
