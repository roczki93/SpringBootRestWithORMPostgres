package io.javabrains.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_information")
public class UserInformation implements Serializable{

	private static final long serialVersionUID=-3009157732242241665L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name="gender")
	private String gender;
	@Column(name="city")
	private String city;
	@Column(name="street")
	private String street;
	@Column(name="latitude")
	private String latitude;
	@Column(name="longitude")
	private String longitude;
	
	public UserInformation() {	
	}
	
	public UserInformation(String firstName, String lastName, String email, String gender, String city,
			String street, String latitude, String longitude) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.city = city;
		this.street = street;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return String.format("{id=%d, firstName='%s', lastName='%s', email='%s', gender='%s', city='%s', street='%s', latitude='%s', longitude='%s'}", id, firstName, lastName, email, gender, city, street, latitude, longitude);
	}
	

}
//return UserInformation.create({
//  firstName: 'Lukasz',
//  lastName: 'Lukasimir',
//  email: 'taki@email.com',
//  gender: 'male',
//  city: 'Gliwice',
//  street: '22 Dluga',
//  latitude: '40.0000',
//  longitude: '50.9990'