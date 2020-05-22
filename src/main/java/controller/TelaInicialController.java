package controller;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import controller.util.Alerts;
import dao.entities.UsuarioDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import model.entities.Usuario;
import view.InterfaceUsuario;


public class TelaInicialController implements Initializable {

	private static InterfaceUsuario view = new InterfaceUsuario();
	private static Alerts alert = new Alerts();
	
	@FXML
	private JFXTextField txtUsuario;
	
	@FXML
	private JFXTextField txtEmail;
	
	@FXML
	private JFXPasswordField passUsuario;
	
	@FXML
	private JFXButton btnInscreva;
	
	@FXML
	private JFXButton btnLogin;
	
	@FXML
	public void onBtnInscrevaAction(ActionEvent event) {
		String txtUsuarioString = txtUsuario.getText();
		String txtEmailString = txtEmail.getText();
		String passUsuarioString = passUsuario.getText();
		
		if(txtUsuarioString.isEmpty() || txtEmailString.isEmpty() || passUsuarioString.isEmpty()) {
			alert.showAlert("Erro", "Erro ao Preencher Valores", "Por favor preencha todos os campos solicitados", AlertType.ERROR);
		} else {
			Usuario usuario = new Usuario();
			usuario.setNomeUsuario(txtUsuario.getText());
			usuario.setEmail(txtEmail.getText());
			usuario.setSenha(passUsuario.getText());
			usuario.setDataCadastro(new Date());
			
			UsuarioDAO daoUsuario = new UsuarioDAO();
			daoUsuario.save(usuario);
			view.telaLogin(event, "/fxml/Login.fxml", "SisComercio - Tela Login");
		}
	}
	
	@FXML
	public void onBtnLoginAction(ActionEvent event) {
		view.telaLogin(event, "/fxml/Login.fxml", "SisComercio - Tela Login");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
