package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller  implements Initializable {
//@FXML Button btn01;
@FXML RadioButton HxH;
@FXML Text j1;
@FXML Text j2;
@FXML TextField nj1;
@FXML TextField nj2;
@FXML RadioButton CxH;
@FXML Button btnStart;


    public void clickButton(javafx.event.ActionEvent actionEvent) {
            System.out.println("Click");
            Button b = (Button) actionEvent.getSource();
            b.setText("X");
            b.setDisable(true);

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    //btn01.setText("BTN");
    }

    public void clickClose(ActionEvent actionEvent) {
        System.out.println("Hola");
    }

    public void clickHxH(ActionEvent actionEvent) {
        if (HxH.isSelected()){
            clean();
            j1.setVisible(true);
            nj1.setVisible(true);
            j2.setVisible(true);
            nj2.setVisible(true);
            btnStart.setVisible(true);
        }
    }

    public void clickCxH(ActionEvent actionEvent) {
        if(CxH.isSelected()){
            clean();
            j1.setVisible(true);
            nj1.setVisible(true);
            btnStart.setVisible(true);
        }
    }

    public void clickCxC(ActionEvent actionEvent) {
        clean();
        btnStart.setVisible(true);
    }
    public void clean(){
        j1.setVisible(false);
        nj1.setVisible(false);
        j2.setVisible(false);
        nj2.setVisible(false);
        btnStart.setVisible(false);
    }

    public void pressStart(ActionEvent actionEvent) {

    }
}
