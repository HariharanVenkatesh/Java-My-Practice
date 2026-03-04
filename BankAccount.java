class BankAccount{
    private String AccountHolderName;
    private int AccountNo;

    public BankAccount(String AccountHolderName,int AccountNo){
        this.AccountHolderName = AccountHolderName;
        this.AccountNo = AccountNo;
    }
    public String getAccountHolderName(){
        return AccountHolderName;
    }
    public int getAccountNo(){
        return AccountNo;
    }
    public void setAccountHolderName(String AccountHolderName){
        this.AccountHolderName = AccountHolderName;
    }
    public void setAccountNo(int AccountNo){
        this.AccountNo = AccountNo;
    }

    public static void main(String [] args){
        BankAccount b = new BankAccount("Ashwin",604498489);
        b.setAccountHolderName("Ashwin");
        b.setAccountNo(604496489);
        System.out.println(b.getAccountHolderName());
        System.out.println(b.getAccountNo());
    }
}