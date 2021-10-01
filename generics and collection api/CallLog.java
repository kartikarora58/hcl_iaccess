import java.util.Date;


public class CallLog {
	private String email;
	private String numberCalled;
	private Date startTime;
	private Date endTime;
	
	CallLog()
	{
		
	}
	public CallLog(String email, String numberCalled, Date startTime, Date endTime) {
		super();
		this.email = email;
		this.numberCalled = numberCalled;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumberCalled() {
		return numberCalled;
	}
	public void setNumberCalled(String numberCalled) {
		this.numberCalled = numberCalled;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	
	
}

