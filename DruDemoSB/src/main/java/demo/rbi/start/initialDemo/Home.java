package demo.rbi.start.initialDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Scope(value = "prototype")
@Component
public class Home {
	
	private String owner;
	private int doorNo;
	@Autowired
	InternetConnection ic;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	Home(){
		System.out.println("hello , I'm the constructor");
	}
	
	public void connect() {
//		InternetConnection ic = new InternetConnection();
		ic.switchOn();
		System.out.println("connecting to the internet");
	}
	
}
