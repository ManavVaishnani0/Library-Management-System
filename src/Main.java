public class Main {
    public static void main(String[] args) {

        LibraryMember m = new LibraryMember();
        m.login();
        m.searchBook("Java");

        Book b = new Book();
        b.checkAvailability();
    }
}