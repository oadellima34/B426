package com.joysistvi.day20;

public class UserAccount {
    // Private fields (Encapsulation)
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // Default constructor
    public UserAccount() {
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

    // Email validation
    public boolean setEmail(String email) {
        String emailPattern =
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        if (email.matches(emailPattern)) {
            this.email = email;
            return true;
        }
        return false;
    }

    public String getPassword() {
        return password;
    }

    // Password validation
    public boolean setPassword(String password) {

        if (password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }

            if (Character.isLowerCase(ch)) {
                hasLower = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        if (hasUpper && hasLower && hasDigit) {
            this.password = password;
            return true;
        }

        return false;
    }

    // Method to display account information
    public void displayInfo() {
        System.out.println("\n===== USER ACCOUNT INFORMATION =====");
        System.out.println("Full Name: " + firstName + " "
                + middleName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }
}
