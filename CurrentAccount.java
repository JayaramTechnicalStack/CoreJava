public class CurrentAccount{

private String accountId;
private String accountHolderName;
private String ifscCode;
private String address;
private double balance;


public CurrentAccount(String accountId,String accountHolderName,String ifscCode){

this.accountId= accountId;
this.accountHolderName=accountHolderName;
this.ifscode = ifscode;

}

public CurrentAccount(String accountId,String accountHolderName,String ifscCode,String address, double balance){

this.accountId= accountId;
this.accountHolderName=accountHolderName;
this.ifscode = ifscode;
this.address = address;
this.balance = balance;
}


}
