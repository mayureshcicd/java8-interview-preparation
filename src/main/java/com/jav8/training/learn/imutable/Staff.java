package com.jav8.training.learn.imutable;

public final class Staff {
	private final int staffId;
	private final String staffName;
	private final Address address;
 
	class Address{
		private String city;
		private String postalCode;
		private Address(String city, String postalCode) {
			this.city = city;
			this.postalCode=postalCode;
		}
		 
		public String getPostalCode() {
			return postalCode;
		}
	 
		public String getCity() {
			return city;
		}	
	}
	
	
	public int getStaffId() {
		return staffId;
	}


	public String getStaffName() {
		return staffName;
	}


	public Address getAddress() {
		return address;
	}

	public Staff(int staffId, String staffName,  String city, String postalCode) {
		
		this.staffId = staffId;
		this.staffName = staffName;
		this.address= new Address(city,postalCode);
	}
 

}
