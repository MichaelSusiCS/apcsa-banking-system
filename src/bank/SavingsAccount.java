package bank;
public class SavingsAccount extends Account {
public SavingsAccount(String id, String owner, double bal){ super(id, owner, bal); }
@Override public void withdraw(double amt){
if(amt<=0) throw new IllegalArgumentException();
if(amt>balance) throw new IllegalStateException("Insufficient funds");
balance -= amt;
}
public void applyMonthlyInterest(double rate){ balance += balance*rate; }
}
