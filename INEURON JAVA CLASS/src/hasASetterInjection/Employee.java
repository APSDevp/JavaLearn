package hasASetterInjection;


public class Employee {
	
	private int eid;
	private String ename;
	private String eaddress;
	
	//HAS-A Variable injection
	
	private account account;  //account is variable name
	
	


	
	public void setEid(int eid) {
		this.eid = eid;
	}





	public void setEname(String ename) {
		this.ename = ename;
	}





	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}





	public void setAccount(account account) {
		this.account = account;
	}





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
