package com.elsospring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "person")
@Component
public class Person {
	
	@Value("${spring.profiles.active}")
	private String selectedProfile;
	
	//private String name;
        private String firstName;
        private String lastName;
	private int age;
        private String address;
        private String phoneNumber;

  public Person(String firstName, String lastName, int age, String address, String phoneNumber) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }
	
	@Value("${msg}")
	private String message;
        
	public Person() {

	}

  @Override
  public String toString() {
    return "Person{" + "selectedProfile=" + selectedProfile + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address + ", phoneNumber=" + phoneNumber + ", message=" + message + '}';
  }

/*
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "Person [selectedProfile=" + selectedProfile + ", message=" + message + "]";
	}

	@Override
	public String toString() {
		return "Person [message=" + message + "]";
	}
*/
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

        public String getSelectedProfile() {
        return selectedProfile;
        }

        public void setSelectedProfile(String selectedProfile) {
        this.selectedProfile = selectedProfile;
        }

	public String getFirstName() {
		return firstName;
	}

        public void setFirstName(String firstName) {
          this.firstName = firstName;
        }

        public String getLastName() {
          return lastName;
        }

        public void setLastName(String lastName) {
          this.lastName = lastName;
        }

        public String getAddress() {
          return address;
        }

        public void setAddress(String address) {
          this.address = address;
        }

        public String getPhoneNumber() {
          return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
          this.phoneNumber = phoneNumber;
        }

        public int getAge() {
          return age;
        }
        
	public void setAge(int age) {
		this.age = age;
	}
/*        
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
*/

}
