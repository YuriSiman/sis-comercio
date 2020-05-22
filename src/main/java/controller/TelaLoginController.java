package controller;

import java.net.URL;
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

public class TelaLoginController implements Initializable {

	private static InterfaceUsuario view = new InterfaceUsuario();
	private static Alerts alert = new Alerts();
	
	@FXML
	private JFXTextField txtUsuarioEmail;
	
	@FXML
	private JFXPasswordField passUsuario;
	
	@FXML
	private JFXButton btEntrar;
	
	@FXML
	private JFXButton btCancelar;
	
	
	
	@FXML
	public void onBtEntrarAction(ActionEvent event) {
		String txtUsuarioEmailString = txtUsuarioEmail.getText();
		String passUsuarioString = passUsuario.getText();
		
		if(txtUsuarioEmailString.isEmpty() || passUsuarioString.isEmpty()) {
			alert.showAlert("Erro", "Erro ao Preencher Valores", "Por favor preencha todos os campos solicitados", AlertType.ERROR);
		}else {
			UsuarioDAO daoUsuario = new UsuarioDAO();
			Usuario usuario = new Usuario();
			try {
				usuario = daoUsuario.findByNameUserEmail(txtUsuarioEmail.getText());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
				if((usuario.getNomeUsuario().equals(txtUsuarioEmail.getText()) || usuario.getEmail().equals(txtUsuarioEmail.getText())) && usuario.getSenha().equals(passUsuario.getText())) {
					
				}else {
					alert.showAlert("Erro", "Usuário Não Identificado", "Não existe usuário cadastrado com este nome de usuário/e-mail e senha", AlertType.ERROR);
				}
		}
	}
	
	@FXML
	public void onBtCancelarAction(ActionEvent event) {
		view.telaInicial(event, "/fxml/TelaInicial.fxml", "SisComercial - Tela Inicial");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
