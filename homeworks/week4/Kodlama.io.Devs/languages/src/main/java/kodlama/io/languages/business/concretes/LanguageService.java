package kodlama.io.languages.business.concretes;

import kodlama.io.languages.business.abstracts.LanguageServiceI;
import kodlama.io.languages.dataAccess.abstracts.LanguageRepositoryI;
import kodlama.io.languages.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService implements LanguageServiceI {

    private final LanguageRepositoryI languageRepository;

    @Autowired
    public LanguageService(LanguageRepositoryI languageRepository) {
        this.languageRepository = languageRepository;
    }
    public List<Language> getAllLanguages() {
        return languageRepository.findAll();
    }

    public Language getLanguage(int languageId) {

        return languageRepository.findById(languageId).get();
    }


    public void addLanguage(Language language) throws Exception {
        List<Language> languages = languageRepository.findAll();
        for (Language lg : languages) {
            if (lg.getName().equals(language.getName())) {
                throw new Exception(language.getName() + " is already registered!");
            }
        }
        if (language.getName() == null)
            throw new Exception("Language name can not be empty!");
        languageRepository.save(language);
    }


    public void removeLanguage(int languageId) {
        languageRepository.deleteById(languageId);
    }


    public void updateLanguage(Language language) {
        languageRepository.save(language);
    }
}
