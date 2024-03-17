package web.djunqueirao.app_rh.configuration;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class WebServerConfiguration implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {

    @Override
    public void customize(ConfigurableWebServerFactory configurableWebServerFactory) {
    	configurableWebServerFactory.setPort(Integer.parseInt(Properties.PORT.toString()));
    }
}