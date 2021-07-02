public class ThreadLocalWithUserContext implements Runnable{
    private static final ThreadLocal<Context> userContext = new ThreadLocal<>();
    private final Integer userId;
    private UserRepository userRepository = new UserRepository();
    ThreadLocalWithUserContext(Integer userId) {
        this.userId = userId;
    }

    public void run() {
        String userName = userRepository.getUserNameForUserId(userId);
        userContext.set(new Context(userName));
        System.out.println("userId: " + userId + " is " + userContext.get());
    }
}
