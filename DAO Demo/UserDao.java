import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDao implements Dao<User> {
    private List<User> users = new ArrayList<>();

    @Override
    public Optional<User> get(long id) {
        return Optional.ofNullable(users.get((int)id));
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);

    }

    @Override
    public void update(User user, String[] params) {
        for(User u: users) {
            if(u.equals(user)) {
                u.setName(params[0]);
                u.setEmail(params[1]);
                break;
            }
        }

    }

    @Override
    public void delete(User user) {
        users.remove(user);

    }
}
