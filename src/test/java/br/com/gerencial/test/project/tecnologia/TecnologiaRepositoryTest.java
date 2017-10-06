package br.com.gerencial.test.project.tecnologia;

import br.com.gerencial.project.tecnologia.TecnologiaRepository;
import br.com.gerencial.project.tecnologia.Tecnologia;
import br.com.gerencial.test.project.utils.BaseEntityTest;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TecnologiaRepositoryTest extends BaseEntityTest {

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    @Autowired
    private TecnologiaRepository tecnologiaRepository;

    @Test
    public void findAll_succes() {
        List<Tecnologia> tecnologias = tecnologiaRepository.findAll();

        LOGGER.debug(tecnologias);

        assertNotNull(tecnologias);
        assertTrue(tecnologias.size() > 0);
    }
}