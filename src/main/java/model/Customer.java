package model;

public class Customer {
	
	String name;
	String nickName;
	
	
	
	public Customer(String name, String nickName) {
		super();
		this.name = name;
		this.nickName = nickName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	
}
