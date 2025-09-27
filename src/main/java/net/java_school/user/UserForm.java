package net.java_school.user;

import java.util.List;
import java.util.ArrayList;

public class UserForm {
        private String firstName;
        private String lastName;
        
	private List<String> skills;

	private Preferences preferences;

	private String country;

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
	public Preferences getPreferences() {
		return preferences;
	}
	public void setPreferences(Preferences preferences) {
		this.preferences = preferences;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
	       this.country = country;
	}	       
}       

