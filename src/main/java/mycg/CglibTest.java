package mycg;

public class CglibTest {
    public static void main(String[] args) {
            UserDao userDao = new UserDao();
            System.out.println(userDao.getClass());

            Object o = (new CglibProxyFactory(userDao)).getProxyInstance();
            System.out.println(o.getClass());
            UserDao proxy = (UserDao) o;

            proxy.save("Hello", " World");
            proxy.update();

    }
}
