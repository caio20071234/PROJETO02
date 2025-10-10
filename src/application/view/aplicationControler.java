package application.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class aplicationControler {

    @FXML
    private AnchorPane conteudoPlane;
    
    private void carregarTela(String fxmlfile) {
    	try {
    		Parent fxml = FXMLLoader.load(getClass().getResource(fxmlfile));
    		conteudoPlane.getChildren().clear();
    		conteudoPlane.getChildren().add(fxml);
    		
    		conteudoPlane.setTopAnchor(fxml,0.0);
    		conteudoPlane.setBottomAnchor(fxml,0.0);
    		conteudoPlane.setLeftAnchor(fxml,0.0);
    		conteudoPlane.setRightAnchor(fxml,0.0);
    		Scene cena = conteudoPlane.getScene();
    		
    		if(cena!=null) {
    			Stage stage = (Stage) cena.getWindow();
    		}
    		
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	
    }
    @FXML
	private void abrirPaginaInicial() {
		carregarTela("aplicativo.fxml");
	}
	
    @FXML
    private void abrirCalculadora() {
    	carregarTela("calculadora.fxml");
    }
    
	@FXML
	private void inicialize() {
		// abrirPaginaInicial();
	}
	
}

