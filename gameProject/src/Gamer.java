public class Gamer  {
    private String firstName;

    public Gamer(String firstName, String lastName, int birthYear, long nationalIdentity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.nationalIdentity = nationalIdentity;
    }

    private String lastName;
    private int birthYear;
    private long nationalIdentity;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public long getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(long nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }



}
