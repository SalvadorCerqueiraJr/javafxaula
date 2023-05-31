package projeto;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimeiraTela {

    @FXML
    private void entrar() throws IOException {
        App.setRoot("secondary");
    }
}