package chernyh.company;

public class BankOfficer extends Human {
    private final String bankName;

    public BankOfficer(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "BankOfficer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getBankName() {
        return bankName;
    }
}

