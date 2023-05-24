package ex10;
//샘플
public class LoginBean {
	private String id;
	private String pw;

	
	//getter & setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	//jsp에서 만들어놨던 메소드 만들어주기
	//hello와 111은 임시값.
	public boolean dbCheck() {
		if(id.equals("hello") && pw.equals("111")) {
			return true;
		}
		return false;
	}
	
}
