package app.principal;

import app.tabuleiro.JogadorCpu;
import app.tabuleiro.Tabuleiro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class SampleController {
	
	/*
	 * Declaração dos objetos
	 */
	Tabuleiro Partida = new Tabuleiro();
	JogadorCpu Cpu = new JogadorCpu();
	
	@FXML
	private Button btnSE, btnSM, btnSD;
	@FXML
	private Button btnME, btnMM, btnMD;
	@FXML
	private Button btnIE, btnIM, btnID;
	
	
	@FXML
	private void actbtnSE(ActionEvent event){
		btnSE.setText("X");
		btnSE.setDisable(true);		
	}
	
	@FXML
	private void actbtnSM(ActionEvent event){
		btnSM.setText("X");
		btnSM.setDisable(true);
	}
	
	@FXML
	private void actbtnSD(ActionEvent event){
		btnSD.setText("X");
		btnSD.setDisable(true);
	}
	
	@FXML
	private void actbtnME(ActionEvent event){
		btnME.setText("X");
		btnME.setDisable(true);
	}
	
	@FXML
	private void actbtnMM(ActionEvent event){
		btnMM.setText("X");
		btnMM.setDisable(true);
	}
	
	@FXML
	private void actbtnMD(ActionEvent event){
		btnMD.setText("X");
		btnMD.setDisable(true);
	}
	
	@FXML
	private void actbtnIE(ActionEvent event){
		btnIE.setText("X");
		btnIE.setDisable(true);
	}
	
	@FXML
	private void actbtnIM(ActionEvent event){
		btnIM.setText("X");
		btnIM.setDisable(true);
	}
	
	@FXML
	private void actbtnID(ActionEvent event){
		btnID.setText("X");
		btnID.setDisable(true);
	}
	
	
	@FXML	
	private void actMenFechar(ActionEvent event){
		System.exit(0);
	}
	
	@FXML
	private void actMenSobre(ActionEvent event){
		Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
        dialogoInfo.setTitle("Sobre");
        dialogoInfo.setHeaderText("Tic Tac Toe");
        dialogoInfo.setContentText("Desenvolvidor por.: Juliano Dorigão \n\n"
			 						+"Versão.: 0.3 Beta \n\n");
        dialogoInfo.showAndWait();
	}
	
}
