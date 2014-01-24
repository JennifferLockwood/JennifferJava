package tests;

import classes.TestClassInClassesPackage;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * See also http://staff.science.uva.nl/~heck/JAVAcourse/ch4/ss2_2.html for an explanation.
 */
public class TestAccessModifiers {
    @Test
    public void testCanAccessDefaultAccessIfInSamePackage() {
        TestClassInTestPackage obj = new TestClassInTestPackage();
        assertEquals(obj.getHello(), "Hello");
    }

    @Test
    public void testCannotGetToPrivateMethod() {

        TestClassInTestPackage obj = new TestClassInTestPackage();
        // We can't write this test because it won't compile...
        // assertEquals(obj.getTopSecretMessage(), "Sparky is a bird");

        // However another function makes the secret public:
        assertTrue(obj.tellMeYourSecrets().contains("Sparky"));
    }

    @Test
    public void testCanUseClassInAnotherPackage() {
        TestClassInClassesPackage obj = new TestClassInClassesPackage();
        assertNotNull(obj);
    }

    @Test
    public void testCannotUseMethodWithDefaultFromOutsidePackage() {
        // TestClassInClassesPackage obj = new TestClassInClassesPackage();
        // This line won't compile!
        // assertEquals(obj.getHello(), "Hello");

    }

    @Test
    public void testCanUsePublicMethodsFromOutsidePackage() {
        TestClassInClassesPackage obj = new TestClassInClassesPackage();
        assertEquals(obj.getSomethingPublic(), "Hello to the whole world!");

    }


}
