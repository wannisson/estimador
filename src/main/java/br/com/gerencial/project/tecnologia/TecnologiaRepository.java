package br.com.gerencial.project.tecnologia;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnologiaRepository extends JpaRepository<Tecnologia, Long> {

    public Tecnologia findByName(String name);

}