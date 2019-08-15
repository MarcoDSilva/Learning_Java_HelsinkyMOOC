
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private final double economical = 2.5;
    private final double gourmet = 4.0;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {

        if (cashGiven >= this.economical) {
            this.cashInRegister += this.economical;
            this.economicalSold++;
            return cashGiven - this.economical;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {

        if (cashGiven >= this.gourmet) {
            this.cashInRegister += this.gourmet;
            this.gourmetSold++;
            return cashGiven - this.gourmet;
        }

        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {

        if (card.balance() >= this.economical) {
            card.pay(this.economical);
            this.economicalSold++;
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= this.gourmet) {
            card.pay(this.gourmet);
            this.gourmetSold++;
            return true;
        }
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum > 0)
        {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    @Override
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
