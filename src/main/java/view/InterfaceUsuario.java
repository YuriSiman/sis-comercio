package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InterfaceUsuario extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Parent parent = FXMLLoader.load((getClass().getResource("/fxml/TelaInicial.fxml")));
			Scene scene = new Scene(parent);
			scene.getStylesheets().add(getClass().getResource("/css/estilo.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("SisComercio - Tela Inicial");
			primaryStage.show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void telaInicial(ActionEvent event) {
		try {
			Parent parent = FXMLLoader.load((getClass().getResource("/fxml/TelaInicial.fxml")));
			Scene scene = new Scene(parent);
			Stage login = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("/css/estilo.css").toExternalForm());
		
			login.setScene(scene);
			login.setTitle("SisComercio - Tela Inicial");
			login.show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
