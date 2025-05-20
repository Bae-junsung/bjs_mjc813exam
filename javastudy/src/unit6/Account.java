package unit6;

public class Account {
    private String accoutNumber;
    private String accountName;
    private int balance;

    //비기본 생성자(계좌번호, 계좌주)
    public Account(String accoutNumber, String accountName){
        this(accoutNumber, accountName, 0); //초기 금액은 0
    }
    //비기본 생성자(계좌번호, 계좌주, 초기금액)
    public Account(String accoutNumber, String accountName, int balance) {
        this.accoutNumber = accoutNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    void addMoney(int m){
        this.balance += m; //m을 금액에 더한다.
    }
    void subMoney(int m){
        if(this.balance >= m){
            this.balance -= m;
        } else{
            System.out.println("잔액 부족");
        }
    }
    public String getAccountNumber() {
        return this.accoutNumber; //계좌번호 가져온다.
    }
    public void setAccoutNumber(String accoutNumber) {
        this.accoutNumber = accoutNumber; //계좌번호 정보 저장한다.
    }
    public String getAccountName() {
        return this.accountName; //계좌주 정보 가져온다.
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName; //계좌주 정보 저장한다.
    }
    public int getBalance() {
        return this.balance;  //금액 정보를 가져온다.
    }
    public void setBalance(int balance) {
        this.balance = balance; //금액 정보를 저장한다.
    }

    public static void main(String[] args){
        Account account = new Account("111-111", "홍길동");
        System.out.println("계좌번호: " + account.getAccountNumber() + " 계좌주: " +account.getAccountName());

        account.addMoney(10000);
        System.out.println("현재 잔액: " + account.getBalance()); // 잔액 출력(get?)
        account.subMoney(5000);
        System.out.println("현재 잔액: " + account.getBalance());

        account.setAccoutNumber("123-456");
        System.out.println("계좌번호: " + account.getAccountNumber());

        account.setAccountName("배준성");
        System.out.println("계좌주: " + account.getAccountName());

        account.setBalance(3000);
        System.out.println("수정 잔액: " + account.getBalance());
    }
}
