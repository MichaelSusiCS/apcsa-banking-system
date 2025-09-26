package bank;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankTest {
  @Test void openDepositWithdrawTransfer() {
    Bank b = new Bank();
    Account a = b.open("c","A","Alice",100);
    Account c = b.open("s","C","Cara",200);
    a.deposit(50);
    b.transfer("A","C",30);
    assertTrue(b.get("C").getBalance() >= 230);
    assertNotNull(b.get("A"));
  }
}
