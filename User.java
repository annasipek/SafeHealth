/*
 * User class defined for persons using the app, those who are not medical professionals
 * 
 */
public class User {
 private boolean guest;
 private String firstName;
 private String lastName;
 private String insuranceProvider;
 private int dob; 
 
 private User(boolean userGuest) {
	 guest = userGuest;
 }
	
 private User(boolean userGuest, String fName, String lName, String insurProv, int age ) {
	 guest = userGuest;
	 if(!guest) {
		 firstName = fName;
		 lastName = lName;
		 insuranceProvider = insurProv;
		 dob = age;
	 }
 }
 
 public void changeFName(String fName) {
	 firstName = fName;
 }
 
 public void changeLName(String lName) {
	 lastName = lName;
 }
 
 public void changeInsurProv (String insurProv) {
	 insuranceProvider = insurProv;
 }
	
}
