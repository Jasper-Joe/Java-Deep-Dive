import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Without using threadlocal
 */
public class SharedMapWithUserContext implements Runnable{
    final static Map<Integer, Context> userContextPerUserId = new ConcurrentHashMap<>();
    private final Integer userId;
    private UserRepository userRepository = new UserRepository();
    SharedMapWithUserContext(Integer userId) {
        this.userId = userId;
    }

    public void run() {
        String username = userRepository.getUserNameForUserId(userId);
        System.out.println("userId: " + userId + ", uuid: " + username);
        userContextPerUserId.put(userId, new Context(username));
    }
}
