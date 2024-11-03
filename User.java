import java.util.HashSet;
import java.util.Set;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof User))
            return false;
        User user = (User) obj;
        return user.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

class UserMain {
    public static void main(String[] args) {
        Set<User> set = new HashSet<>();
        set.add(new User("Aman"));
        set.add(new User("Baman"));
        set.add(new User("Amar"));
        set.add(new User("Amaz"));
        set.add(new User("Aman"));
        for (User user : set) {
            System.out.println(user);
        }
        System.out.println(set.size());
    }
}