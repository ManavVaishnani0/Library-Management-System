public class Main {

    // Test Functions
    static void test_isBookAvailable() {
        Book b = new Book(1, "Java", 5);
        System.out.println("isBookAvailable PASS: " + (b.isAvailable() == true));

        Book b2 = new Book(2, "C++", 0);
        System.out.println("isBookAvailable FAIL: " + (b2.isAvailable() == true));
    }

    static void test_issueBook() {
        Book b = new Book(1, "Java", 2);
        boolean result = b.issueBook();
        System.out.println("issueBook PASS: " + (result == true && b.copies == 1));

        Book b2 = new Book(2, "C++", 0);
        boolean result2 = b2.issueBook();
        System.out.println("issueBook FAIL: " + (result2 == true));
    }

    static void test_returnBook() {
        Book b = new Book(1, "Java", 2);
        b.returnBook();
        System.out.println("returnBook PASS: " + (b.copies == 3));
    }

    static void test_calculateFine() {
        IssueTransaction t = new IssueTransaction(1, 4);
        System.out.println("calculateFine PASS: " + (t.calculateFine() == 20));

        IssueTransaction t2 = new IssueTransaction(2, 2);
        System.out.println("calculateFine FAIL: " + (t2.calculateFine() == 20));
    }

    static void test_isValidUser() {
        User u = new User(101, "Manav");
        System.out.println("isValidUser PASS: " + (u.isValidUser() == true));

        User u2 = new User(-1, "Test");
        System.out.println("isValidUser FAIL: " + (u2.isValidUser() == true));
    }

    public static void main(String[] args) {

        System.out.println("---- Running Tests ----");

        test_isBookAvailable();
        test_issueBook();
        test_returnBook();
        test_calculateFine();
        test_isValidUser();
    }
}