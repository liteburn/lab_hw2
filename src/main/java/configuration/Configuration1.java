package configuration;

import beans.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan(basePackages = {"beans", "beansPostProcessing"})
@PropertySource(value = "beans.properties")
public class Configuration1 {
    @Bean
    public BeanA beanA(@Value("1") Integer value, @Value("A") String name) {
        return new BeanA(value, name);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @DependsOn({"beanD"})
    public BeanB beanB(@Value("${beanB.value}") Integer value, @Value("${beanB.name}") String name) {
        return new BeanB(value, name);
    }

    @Bean(initMethod = "initialization", destroyMethod = "destroyRealisation")
    @DependsOn({"beanD", "beanB"})
    public BeanC beanC(@Value("${beanC.value}") Integer value, @Value("${beanC.name}") String name) {
        return new BeanC(value, name);
    }

    @Bean(initMethod = "initRealisation", destroyMethod = "destroy")
    public BeanD beanD(@Value("${beanD.value}") Integer value, @Value("${beanD.name}") String name) {
        return new BeanD(value, name);
    }

    @Bean
    public BeanE beanE(@Value("5") Integer value, @Value("E") String name){
        return new BeanE(value, name);
    }

    @Bean
    @Lazy
    public BeanF beanF(@Value("6") Integer value, @Value("F") String name) {
        return new BeanF(value, name);
    }
}
