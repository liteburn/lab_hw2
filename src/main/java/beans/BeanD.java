package beans;

public class BeanD extends Bean{

    public BeanD(int value, String name) {
        super(value, name);
        System.out.println("BeanD constructor");
    }
    private void initRealisation(){
        System.out.println("BeanD initialized");
    }
    public void destroy(){
        System.out.println("BeanD destroyed");
    }
}
