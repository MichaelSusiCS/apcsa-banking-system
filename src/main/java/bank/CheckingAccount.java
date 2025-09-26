package bank;
public class CheckingAccount extends Account {
private final double overdraftFee = 35.0;
public CheckingAccount(String id, String owner, double bal){ super(id, owner, bal); }
@Override public void withdraw(double amt){
if(amt<=0) throw new IllegalArgumentException();
balance -= amt;
if(balance < 0) balance -= overdraftFee;
}
}
