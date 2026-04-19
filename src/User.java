class User {
    int userId;
    String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    boolean isValidUser() {
        return userId > 0;
    }

    void login() {
        if (isValidUser()) {
            System.out.println("User logged in");
        } else {
            System.out.println("Invalid user");
        }
    }
}