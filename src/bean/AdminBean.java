package bean;

public class AdminBean implements java.io.Serializable {
	private int adminCode;
	private String adminId;
	private String adminPass;
	private String adminName;
	private int adminDelete;
	private String adminDate;

	public int getadminCode() {
		return adminCode;
	}

	public String getadminId() {
		return adminId;
	}
	public String getadminPass() {
		return adminPass;
	}
	public String getadminName() {
		return adminName;
	}
	public int getadminDelete() {
		return adminDelete;
	}

	public String getadminDate() {
		return adminDate;
	}

	public void setadminCode(int adminCode) {
		this.adminCode = adminCode;
	}

	public void setadminId(String adminId) {
		this.adminId = adminId;
	}
	public void setadminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	public void setadminName(String adminName) {
		this.adminName = adminName;
	}
	public void setadminDelete(int adminDelete) {
		this.adminDelete = adminDelete;
	}
	public void setadminDate(String adminDate) {
		this.adminDate = adminDate;
	}

}
