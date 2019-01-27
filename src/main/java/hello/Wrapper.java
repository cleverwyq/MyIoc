package hello;

public class Wrapper {
    public UserDao ud;
    Wrapper(){
        this.ud = new UserDao();
    }
    Wrapper(UserDao ud) {
        this.ud = ud;
    }

    public void tell() {
        System.out.println(ud.getName());
        ud.setName("Love");
    }
}
