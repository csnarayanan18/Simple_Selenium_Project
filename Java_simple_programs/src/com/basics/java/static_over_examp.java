package com.basics.java;


class bankTransaction
{
    public void Transaction(int accountNumber)
    {
         System.out.println(accountNumber);
    }
    public void Transaction(int accountNumber, String ifsc)  
    {
         System.out.println(accountNumber + " "+ifsc);
    }
}
 class static_over_examp
{
   public static void main(String args[])
   {
	   bankTransaction bt = new bankTransaction();
	   bt.Transaction(12312);
	   bt.Transaction(12, "asd123");
       
   }
}