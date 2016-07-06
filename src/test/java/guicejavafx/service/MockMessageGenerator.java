package guicejavafx.service;

/**
 * Created by mario on 06/07/2016.
 */
public class MockMessageGenerator implements MessageGenerator {
    @Override
    public String getMessage() {
        return "Mock message";
    }
}
