import java.util.Optional;

public class App {
    private static Dao<User> userDao;
    public static void main(String[] args) {
        userDao = new UserDao();

        User user1 = new User("Jack","Bauer@gmail.com");
        userDao.save(user1);
        User res = getUser(0);

        User user2 = new User("James","Bond@gmail.com");
        userDao.save(user2);
        userDao.getAll().forEach(user -> System.out.println(user.getName()));

        User user3 = getUser(0);
        userDao.update(user3,new String[] {"Jasper","haha@163.com"});
        
        //userDao.delete(user3);
        userDao.getAll().forEach(user -> System.out.println(user.getName()));


    }

    private static User getUser(long id) {
        Optional<User> user = userDao.get(id);
        return user.orElseGet(() -> new User("non-existing user","no-email"));
    }
}
