package kodlama.io.languages.business.abstracts;

import kodlama.io.languages.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LanguageServiceI {

    List<Language> getAllLanguages();

    Language getLanguage(int languageId);

    void addLanguage(Language language) throws Exception;

    void removeLanguage(int languageId);

    void updateLanguage(Language language);

}
