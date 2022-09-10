package hasASetterInjection;

public class account {
	
	//instance-variables
	
	private String accNo;
	private String accType;
	private String accHolderName;
	
	//Performing Constructor Injection

	
	//setter for sending the data

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getAccType() {
		return accType;
	}

	public String getAccHolderName() {
		return accHolderName;
	}
	


}
