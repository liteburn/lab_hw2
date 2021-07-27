package beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA extends Bean implements InitializingBean, DisposableBean {
    public BeanA(int value, String name) {
        super(value, name);
        System.out.println("BeanA constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean A was destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean A was set");
    }
}
