class LibraryMember extends User {

    void searchBook(String title) {
        System.out.println("Searching: " + title);
    }

    void reserveBook() {
        System.out.println("Book reserved");
    }
}