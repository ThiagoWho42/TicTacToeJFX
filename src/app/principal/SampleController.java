package app.principal;

import app.tabuleiro.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;



public class SampleController {
	
	private int VerificaVencedor = 0, continuar = 0;// Verifica a cada jogada se houve vencedor ou empate
	private Tabuleiro Partida = new Tabuleiro();
	private JogadorCpu Cpu = new JogadorCpu();
	
	@FXML
	private Button btnSE, btnSM, btnSD;
	@FXML
	private Button btnME, btnMM, btnMD;
	@FXML
	private Button btnIE, btnIM, btnID;
	@FXML
	private Label lblPlayer1, lblEmpate, lblPlayer2;
		
	
	@FXML
	private void actbtnSE(ActionEvent event){
		player1(0, true, "X");	
	}
	
	@FXML
	private void actbtnSM(ActionEvent event){
		player1(1, true, "X");
	}
	
	@FXML
	private void actbtnSD(ActionEvent event){
		player1(2, true, "X");
	}
	
	@FXML
	private void actbtnME(ActionEvent event){
		player1(3, true, "X");
	}
	
	@FXML
	private void actbtnMM(ActionEvent event){
		player1(4, true, "X");
	}
	
	@FXML
	private void actbtnMD(ActionEvent event){
		player1(5, true, "X");
	}
	
	@FXML
	private void actbtnIE(ActionEvent event){
		player1(6, true, "X");
	}
	
	@FXML
	private void actbtnIM(ActionEvent event){
		player1(7, true, "X");
	}
	
	@FXML
	private void actbtnID(ActionEvent event){
		player1(8, true, "X");
	}
	
	@FXML
	private void actmenIniciar(ActionEvent event){
		iniciaPartida();		
	}
	
	@FXML
	private void actmenEncerrar(ActionEvent event){
		encerraPartida();
	}
	
	@FXML	
	private void actmenFechar(ActionEvent event){
		System.exit(0);
	}
	
	@FXML
	private void actmenSobre(ActionEvent event){
		Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
        dialogoInfo.setTitle("Sobre");
        dialogoInfo.setHeaderText("Tic Tac Toe");
        dialogoInfo.setContentText("Desenvolvidor por.: Juliano Dorigão \n\n"
			 						+"Versão.: 1.0 Beta \n\n"
        							+"Github.: https://github.com/jdorigao/TicTacToeJFX \n\n");
        dialogoInfo.showAndWait();
	}
	
	private void placarJogo(int player1, int empate, int player2){
		lblPlayer1.setText(Integer.toString(player1));
		lblEmpate.setText(Integer.toString(empate));
		lblPlayer2.setText(Integer.toString(player2));
	}
	
	
	/*
	 * Procedimento que inicializa o tabuleiro para o jogo
	 */
	private void iniciaPartida(){
		//Inicializa tabuleiro e jogada do player 2
		Partida.iniciaTabuleiro();
		Cpu.iniciaCpu();
		
		//Inicializa os botões		
		btnSE.setText(null);
		btnSE.setDisable(false);
		
		btnSM.setText(null);
		btnSM.setDisable(false);
		
		btnSD.setText(null);
		btnSD.setDisable(false);
		
		btnME.setText(null);
		btnME.setDisable(false);
		
		btnMM.setText(null);
		btnMM.setDisable(false);
		
		btnMD.setText(null);
		btnMD.setDisable(false);
		
		btnIE.setText(null);
		btnIE.setDisable(false);
		
		btnIM.setText(null);
		btnIM.setDisable(false);
		
		btnID.setText(null);
		btnID.setDisable(false);				
	}
	
	private void encerraPartida(){
		//Inicializa tabuleiro e jogada do player 2
		Partida.encerraPartida();
		
		placarJogo(Partida.getJogador1(), Partida.getEmpate(), Partida.getJogador2());
				
		//Inicializa os botões		
		btnSE.setText(null);
		btnSE.setDisable(true);
		
		btnSM.setText(null);
		btnSM.setDisable(true);
			
		btnSD.setText(null);
		btnSD.setDisable(true);
				
		btnME.setText(null);
		btnME.setDisable(true);
				
		btnMM.setText(null);
		btnMM.setDisable(true);
				
		btnMD.setText(null);
		btnMD.setDisable(true);
				
		btnIE.setText(null);
		btnIE.setDisable(true);
				
		btnIM.setText(null);
		btnIM.setDisable(true);
				
		btnID.setText(null);
		btnID.setDisable(true);		
	}

