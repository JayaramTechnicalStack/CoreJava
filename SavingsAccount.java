public class Account {

private String accountId;
private String accountHolderName;
private String ifscCode;
private String address;
public Account(String accountId,String accountHolderName,String ifscCode){

this.accountId= accountId;
this.accountHolderName=accountHolderName;
this.ifscode = ifscode;

}

public Account(String accountId,String accountHolderName,String ifscCode,String address){

this.accountId= accountId;
this.accountHolderName=accountHolderName;
this.ifscode = ifscode;
this.address = address;

}

}

public class SavingsAccount extends Account{

public static void main(String [] args){
}
}