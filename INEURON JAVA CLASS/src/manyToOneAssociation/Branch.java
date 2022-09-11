package manyToOneAssociation;

//Dependent
public class Branch {
	private String bid;
	private String bloc;
	
	
	//Constructor injection
	public Branch(String bid, String bloc) {
		this.bid = bid;
		this.bloc = bloc;
	}

	
	//Getters to get the data
	public String getBid() {
		return bid;
	}

	public String getBloc() {
		return bloc;
	}

	
	
	
	

}
