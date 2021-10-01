import java.text.DecimalFormat;

public class ItemType {
	private
	String name;
	Double costPerDay;
	Double deposit;
	
	
	public ItemType(String name, Double costPerDay, Double deposit) {
		super();
		this.name = name;
		this.costPerDay = costPerDay;
		this.deposit = deposit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public Double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.0");
		return "Name:"+name+"\n"+
			   "Deposit:"+df.format(deposit)+"\n"+
			   "Cost Per Day:"+df.format(costPerDay);
	}
	
}
