package bank;
import java.util.*;
public class Bank {
private final Map<String,Account> accounts = new HashMap<>();
public Account open(String type, String id, String owner, double bal){
Account a = type.equalsIgnoreCase("s") ? new SavingsAccount(id,owner,bal)
: new CheckingAccount(id,owner,bal);
accounts.put(id,a); return a;
}
public Account get(String id){ return accounts.get(id); }
public Collection<Account> list(){ return accounts.values(); }
public void transfer(String fromId, String toId, double amt){
Account f=get(fromId), t=get(toId);
if(f==null||t==null) throw new IllegalArgumentException("Bad account id");
f.withdraw(amt); t.deposit(amt);
}
}
