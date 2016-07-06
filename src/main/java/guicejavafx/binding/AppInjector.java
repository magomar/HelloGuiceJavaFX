package guicejavafx.binding;

import com.google.inject.AbstractModule;
import guicejavafx.service.HelloWorldMessageGenerator;
import guicejavafx.service.MessageGenerator;

/**
 * Created by mario on 05/07/2016.
 */
public class AppInjector extends AbstractModule {
    protected void configure() {
        bind(MessageGenerator.class).to(HelloWorldMessageGenerator.class);
    }
}
