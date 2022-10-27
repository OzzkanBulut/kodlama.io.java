package kodlama.io.languages.webApi.controllers;

import kodlama.io.languages.business.concretes.LanguageService;
import kodlama.io.languages.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/languages")
public class LanguageController {

    LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping
    public List<Language> getAllLanguages() {
        return languageService.getAllLanguages();
    }

    @GetMapping(path = "/{languageId}")
    public Language getLanguage(@PathVariable int languageId) {
        return languageService.getLanguage(languageId);
    }

    @PostMapping
    public void addLanguage(@RequestBody Language language) throws Exception {
        languageService.addLanguage(language);
    }

    @PutMapping(path = "/{languageId}")
    public void updateLanguage(@RequestBody Language language,@PathVariable int languageId){
        languageService.updateLanguage(language);
    }

    @DeleteMapping(path = "/{languageId}")
    public void removeLanguage(@PathVariable int languageId) {
        languageService.removeLanguage(languageId);
    }

}
