package validation;

public class Validator {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 60) {
            throw new InvalidAgeException("Age must be 18 to 60");
        }
    }

    public static void checkDept(String dept) throws InvalidDeptException {
        if (!(dept.equals("CSE") || dept.equals("ME") || dept.equals("ICT"))) {
            throw new InvalidDeptException("Invalid Department");
        }
    }
}
