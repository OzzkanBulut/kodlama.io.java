public class Person extends Customer{

    public String getNationalIdentity() {
        return nationalIdentity;
    }


    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    private String nationalIdentity;
    public Person(int id, String firstName, String lastName, String nationalIdentity) {
        super(id, firstName, lastName);
        this.nationalIdentity = nationalIdentity;

    }


}
