public class Main {
    public static void main(String[] args) {

        // User Test
        User u = new User(101, "Manav");
        u.login();

        // Book Test
        Book b = new Book(1, "Java", 2);

        System.out.println("Book Available: " + b.isAvailable());

        boolean issued = b.issueBook();
        System.out.println("Book Issued: " + issued);

        b.returnBook();
        System.out.println("Book Returned, Copies: " + b.copies);

        // Transaction Test (Fine)
        IssueTransaction t = new IssueTransaction(1, 4);
        System.out.println("Fine: " + t.calculateFine());

        // Member Test
        LibraryMember m = new LibraryMember(102, "User");
        m.searchBook("Data Structures");
    }
}