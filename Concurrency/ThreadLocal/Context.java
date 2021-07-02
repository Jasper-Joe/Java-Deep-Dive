public class Context {
    private final String username;
    Context(String username) {
        this.username = username;
    }
    @Override
    public String toString() {
        return "Context{" + "userNameSecret= " + username + " }";
    }
}
