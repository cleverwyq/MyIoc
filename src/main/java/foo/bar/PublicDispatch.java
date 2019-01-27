package foo.bar;

public class PublicDispatch {
    class Human {
        public void sayHello() {
            System.out.println("Inner hi Guy");
        }
    }
    class Man extends Human{
        @Override
        public void sayHello() {
            System.out.println("Inner hi Man");
        }
    }
    class Woman extends Human{
        @Override
        public void sayHello() {
            System.out.println("Inner hi Woman");
        }
    }

    public void sayHello(Human guy) {
        System.out.println("Hi Guy");
        if (guy != null)
            guy.sayHello();
    }

    public void sayHello(Man man) {
        System.out.println("Hi Man");
        if (man != null)
            man.sayHello();
    }

    public void sayHello(Woman woman) {
        System.out.println("Hi Woman");
        if (woman != null)
            woman.sayHello();
    }

    public static void main(String[] args) {
        PublicDispatch pd = new PublicDispatch();
        Human man = pd.new Man();
        Human woman = pd.new Woman();
        System.out.println("1------------");
        pd.sayHello(man);
        pd.sayHello(woman);
        System.out.println("2------------");
        pd.sayHello((Man)man);
        pd.sayHello((Woman)woman);
        System.out.println("3------------");
        pd.sayHello((Man)null);
        pd.sayHello((Woman)null);
        System.out.println("4------------");
        man.sayHello();
        woman.sayHello();

    }
}
