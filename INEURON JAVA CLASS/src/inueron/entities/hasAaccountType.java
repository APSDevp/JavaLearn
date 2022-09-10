package inueron.entities;

//Dependent Object
public class hasAaccountType {

		//instance-variables
		
		private String accNo;
		private String accType;
		private String accHolderName;
		
		//Performing Constructor Injection
		
		public hasAaccountType(String accNo, String accType, String accHolderName) {
			this.accNo = accNo;
			this.accType = accType;
			this.accHolderName = accHolderName;
		}
		
		//setter for sending the data

		public String getAccNo() {
			return accNo;
		}

		public String getAccType() {
			return accType;
		}

		public String getAccHolderName() {
			return accHolderName;
		}
		

	

}
