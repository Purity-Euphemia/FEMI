import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomatedTellerMachineTest {
	AutomatedTellerMachine atm = new AutomatedTellerMachine(); 
	private Account[] accounts = {new Account("john", "0123456789", 50.00), new Account("james", "9876543210", 50000.00), new Account("Bolaji", "9786543210", 500.00) };


	@BeforeEach
	public void setUp() {
	atm.setAccounts(accounts);

}

	@Test
	public void testCanWithdrawFunds() {
		atm.withdraw(accounts[1].getAccountNumber(), 20000);	
		System.out.println(accounts[1]);
		assertEquals(30000, accounts[1].getBalance());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
}
	

	@Test
	public void testWithdrawNegativeAmountThrowsException(){
		atm.withdraw(account[1].getAccountNumber(), -30000);
		assertThrows();



}




}
