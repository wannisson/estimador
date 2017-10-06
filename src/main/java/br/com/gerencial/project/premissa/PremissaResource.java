package br.com.gerencial.project.premissa;

import br.com.gerencial.project.utils.GenericService;
import br.com.gerencial.project.utils.ResourcePaths;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = ResourcePaths.PREMISSA_PATH)
public class PremissaResource extends GenericService<Premissa, Long> {
}
