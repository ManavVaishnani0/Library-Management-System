public class Main {

    // ------------------ isBookAvailable ------------------

    static void test_isBookAvailable_pass1() {
        Book b = new Book(1, "Java", 5);
        System.out.println("test_isBookAvailable_pass1: " + (b.isAvailable() == true ? "PASS" : "FAIL"));
    }

    static void test_isBookAvailable_pass2() {
        Book b = new Book(2, "C++", 1);
        System.out.println("test_isBookAvailable_pass2: " + (b.isAvailable() == true ? "PASS" : "FAIL"));
    }

    static void test_isBookAvailable_pass3() {
        Book b = new Book(3, "Math", 0);
        System.out.println("test_isBookAvailable_pass3: " + (b.isAvailable() == false ? "PASS" : "FAIL"));
    }

    static void test_isBookAvailable_fail1() {
        Book b = new Book(4, "Physics", 10);
        System.out.println("test_isBookAvailable_fail1: " + (b.isAvailable() == false ? "PASS" : "FAIL"));
    }

    // ------------------ issueBook ------------------

    static void test_issueBook_pass1() {
        Book b = new Book(1, "Java", 3);
        boolean result = b.issueBook();
        System.out.println("test_issueBook_pass1: " + (result == true && b.copies == 2 ? "PASS" : "FAIL"));
    }

    static void test_issueBook_pass2() {
        Book b = new Book(2, "C++", 1);
        boolean result = b.issueBook();
        System.out.println("test_issueBook_pass2: " + (result == true && b.copies == 0 ? "PASS" : "FAIL"));
    }

    static void test_issueBook_pass3() {
        Book b = new Book(3, "Math", 0);
        boolean result = b.issueBook();
        System.out.println("test_issueBook_pass3: " + (result == false ? "PASS" : "FAIL"));
    }

    static void test_issueBook_fail1() {
        Book b = new Book(4, "Physics", 0);
        boolean result = b.issueBook();
        System.out.println("test_issueBook_fail1: " + (result == true ? "PASS" : "FAIL"));
    }

    // ------------------ returnBook ------------------

    static void test_returnBook_pass1() {
        Book b = new Book(1, "Java", 2);
        b.returnBook();
        System.out.println("test_returnBook_pass1: " + (b.copies == 3 ? "PASS" : "FAIL"));
    }

    static void test_returnBook_pass2() {
        Book b = new Book(2, "C++", 0);
        b.returnBook();
        System.out.println("test_returnBook_pass2: " + (b.copies == 1 ? "PASS" : "FAIL"));
    }

    static void test_returnBook_pass3() {
        Book b = new Book(3, "Math", 5);
        b.returnBook();
        System.out.println("test_returnBook_pass3: " + (b.copies == 6 ? "PASS" : "FAIL"));
    }

    static void test_returnBook_fail1() {
        Book b = new Book(4, "Physics", 4);
        b.returnBook();
        System.out.println("test_returnBook_fail1: " + (b.copies == 4 ? "PASS" : "FAIL"));
    }

    // ------------------ calculateFine ------------------

    static void test_calculateFine_pass1() {
        IssueTransaction t = new IssueTransaction(1, 5);
        System.out.println("test_calculateFine_pass1: " + (t.calculateFine() == 25 ? "PASS" : "FAIL"));
    }

    static void test_calculateFine_pass2() {
        IssueTransaction t = new IssueTransaction(2, 0);
        System.out.println("test_calculateFine_pass2: " + (t.calculateFine() == 0 ? "PASS" : "FAIL"));
    }

    static void test_calculateFine_pass3() {
        IssueTransaction t = new IssueTransaction(3, 2);
        System.out.println("test_calculateFine_pass3: " + (t.calculateFine() == 10 ? "PASS" : "FAIL"));
    }

    static void test_calculateFine_fail1() {
        IssueTransaction t = new IssueTransaction(4, 4);
        System.out.println("test_calculateFine_fail1: " + (t.calculateFine() == 30 ? "PASS" : "FAIL"));
    }

    // ------------------ isValidUser ------------------

    static void test_isValidUser_pass1() {
        User u = new User(101, "A");
        System.out.println("test_isValidUser_pass1: " + (u.isValidUser() == true ? "PASS" : "FAIL"));
    }

    static void test_isValidUser_pass2() {
        User u = new User(1, "B");
        System.out.println("test_isValidUser_pass2: " + (u.isValidUser() == true ? "PASS" : "FAIL"));
    }

    static void test_isValidUser_pass3() {
        User u = new User(0, "C");
        System.out.println("test_isValidUser_pass3: " + (u.isValidUser() == false ? "PASS" : "FAIL"));
    }

    static void test_isValidUser_fail1() {
        User u = new User(-1, "D");
        System.out.println("test_isValidUser_fail1: " + (u.isValidUser() == true ? "PASS" : "FAIL"));
    }

    // ------------------ MAIN ------------------

    public static void main(String[] args) {

        System.out.println("------ Running All Tests ------");

        test_isBookAvailable_pass1();
        test_isBookAvailable_pass2();
        test_isBookAvailable_pass3();
        test_isBookAvailable_fail1();

        test_issueBook_pass1();
        test_issueBook_pass2();
        test_issueBook_pass3();
        test_issueBook_fail1();

        test_returnBook_pass1();
        test_returnBook_pass2();
        test_returnBook_pass3();
        test_returnBook_fail1();

        test_calculateFine_pass1();
        test_calculateFine_pass2();
        test_calculateFine_pass3();
        test_calculateFine_fail1();

        test_isValidUser_pass1();
        test_isValidUser_pass2();
        test_isValidUser_pass3();
        test_isValidUser_fail1();
    }
}