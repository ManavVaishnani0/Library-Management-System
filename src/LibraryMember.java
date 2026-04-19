class LibraryMember extends User {

    public LibraryMember(int userId, String name) {
        super(userId, name);
    }

    void searchBook(String title) {
        System.out.println("Searching book: " + title);
    }
}