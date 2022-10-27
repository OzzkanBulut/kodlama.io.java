package kodlama.io.languages.configuration;

import kodlama.io.languages.dataAccess.abstracts.LanguageRepositoryI;
import kodlama.io.languages.entities.concretes.Language;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LanguageConfig {
    @Bean
    CommandLineRunner commandLineRunner(LanguageRepositoryI languageRepository){
        return args -> {
            Language java = new Language(
                "Java",
                    6
            );
            Language c = new Language(
                    "C++",
                    10

            );
            languageRepository.saveAll(List.of(java,c));
        };
    }
}
