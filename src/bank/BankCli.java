package bank;
import java.util.*;
public class BankCli {
public static void main(String[] args){
Bank bank = new Bank();
Scanner sc = new Scanner(System.in);
System.out.println("Bank CLI: o(open) d(eposit) w(withdraw) t(transfer) l(list) q(quit)");
while(true){
System.out.print("> ");
String cmd = sc.next();
try{
switch(cmd){
case "o" -> {
System.out.print("Type (c=checking/s=savings) id owner startBalance: ");
String type=sc.next(); String id=sc.next(); String owner=sc.next(); double bal=sc.nextDouble();
System.out.println("Opened: "+bank.open(type,id,owner,bal));
}
case "d" -> { System.out.print("id amount: "); var id=sc.next(); var amt=sc.nextDouble();
bank.get(id).deposit(amt); System.out.println(bank.get(id)); }
case "w" -> { System.out.print("id amount: "); var id=sc.next(); var amt=sc.nextDouble();
bank.get(id).withdraw(amt); System.out.println(bank.get(id)); }
case "t" -> { System.out.print("fromId toId amount: "); var f=sc.next(); var t=sc.next(); var amt=sc.nextDouble();
bank.transfer(f,t,amt); System.out.println("OK"); }
case "l" -> bank.list().forEach(System.out::println);
case "q" -> { System.out.println("Bye"); return; }
default -> System.out.println("Unknown");
}
}catch(Exception e){ System.out.println("Error: "+e.getMessage()); sc.nextLine(); }
}
}
}
