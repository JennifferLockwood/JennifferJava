package classes;

public class TestClassInClassesPackage {
    // "Default" access modifier -- what will this be?
    String getHello() {
        return "Hello";
    }

    public String getSomethingPublic() {
        return "Hello to the whole world!";
    }


    public String tellMeYourSecrets() {
        return getTopSecretMessage();
    }

    private String getTopSecretMessage() {
        return "Sparky is a bird";
    }
}

