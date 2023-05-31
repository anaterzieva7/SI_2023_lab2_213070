package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SILab2Test {

    User user1 = new User("anaterzieva02@gmail.com", "TerzievaAna789", "anaterzieva02@gmail.com");
    User user2 = new User("Martina", "Martina123", "martinat12302@gmail.com");
    User user3 = new User("Teodor", "TeodorT", "sergioramos2@gmail.com");
    User user4 = new User("Marko", "MarkoM", "markomarkovski@yahoo.com");

    private List<User> usersList(User... users) {
        return new ArrayList<User>(Arrays.asList(users));
    }

    @Test
    void EveryBranchFirst() {
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, ()-> SILab2.function(new User(null,null,null), usersList(user1,user2,user3,user4)));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    }

    @Test
    void EveryBranchSecond() {
        User user = new User(null, "anche","anaterzieva02@gmail.com");
        List<User> userList = usersList(user1,user2,user3,user4);

        boolean result = SILab2.function(user, userList);

        assertFalse(result);
    }

    @Test
    void EveryBranchThird() {
        User user = new User(null, "blablabla123*", "anaterzieva02@gmail.com");
        List<User> usersList = usersList(user1, user2, user3, user4);

        boolean resault = SILab2.function(user,usersList);

        assertFalse(resault);
    }

    @Test
    void EveryBranchFourth() {
        User user = new User("AncheBananche", "bla bla bla !@#", "anaterzieva02@gmail.com");
        List<User> usersList = usersList(user1, user2, user3, user4);

        boolean resault = SILab2.function(user,usersList);

        assertFalse(resault);
    }


    @Test
    void MultipleConditionFirst() {
        User user = new User(null, "password", "john@example.com");
        List<User> userList = usersList(user1, user2, user3, user4);

        boolean result = SILab2.function(user, userList);

        assertFalse(result);
    }

    @Test
    void MultipleConditionTestSecond() {
        User user = new User("John", "Johnpassword", "john@example.com");
        List<User> User = usersList(user1, user2, user3, user4);

        boolean result = SILab2.function(user, User);

        assertFalse(result);
    }

    @Test
    void MultipleConditionThird() {
        User user = new User(null, "statements!", "anaterzieva02@gmail.com");
        List<User> User = usersList(user1, user2, user3, user4);

        boolean result = SILab2.function(user, User);

        assertFalse(result);
    }
}