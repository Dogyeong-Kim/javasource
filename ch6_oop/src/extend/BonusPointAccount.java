package extend;

public class BonusPointAccount extends Account {

    private int bonusPoint;

    public BonusPointAccount(String ano, String owner, long balance, int bonusPoint) {
        super(ano, owner, balance);
        this.bonusPoint = bonusPoint;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    // 보너스포인트 = 보너스포인트 + (예금액 * 1%)
    // 예금하다 메소드 수정
    @Override
    void deposit(long amount) {
        // 예금하다
        super.deposit(amount);
        // 보너스포인트 추가
        bonusPoint += amount * 0.01;
    }
}
