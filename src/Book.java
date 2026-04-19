class Book {
    int bookId;
    String title;
    int copies;

    public Book(int bookId, String title, int copies) {
        this.bookId = bookId;
        this.title = title;
        this.copies = copies;
    }

    boolean isAvailable() {
        return copies > 0;
    }

    boolean issueBook() {
        if (copies > 0) {
            copies--;
            return true;
        }
        return false;
    }

    void returnBook() {
        copies++;
    }
}