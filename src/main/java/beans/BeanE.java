package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE extends Bean{

    public BeanE(int value, String name) {
        super(value, name);
        System.out.println("BeanE constructor");
    }

    @PostConstruct
    private void postConstruct(){
        System.out.println("PostConstruct of beanE was called.");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("PreDestroy of beanE was called.");
    }
}
