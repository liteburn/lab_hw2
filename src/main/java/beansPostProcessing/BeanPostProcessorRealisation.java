package beansPostProcessing;

import beans.Bean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class BeanPostProcessorRealisation implements BeanPostProcessor {
    Logger logger = Logger.getLogger(String.valueOf(this.getClass()));

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Bean) {
            if (((Bean) bean).validation()) {
                return bean;
            }
            logger.info("Invalid " + beanName);
        }
        return null;
    }
}
