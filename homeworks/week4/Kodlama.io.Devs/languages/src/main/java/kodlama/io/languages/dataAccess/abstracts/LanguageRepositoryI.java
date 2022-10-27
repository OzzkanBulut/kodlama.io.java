package kodlama.io.languages.dataAccess.abstracts;

import kodlama.io.languages.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepositoryI extends JpaRepository<Language,Integer> {
}
