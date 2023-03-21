package Crudoperation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name = "students")
public class Createthetable {
	@Id
    int s_id;
	@Column(nullable=false)
    String s_name;
	@Column(nullable=false,unique=true)
    String s_eid;
	@Column(nullable=false)
    int s_ph;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_eid() {
		return s_eid;
	}
	public void setS_eid(String s_eid) {
		this.s_eid = s_eid;
	}
	public int getS_ph() {
		return s_ph;
	}
	public void setS_ph(int s_ph) {
		this.s_ph = s_ph;
	}
	
    

}
