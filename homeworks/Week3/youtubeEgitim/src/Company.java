public class Company extends  Customer{
    private String taxNumber;

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
    public Company(int id, String firstName, String lastName, String taxNumber) {
        super(id, firstName, lastName);
        this.taxNumber = taxNumber;
    }

}
