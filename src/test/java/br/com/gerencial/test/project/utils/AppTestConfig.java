package br.com.gerencial.test.project.utils;

import br.com.gerencial.project.utils.AppConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppConfig.class)
public class AppTestConfig {
}
