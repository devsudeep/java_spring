package application;

import java.io.FileInputStream;

import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class Main extends Application {
	@Override
	public void start(Stage s) {
		try {
			s.setTitle("ImageView Experiment 1");

////			FileInputStream input = new FileInputStream("resources/images/iconmonstr-home-6-48.png");
////			Image image = new Image(input);
////			ImageView imageView = new ImageView(image);
////
////			HBox hbox = new HBox(imageView);
////
////			Scene scene = new Scene(hbox, 200, 100);
//			s.setScene(scene);
//			s.show();
			// set title for the stage
			s.setTitle("creating buttons");

			// create a button
			Button b = new Button("Start Camera");

			// create a stack pane
			StackPane r = new StackPane();

			// add button
			r.getChildren().add(b);

			// create a scene
			Scene sc = new Scene(r, 200, 200);

			// set the scene
			s.setScene(sc);

			s.show();
			
			VideoCapture capture =new VideoCapture();
			capture.open(0);
			Mat frame =new Mat();
			
			capture.read(frame);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
