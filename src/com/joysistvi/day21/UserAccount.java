package com.joysistvi.day21;

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
    public UserAccount(String firstName,
                       String middleName,
                       String lastName,
                       String address,
                       String email,
                       String password) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;

        // Call setters so validation still works
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

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException(
                    "Invalid email format.");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException(
                    "Password must contain at least 8 characters, one uppercase letter, one lowercase letter, one digit, and one special character."
            );
        }
    }

    // Validation Methods

    private boolean isValidEmail(String email) {
        String emailPattern =
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailPattern);
    }

    private boolean isValidPassword(String password) {
        return password.matches(
                "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");
    }

    // Override toString()
    @Override
    public String toString() {
        return "\n===== ACCOUNT INFORMATION =====" +
                "\nFull Name: " + firstName + " " +
                middleName + " " + lastName +
                "\nEmail: " + email +
                "\nAddress: " + address;
    }
}
