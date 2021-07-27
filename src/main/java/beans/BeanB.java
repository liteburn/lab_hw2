package beans;

public class BeanB extends Bean{
    public BeanB(int value, String name) {
        super(value, name);
        System.out.println("BeanB constructor");

    }

    private void init(){
        System.out.println("BeanB initialized");
    }

    private void initMethod(){
        System.out.println("BeanB initialized after postProcessorFactory");
    }

    public void destroy(){
        System.out.println("BeanB destroyed");
    }
}
