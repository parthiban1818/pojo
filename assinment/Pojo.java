package assinment;

public class Pojo {
	public long getReg_no() {
		return reg_no;
	}
	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	private String name="";
	private int age;
	private String mailId="";
	private String gender="";
	private long moblie;
	private long reg_no;
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	} 
	public int getAge() {
		return age;
	} 
	public void setAge(int age) {
		this.age = age;
	} 
	public String getMailId() {
		return mailId;
	} 
	public void setMailId(String mailId) {
		this.mailId = mailId;
	} 
	public String getGender() {
		return gender;
	} 
	public void setGender(String gender) {
		this.gender = gender;
	} 
	public Long getMoblie() {
		return moblie;
	} 
	public void setMoblie(Long moblie) {
		this.moblie = moblie;
	} 
	
}
