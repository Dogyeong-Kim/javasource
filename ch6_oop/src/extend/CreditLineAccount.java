package extend;

public class CreditLineAccount extends Account {
    private int creditLine; // 마이너스 한도

    // CreditLineAccount() {
    // super();
    // }

    public CreditLineAccount(String ano, String owner, long balance, int creditLine) {
        super(ano, owner, balance);
        this.creditLine = creditLine;
    }

    // 오버라이딩
    // 잔액 + 마이너스한도 < 사용액

    @Override
    void withdraw(long amount) throws Exception {
        if (super.getBalance() + this.creditLine < amount) {
            throw new Exception("한도 범위를 초과합니다.");
        }
        // 잔액 = 잔엑 - 사용액
        super.setBalance(super.getBalance() - amount);
    }

}
