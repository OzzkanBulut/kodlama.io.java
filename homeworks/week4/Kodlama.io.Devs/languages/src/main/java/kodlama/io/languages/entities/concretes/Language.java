package kodlama.io.languages.entities.concretes;

import javax.persistence.*;

@Entity
@Table
public class Language {
    @Id
    @SequenceGenerator(
            name="language_sequence",
            sequenceName = "language_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "language_sequence"
    )
    private int id;
    private String name;
    private int difficultyRate;

    public Language() {
    }

    public Language(String name, int difficultyRate) {
        this.name = name;
        this.difficultyRate = difficultyRate;
    }

    public Language(int id, String name, int difficultyRate) {
        this.id = id;
        this.name = name;
        this.difficultyRate = difficultyRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficultyRate() {
        return difficultyRate;
    }

    public void setDifficultyRate(int difficultyRate) {
        this.difficultyRate = difficultyRate;
    }
}
