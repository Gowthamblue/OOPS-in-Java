public class Main {
    public static void main(String args[])
    {
        account ac =new account("Gowtham",150);
        account ac1 = new account();
        ac.display();
        ac.deposit(5000);
        ac.display();
        ac.withdraw(500);
        ac.display();
        ac1.setname("Varun");
        ac1.getname();
        ac1.setdeposit(10000);
        ac1.getbalance();
        ac1.setwithdraw(5000);
        ac1.getbalance();
        
        
        
    }
    
}
class account{
    private String name;
    private double balance;
    public account(String name,double balance)
    {
        this.name=name;
        this.balance=balance;
    }
    public account()
    {
        this.name=name;
        this.balance=balance;
    }
    public void display()
    {
        System.out.println("The Account Name is: "+this.name);
        System.out.println("The Account Balance is: "+this.balance);
    }
    protected void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("The amount "+amount+" Deposited Succesfully");
        }
        else
        {
            System.out.println("Enter a Vaild Amount");
        }
    }
    protected void withdraw(double amount)
    {
        if(balance>amount && amount>0)
        {
            balance-=amount;
            System.out.println("Your amount Rs."+amount+" Withdrawn successfully");
        }
        else
        {
            if(balance<amount)
            {
                System.out.println("Your balance is low: "+balance);
            }
            else if(amount<0)
            {
                System.out.println("Enter a valid amount.");
            }
        }
    }
    public void getname()
    {
        System.out.println("Account Name: "+this.name);
    }
    public void setname(String name)
    {
        if(name!=null)
        {
            this.name=name;
        }
        else
        {
            System.out.println("Enter a valid name");
        }
    }
   public void setbalance(double bal)
   {
        if(bal>=0)
        {
            this.balance=bal;
            
        }
        else
        {
            System.out.println("Enter the valid balance");
        }
   }
   public void getbalance()
   {
        System.out.println("Balance: "+this.balance);
   }
   public void setdeposit(double amount)
   {
    if(amount>0)
    {
        balance+=amount;
        System.out.println("The amount "+amount+" Deposited Succesfully");
    }
    else
    {
        System.out.println("Enter the valid amount");
    }
   }
   public void setwithdraw(double amount)
   {
        if(balance>amount && amount>0)
        {
            balance-=amount;
            System.out.println("Your amount Rs."+amount+" Withdrawn successfully");
        }
        else
        {
            if(balance<amount)
            {
                System.out.println("Your balance is low: "+balance);
            }
            else if(amount<0)
            {
                System.out.println("Enter a valid amount.");
            }
        }

   }

}
