import java.math.BigDecimal;

public class Bank {
    private User userMoney;
    private BigDecimal balance = new BigDecimal(1000000000);

    public Bank(BigDecimal balance) {
        this.balance = balance;
    }

    public Bank() {
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }



}
