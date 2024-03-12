package com.learning.core.day04;
import java.util.Scanner;

public class D04P03 {

	static class CatheyBankException extends Exception {
        public CatheyBankException(String message) {
            super(message);
        }
    }

    static class InvalidNameException extends CatheyBankException {
        public InvalidNameException(String message) {
            super(message);
        }
    }

    static class InvalidPostException extends CatheyBankException {
        public InvalidPostException(String message) {
            super(message);
        }
    }

    static class InvalidAgeException extends CatheyBankException {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    static class Validator {
        public static void validate(Applicant applicant) throws CatheyBankException {
            if (!isValidApplicantName(applicant.applicantName)) {
                throw new InvalidNameException("Invalid applicant name");
            }
            if (!isValidPost(applicant.postApplied)) {
                throw new InvalidPostException("Invalid post");
            }
            if (!isValidAge(applicant.applicantAge)) {
                throw new InvalidAgeException("Invalid age");
            }
            System.out.println("All details are valid");
        }

        public static boolean isValidApplicantName(String name) {
            return name != null && !name.isEmpty();
        }

        public static boolean isValidPost(String post) {
            return post != null && (post.equals("Probationary Officer") || post.equals("Assistant") || post.equals("Special Cadre Officer"));
        }

        public static boolean isValidAge(int age) {
            return age > 18 && age < 30;
        }
    }

    static class Applicant {
        String applicantName;
        String postApplied;
        int applicantAge;

        public Applicant(String applicantName, String postApplied, int applicantAge) {
            this.applicantName = applicantName;
            this.postApplied = postApplied;
            this.applicantAge = applicantAge;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter applicant name:");
        String applicantName = scanner.nextLine();

        System.out.println("Enter post applied:");
        String postApplied = scanner.nextLine();

        System.out.println("Enter applicant age:");
        int applicantAge = scanner.nextInt();

        Applicant applicant = new Applicant(applicantName, postApplied, applicantAge);
        try {
            Validator.validate(applicant);
        } catch (CatheyBankException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}