package tests;

public class TestClassInTestPackage {
    // "Default" access modifier -- what will this be?
    String getHello() {
        return "Hello";
    }


    public String tellMeYourSecrets() {
        return getTopSecretMessage();
    }

    private String getTopSecretMessage() {
        return "Sparky is a bird";
    }
}

