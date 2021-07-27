package beans;

public class BeanC extends Bean{

    public BeanC(int value, String name) {
        super(value, name);
        System.out.println("BeanC constructor");
    }

    private void initialization(){
        System.out.println("BeanC initialized");
    }
    public void destroyRealisation(){
        System.out.println("BeanC destroyed");
    }
}
