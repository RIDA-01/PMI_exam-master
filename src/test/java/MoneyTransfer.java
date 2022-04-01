

public class MoneyTransfer extends Bank {

    public void transfer(String accountNumber1, int amount1) {
        closeAccount(accountNumber1);
        String[] sub = {accountNumber1, amount1+""};
        this.Balances.add(sub);
    }
    public String getGrades() {
        String output = "";
        if (Balances.isEmpty())
            return output;

        for (int i=0; i<Balances.size(); i++) {

            if (i+1 != Balances.size())
                output += Balances.get(i)[0] + " " +Balances.get(i)[1] + "\r\n";
            else
                output += Balances.get(i)[0] + " " +Balances.get(i)[1];

        }

        return output;
    }

    

}
