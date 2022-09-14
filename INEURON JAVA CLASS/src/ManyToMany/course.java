package ManyToMany;

public class course {
	
	private Integer cid;
	private String cname;
	private Integer cost;
	
	//Constructor Injection
	public course(Integer cid, String cname, Integer cost) {

		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
	}
	
	//Getters to send the data

	public Integer getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public Integer getCost() {
		return cost;
	}
	
	
	
	

}
