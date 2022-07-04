class Transaction
{
int withdrawAmt = 2000;
int currentAmt  = 5000;
int depositeAmt = 1000;

public void withdraw()
{
 currentAmt  = currentAmt -  withdrawAmt ;
System.out.println("After Withdraw =" + currentAmt);
}

public void deposite()
{
  currentAmt =  currentAmt +   depositeAmt ;
System.out.println("After Deposite =" + currentAmt);
}
}