package extend;

public class Account {
    // 속성 : 계좌번호(ano), 이름(owner), 잔액(balance)
    private String ano;
    private String owner;
    private long balance;

    // public Account() {
    // }

    public Account(String ano, String owner, long balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    // 기능 : 예금하다(잔액 = 잔액 + 예금액), 출금하다(잔액 = 잔액 - 출금액)
    // deposit withdraw
    void deposit(long amount) {
        balance += amount;
    }

    void withdraw(long amount) throws Exception {
        if (amount > balance)
            throw new Exception("잔액확인");
        // 인출액이 잔액보다 작으면 출금
        balance -= amount;
    }

    // toString
    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }
}
