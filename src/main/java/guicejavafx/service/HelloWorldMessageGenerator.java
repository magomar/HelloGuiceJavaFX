package guicejavafx.service;

import javax.inject.Singleton;

/**
 * Created by mario on 05/07/2016.
 */
@Singleton
public class HelloWorldMessageGenerator implements MessageGenerator{
    public String getMessage() {
        return "Hello World";
    }
}
