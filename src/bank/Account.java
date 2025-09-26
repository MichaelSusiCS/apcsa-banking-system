package bank;
public abstract class Account {
protected final String id, owner;
protected double balance;
public Account(String id, String owner, double balance){
this.id=id; this.owner=owner; this.balance=balance;
}
public void deposit(double amt){ if(amt<=0) throw new IllegalArgumentException(); balance+=amt; }
public abstract void withdraw(double amt);
public String getId(){ return id; }
public String getOwner(){ return owner; }
public double getBalance(){ return balance; }
@Override public String toString(){ return getClass().getSimpleName()+"["+id+"] "+owner+" $"+String.format("%.2f",balance); }
}
