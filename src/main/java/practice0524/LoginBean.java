package practice0524;

public class LoginBean {
	private String id;
	private String pw;
	
	
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
	
	
	//jsp에 있는 메소드 옮겨오기
	public boolean isValidUserInfo(String userId, String userPw) {
		if(id.equals("hello") && pw.equals("111")) {
			return true;
		} else if(id.equals("hello") && (!pw.equals("111") )) {
			return false;
		}
		return false;
	}
	

}
