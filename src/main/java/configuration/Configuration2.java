package configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Configuration1.class)
public class Configuration2 {
}
