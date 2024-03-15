package com.learning.core.day10;

public class D10P10 {
	public static void main(String[] args) {
		
	}
}

class UserProfile {
    
    public void validateUsername(String name) {
        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Username should contain only characters");
        }
    }
    
    public void validatePassword(String password) {
        if (!password.matches("^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]{8}$")) {
            throw new IllegalArgumentException("Password should be 8 characters long with a combination of alphabets and digits");
        }
    }
}
