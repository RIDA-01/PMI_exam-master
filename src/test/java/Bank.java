import java.util.ArrayList;

public class Bank {
    ArrayList<String[]> Balances = new ArrayList<>();
    public String getBalances() {
        String s = "";
        if (Balances.isEmpty())
            return s;

        for (int i=0; i<Balances.size(); i++) {
            if (i+1 != Balances.size())
                s += Balances.get(i)[0] + " 0\r\n";
            else
                s += Balances.get(i)[0] + " 0";
        }

        return s;
    }
    public void openNewAccount(String accountNumber1) {
        String[] sub = {accountNumber1, ""};
        this.Balances.add(sub);
    }
    public int getIndex(String subject) {
        for (int i=0; i<Balances.size(); i++) {
            if (Balances.get(i)[0] == subject)
                return i;
        }
        return -1;
    }

    public void closeAccount(String accountNumber1) {
        int index = getIndex(accountNumber1);
        if(index != -1)
            Balances.remove(index);
    }



}
