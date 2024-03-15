package com.learning.core.day10;

import org.junit.Test;
import static org.junit.Assert.assertThrows;

public class TestUserProfile {
    
    @Test(timeout = 2000)
    public void testName() {
        UserProfile userProfile = new UserProfile();
        userProfile.validateUsername("JohnDoe"); 
        
        assertThrows(IllegalArgumentException.class, () -> {
            userProfile.validateUsername("John123");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            userProfile.validateUsername("John@Doe");
        });
    }
    
    @Test(timeout = 2000)
    public void testPassword() {
        UserProfile userProfile = new UserProfile();
        userProfile.validatePassword("Abcd1234"); 
        
        assertThrows(IllegalArgumentException.class, () -> {
            userProfile.validatePassword("Password"); 
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            userProfile.validatePassword("12345678");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            userProfile.validatePassword("abcdefgh");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            userProfile.validatePassword("Abcdefghijklmnopqrstuvwxyz123"); 
        });
    }
}

