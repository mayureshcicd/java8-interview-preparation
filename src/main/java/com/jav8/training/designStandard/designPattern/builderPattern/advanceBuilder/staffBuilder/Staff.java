package com.jav8.training.designStandard.designPattern.builderPattern.advanceBuilder.staffBuilder;

public class Staff {
	//All final attributes
		private final String firstName; // required
		private final String lastName; // required
		private final int age; // optional
		private final String phone; // optional
		private final String address; // optional

		private Staff(Builder builder) {
			this.firstName = builder.firstName;
			this.lastName = builder.lastName;
			this.age = builder.age;
			this.phone = builder.phone;
			this.address = builder.address;
		}

		//All getter, and NO setter to provde immutability
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public int getAge() {
			return age;
		}
		public String getPhone() {
			return phone;
		}
		public String getAddress() {
			return address;
		}

		@Override
		public String toString() {
			return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
		}

		public static class Builder
		{
			private  String firstName;
			private String lastName;
			private int age;
			private String phone;
			private String address;

 
			public Builder() {
	 
			}
			public Builder(String firstName, String lastName, int age, String phone, String address) {
				this.firstName = firstName;
				this.lastName = lastName;
				this.age = age;
				this.phone = phone;
				this.address = address;
			}
			public Builder firstName(String firstName) {
				this.firstName = firstName;
				return this;
			}
			public Builder lastName(String lastName) {
				this.lastName = lastName;
				return this;
			}
			public Builder age(int age) {
				this.age = age;
				return this;
			}
			public Builder phone(String phone) {
				this.phone = phone;
				return this;
			}
			public Builder address(String address) {
				this.address = address;
				return this;
			}
			public Staff build() {
				Staff user =  new Staff(this);
				return user;
			}
		 
		}
	
	
 
}
