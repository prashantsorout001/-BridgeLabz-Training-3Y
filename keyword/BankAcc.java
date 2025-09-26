public class BankAcc {

    private String bank;
    private String accHolder;
    static int totalBankAccounts = 0;

    private final int accNumber;

    public BankAcc(String bank, String accHolder, final int accNumber){
        this.bank = bank;
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        totalBankAccounts++;
    }

    public static void getTotalAccounts(){
        System.out.println("Total Bank Acoounts are: "+ totalBankAccounts);
    }

    public void displayDetails(){
        System.out.println("Bank Name: "+ bank);
        System.out.println("Account Holder Name: "+accHolder);
        System.out.println("Account Number: "+accNumber);
    }



    public static void main(String[] args){
        BankAcc b1 = new BankAcc("BOB", "Aditya", 23158);
        BankAcc b2 = new BankAcc("SBI", "Himanshu", 2315);
        BankAcc b3 = new BankAcc("PNB", "Keshav", 23);

        b1.displayDetails();
        BankAcc.getTotalAccounts();

    }


    
}
