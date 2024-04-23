package basic.ch19;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank("그린은행");
		Customer customer = new Customer("홍길동");
		
		customer.useBankService(bank);
		
		bank.provideService(ServiceType.ACCOUNT_INFO, customer);
	}
}
