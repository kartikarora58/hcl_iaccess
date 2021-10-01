
public class Customer implements Comparable<Customer> {

	private String name;
	private String address;
	
	
	Customer()
	{
		
	}
	
	public Customer(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		
		return this.name.equals(other.name);
	}
	
	@Override
	public int compareTo(Customer o) {
		return (this.name).compareTo(o.name);
	}
	
}
