package bolum9_07;

public class TestAccount {
    public static void main(String[] args) {
        
        
        Account hesap = new Account(1122, 20000);
        
        
        hesap.setAnnualInterestRate(4.5);
        
        
        hesap.withdraw(2500);
        
       
        hesap.deposit(3000);
        
        
        System.out.println("Hesap ID: " + hesap.getId());
        System.out.println("Guncel Bakiye: $" + hesap.getBalance());
        System.out.println("Aylik Faiz Getirisi: $" + hesap.getMonthlyInterest());
        System.out.println("Hesap Acilis Tarihi: " + hesap.getDateCreated());
    }
}