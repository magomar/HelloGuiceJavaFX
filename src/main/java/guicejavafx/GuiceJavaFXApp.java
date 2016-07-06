package guicejavafx;
/**
 * Created by mario on 05/07/2016.
 */

import com.cathive.fx.guice.GuiceApplication;
import com.cathive.fx.guice.GuiceFXMLLoader;
import com.google.inject.Module;
import guicejavafx.binding.AppInjector;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.inject.Inject;
import java.util.List;

public class GuiceJavaFXApp extends GuiceApplication {

    @Inject
    private GuiceFXMLLoader fxmlLoader;

    @Override
    public void start(Stage primaryStage) throws Exception {
        GuiceFXMLLoader.Result result = fxmlLoader.load(getClass().getResource("/Main.fxml"));
        Parent root = result.getRoot();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init(List<Module> modules) throws Exception {
        modules.add(new AppInjector());
    }
}