	private void player1(int id, boolean status, String letrajogador) {
		
		switch (id) {
		case 0:
			btnSE.setText(letrajogador);
			btnSE.setDisable(status);	
			Partida.setTabuleiro(1, 0);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			else
				jogoCPU();
						
			break;
			
		case 1:
			btnSM.setText(letrajogador);
			btnSM.setDisable(status);	
			Partida.setTabuleiro(1, 1);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			else
				jogoCPU();
			break;
			
		case 2:			
			btnSD.setText(letrajogador);
			btnSD.setDisable(status);	
			Partida.setTabuleiro(1, 2);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			else
				jogoCPU();
			break;
			
		case 3:
			btnME.setText(letrajogador);
			btnME.setDisable(status);	
			Partida.setTabuleiro(1, 3);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			else
				jogoCPU();
			break;
			
		case 4:
			btnMM.setText(letrajogador);
			btnMM.setDisable(status);	
			Partida.setTabuleiro(1, 4);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			else
				jogoCPU();
			break;
			
		case 5:
			btnMD.setText(letrajogador);
			btnMD.setDisable(status);	
			Partida.setTabuleiro(1, 5);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			else
				jogoCPU();
			break;
			
		case 6:
			btnIE.setText(letrajogador);
			btnIE.setDisable(status);	
			Partida.setTabuleiro(1, 6);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			else
				jogoCPU();
			break;
			
		case 7:
			btnIM.setText(letrajogador);
			btnIM.setDisable(status);
			Partida.setTabuleiro(1, 7);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			else
				jogoCPU();
			break;
		case 8:
			btnID.setText(letrajogador);
			btnID.setDisable(status);
			Partida.setTabuleiro(1, 8);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			else
				jogoCPU();
			break;
		}
	}
		
	private void player2(int id, boolean status, String letrajogador) {
		
		switch (id) {
		case 0:
			btnSE.setText(letrajogador);
			btnSE.setDisable(status);	
			Partida.setTabuleiro(2, 0);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);									
			break;
			
		case 1:
			btnSM.setText(letrajogador);
			btnSM.setDisable(status);	
			Partida.setTabuleiro(2, 1);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			break;
			
		case 2:			
			btnSD.setText(letrajogador);
			btnSD.setDisable(status);	
			Partida.setTabuleiro(2, 2);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			break;
			
		case 3:
			btnME.setText(letrajogador);
			btnME.setDisable(status);	
			Partida.setTabuleiro(2, 3);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			break;
			
		case 4:
			btnMM.setText(letrajogador);
			btnMM.setDisable(status);	
			Partida.setTabuleiro(2, 4);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			break;
			
		case 5:
			btnMD.setText(letrajogador);
			btnMD.setDisable(status);	
			Partida.setTabuleiro(2, 5);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			break;
			
		case 6:
			btnIE.setText(letrajogador);
			btnIE.setDisable(status);	
			Partida.setTabuleiro(2, 6);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			break;
			
		case 7:
			btnIM.setText(letrajogador);
			btnIM.setDisable(status);
			Partida.setTabuleiro(2, 7);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			break;
		case 8:
			btnID.setText(letrajogador);
			btnID.setDisable(status);
			Partida.setTabuleiro(2, 8);
			
			VerificaVencedor = Partida.verificaVencedor();				
			
			
			if (VerificaVencedor != 0)
				continuaPartida(VerificaVencedor);
			break;
		}
	}
	
	
	
	
	/*
	 * Faz a jogada da CPU
	 */
	private void jogoCPU() {	
		int aux = Cpu.jogadaCpu(Partida.getTabuleiro());
		player2(aux, true, "O");// Disabilita o botão e insere a letra do jogado		
	}
	

		
	private void continuaPartida(int vencedor) {
		
		placarJogo(Partida.getJogador1(), Partida.getEmpate(), Partida.getJogador2());
		
				
		Alert dialogoExe = new Alert(Alert.AlertType.CONFIRMATION);
        ButtonType btnSim = new ButtonType("Sim");
        ButtonType btnNao = new ButtonType("Não");
            

        dialogoExe.setTitle("Tic Tac Toe");

        if (vencedor == 1)
			dialogoExe.setHeaderText("Você venceu...!");								

		if (vencedor == 2)
			dialogoExe.setHeaderText("Você perdeu...!");
				
		if (vencedor == 3)
			dialogoExe.setHeaderText("Empate...!");			
			
		dialogoExe.setContentText("Deseja continuar?");
        dialogoExe.getButtonTypes().setAll(btnSim, btnNao);
        dialogoExe.showAndWait().ifPresent(b -> {
              if (b == btnSim)
                  continuar = 0;
              if (b == btnNao)
            	  continuar = 1;
        });
			

              if (continuar == 0){		
            	  iniciaPartida();
              }else{
            	  encerraPartida();
              }
    }
}
	

