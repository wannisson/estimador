package br.com.gerencial.project.tecnologia;

import br.com.gerencial.project.utils.GenericService;
import br.com.gerencial.project.utils.ResourcePaths;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = ResourcePaths.TECNOLOGIA_PATH)
public class TecnologiaResource extends GenericService<Tecnologia, Long> {

}