package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("01012345678"));
        System.out.println(isPhoneNumberValid("0112345678"));
        System.out.println(isPhoneNumberValid("01123456789"));

        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("01012345678"));
        System.out.println(isPhoneNumberValidPredicate.test("0112345678"));
        System.out.println(isPhoneNumberValidPredicate.test("01123456789"));

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("01012345678")
        );

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("01000000000")
        );
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("010") && phoneNumber.length() == 11;
    }

    /**
     * javadoc : Represents a predicate (boolean-valued function) of one argument.
     */
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("010") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
