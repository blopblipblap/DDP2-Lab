import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class CreatePlaylist extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setVgap(10);
        gp.setHgap(10);
        gp.setPadding(new Insets(25, 25, 25, 25));

        // membuat greetings text dan icon
        FileInputStream fis = new FileInputStream("src/tired.jpg");
        Image img = new Image(fis);
        ImageView iv = new ImageView(img);
        iv.setFitHeight(45);
        iv.setFitWidth(45);
        HBox greetings = new HBox();
        greetings.setAlignment(Pos.CENTER);
        greetings.setSpacing(10);
        greetings.getChildren().add(iv);
        Text hello = new Text("Hello, Vanessa!");
        hello.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 15));
        greetings.getChildren().add(hello);
        gp.add(greetings, 0, 0, 2, 1);

        // membuat label dan text field playlist
        gp.add(new Label("Playlist name: "), 0, 1 );
        TextField playlistNameField = new TextField();
        gp.add(playlistNameField, 1, 1);

        // membuat label dan text field lagu
        gp.add(new Label("Song title: "), 0, 2);
        TextField songNameField = new TextField();
        gp.add(songNameField, 1, 2);

        // membuat label dan choice box genre
        gp.add(new Label("Genre: "), 0, 3);
        String[] genre = {"Rock", "J-Pop", "EDM"};
        ChoiceBox genreCB = new ChoiceBox(FXCollections.observableArrayList(genre));
        gp.add(genreCB, 1, 3);

        //membuat label dan text field artist
        gp.add(new Label("Artist name: "), 0, 4);
        TextField artistNameField = new TextField();
        gp.add(artistNameField, 1, 4);

        //membuat button
        Button btn = new Button("Add to Playlist");
        gp.add(btn, 1, 5);

        //membuat notifikasi
        btn.setOnAction(event -> {
            primaryStage.setTitle("Java Music | Succesfully added!");
            playlistNameField.clear();
            songNameField.clear();
            genreCB.getItems().clear();
            artistNameField.clear();
        });

        //membuat scene
        Scene createPlaylist = new Scene(gp, 300, 340);
        primaryStage.setTitle("Java Music | Create Playlist");
        primaryStage.setScene(createPlaylist);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    //Launch aplikasi
    public static void main(String[] args) {
        Application.launch(args);
    }
}
