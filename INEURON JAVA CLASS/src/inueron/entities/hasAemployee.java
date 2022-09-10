package inueron.entities;

//Target class
public class hasAemployee {
	
	private int eid;
	private String ename;
	private String eaddress;
	
	//HAS-A Variable injection
	
	private hasAaccountType account;  //account is variable name
	
	
    //performing constructor injection
	public hasAemployee(int eid, String ename, String eaddress, hasAaccountType account) {
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.account = account;
	}
	
	//void
	public void display() {
		System.out.println("********************Employee Details are **************");
		System.out.println("EID is :: " +eid);
		System.out.println("Ename is ::"+ename);
		System.out.println("Eaddr is ::"+eaddress);
		System.out.println("**************Account Details are *********************");
		System.out.println("Accno is ::"+account.getAccNo());
		System.out.println("Account type is ::"+account.getAccType());
		System.out.println("Account name is  ::"+account.getAccNo());
	}
	
	
	
	
	

}
