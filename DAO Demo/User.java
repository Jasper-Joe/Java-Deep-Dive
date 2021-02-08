public class User {
    private String name;
    private String email;
    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }

    void setName(String name) {
        this.name = name;
    }

    void setEmail(String email) {
        this.email = email;
    }
}
