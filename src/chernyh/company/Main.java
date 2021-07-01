package chernyh.company;

public class Main {

    public static void main(String[] args) {

        Human client = new Client("Sergey", "Petrov", "Vtb");
        client.output();

        Human bankOfficer = new BankOfficer("Mihail", "Yakovlev", "ALFABank");
        bankOfficer.output();
    }
}
	// write your code here


