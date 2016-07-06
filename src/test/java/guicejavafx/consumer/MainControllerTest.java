package guicejavafx.consumer;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import guicejavafx.GuiceJavaFXApp;
import guicejavafx.service.MessageGenerator;
import guicejavafx.service.MockMessageGenerator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mario on 06/07/2016.
 */
public class MainControllerTest {
    private Injector injector;

    @Before
    public void setUp() throws Exception {
        injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(MessageGenerator.class).to(MockMessageGenerator.class);
            }
        });
    }

    @After
    public void tearDown() throws Exception {
        injector = null;
    }

    @Test
    public void test() throws Exception {
        MainController mainController = injector.getInstance(MainController.class);
        Assert.assertEquals("Mock message", mainController.getMessageGenerator().getMessage());
    }
}