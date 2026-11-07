package com.joysistvi.day22;

public class UserAccount {
    // Private fields (Encapsulation)
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // Default Constructor
    public UserAccount() {
    }

    // Parameterized Constructor
    public UserAccount(String firstName, String middleName, String lastName,
                       String address, String email, String password) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;

        // Use setters so validation still works
        setEmail(email);
        setPassword(password);
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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

    public String getEmail() {
        return email;
    }

    // Email Validation
    public boolean setEmail(String email) {

        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            this.email = email;
            return true;
        }

        return false;
    }

    public String getPassword() {
        return password;
    }

    // Password Validation
    public boolean setPassword(String password) {

        if (password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*\\d.*")) {

            this.password = password;
            return true;
        }

        return false;
    }

    // Returns Full Name
    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    // Override toString()
    @Override
    public String toString() {
        return "\n===== ACCOUNT INFORMATION =====" +
                "\nFull Name : " + getFullName() +
                "\nEmail     : " + email +
                "\nAddress   : " + address;
    }
}
