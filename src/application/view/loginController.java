package application.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginController {

	@FXML
	private PasswordField txtSenha;

	@FXML
	private TextField txtUsuario;

	
	public void sair() {
		System.exit(0);
	}
	public void entrar() {
		try {
		String usuario=txtUsuario.getText();
		String senha=txtSenha.getText();
		
		if(usuario.equals("caio")
				&& senha.equals("admin")) {
			Alert mensagem;
			mensagem = new Alert(Alert.AlertType.CONFIRMATION);
			mensagem.setTitle("Confirmação");
			mensagem.setHeaderText(null);
			mensagem.setContentText("bem vindo ao sistema "+usuario);
			mensagem.showAndWait();
			//Fechar tela de login
			txtUsuario.getScene().getWindow().hide();
			
			//ABRE A TELA PRINCIPAL
			Parent root = FXMLLoader.load(getClass().getResource("aplicativo.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
		}else {
			Alert mensagem;
			mensagem = new Alert(Alert.AlertType.ERROR);
			mensagem.setTitle("Error ");
			mensagem.setContentText("usuario ou senha incorretos "+usuario);
			mensagem.showAndWait();
		}
	} catch(Exception e) {
		e.printStackTrace();
   } 
 }
	@FXML
	private void initialize() {
		txtUsuario.setOnAction(e->{txtSenha.requestFocus();});
		txtSenha.setOnAction(e->{entrar();});
	}

}
