package guicejavafx.consumer;

import guicejavafx.service.MessageGenerator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import javax.inject.Inject;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by mario on 05/07/2016.
 */
public class MainController implements Initializable {
    @FXML
    private Label label;

    MessageGenerator messageGenerator;

    @Inject
    public MainController(MessageGenerator messageGenerator) {
        this.messageGenerator = messageGenerator;
    }

//    @Inject
//    public void setMessageGenerator(MessageGenerator messageGenerator) {
//        this.messageGenerator = messageGenerator;
//    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText(messageGenerator.getMessage());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public MessageGenerator getMessageGenerator() {
        return messageGenerator;
    }
}
