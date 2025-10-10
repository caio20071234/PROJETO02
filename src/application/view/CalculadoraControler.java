package application.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraControler {

    @FXML
    private Button btnDividir;

    @FXML
    private Button btnMultiplicar;

    @FXML
    private Label btnResultado;

    @FXML
    private Button btnSomar;

    @FXML
    private Button btnSubtrair;

    @FXML
    private TextField txtNumero1;

    @FXML
    private TextField txtNumero2;
    
    @FXML
	private void inicialize() {
		// abrirPaginaInicial();
	}
    txtNumero1.textProperty().addListener(
    (observable, oldValue, newValue)->{
    txtNumero1.setText(newValue.replaceAll("[^\\d]",""));
    });
    // +
    public void Somar() {
		double numero1 ;
		double numero2 ;
		
		try {
			numero1 = Double.valueOf(txtNumero1.getText());
		} catch(Exception e) {
			numero1 = 0;
			txtNumero1.setText("");
		}
		
		try {
			numero2 = Double.valueOf(txtNumero2.getText());
		} catch(Exception e) {
			numero2 = 0;
			txtNumero2.setText("");
		}

		double resultado = numero1 + numero2;
		
		btnResultado.setText(String.valueOf(resultado));
		
	}
    // X
    public void Mult() {
		double numero1 ;
		double numero2 ;
		
		try {
			numero1 = Double.valueOf(txtNumero1.getText());
		} catch(Exception e) {
			numero1 = 0;
			txtNumero1.setText("");
		}
		
		try {
			numero2 = Double.valueOf(txtNumero2.getText());
		} catch(Exception e) {
			numero2 = 0;
			txtNumero2.setText("");
		}

		
		double resultado = numero1 * numero2;
		
		btnResultado.setText(String.valueOf(resultado));
		
	}
    // %
    public void Dividir() {
		double numero1 ;
		double numero2 ;
		
		try {
			numero1 = Double.valueOf(txtNumero1.getText());
		} catch(Exception e) {
			numero1 = 0;
			txtNumero1.setText("");
		}
		
		try {
			numero2 = Double.valueOf(txtNumero2.getText());
		} catch(Exception e) {
			numero2 = 0;
			txtNumero2.setText("");
		}

		
		double resultado = numero1 / numero2;
		
		btnResultado.setText(String.valueOf(resultado));
		
	}
    // -
    public void Subtrair() {
		double numero1 ;
		double numero2 ;
		
		try {
			numero1 = Double.valueOf(txtNumero1.getText());
		} catch(Exception e) {
			numero1 = 0;
			txtNumero1.setText("");
		}
		
		try {
			numero2 = Double.valueOf(txtNumero2.getText());
		} catch(Exception e) {
			numero2 = 0;
			txtNumero2.setText("");
		}

		
		double resultado = numero1 - numero2;
		
		btnResultado.setText(String.valueOf(resultado));
		
	}
    // METODO DE CONVERTER STRING PARA DOUBLE
    private void StrToDbl(String numero) {
    	try {
    		System.out.print(" OCORREU UM ERRO!!! ");
    	} catch(Exception e) {
    		
    	}
    }
    
    

}

