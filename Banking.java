package Day2;

class Accounts{
    int acct_no;
    String name;
    double amount;
    void insert(int a,String n, double amt)
    {
        acct_no=a;
        name=n;
        amount=amt;

    }
    void deposit(double amt)
    {
        amount+=amt;
        System.out.println(amt+" deposited");
    }
    void withdraw(double amt)
    {
        if(amt>amount)
        System.out.println("Insufficient balance");
        else
        {
            amount-=amt;
            System.out.println(amt+ " withdrawn");
        }
    }
    void checkbalance()
    {
        System.out.println("The balance is "+amount);
    }
    void display()
    {
        System.out.println("Account no. "+acct_no+" name "+name + " amount "+amount);
    }
}

public class Banking {
    public static void main(String[] args) {
        Accounts b1=new Accounts();
        b1.insert(1,"abc",12112.9);
        b1.deposit(5000.0);
        b1.withdraw(2000.0);
        b1.withdraw(1212.111);
        b1.checkbalance();
        b1.display();
    }
}
