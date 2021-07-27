package beansPostProcessing;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanFactoryPostProcessorRealisation implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor changed initMethod of beanB");
        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("beanB");
        beanDefinition.setInitMethodName("initMethod");
    }
}
