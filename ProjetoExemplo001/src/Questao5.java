import  java.text.DecimalFormat ;

import  javax.swing.JOptionPane ;
public  class  Questao5 {

	public  static  void  main ( String [] args ) {
		
		
		JOptionPane . showMessageDialog ( null , " Total de Horas " , " Folha de Pagamento " , JOptionPane . QUESTION_MESSAGE );
		String funcionario =  JOptionPane . showInputDialog ( " Nome do Funcion�rio " );
		double totalHoras =  Double . parseDouble ( JOptionPane . showInputDialog ( " Horas Trabalhadas: " ));
		double valorHora =  Double . parseDouble ( JOptionPane . showInputDialog ( " Valor da Hora Trabalhada: " ));
		double totalSalario = totalHoras * valorHora;
		
		DecimalFormat formato =  novo  DecimalFormat ( " ####, ## " );
		JOptionPane . showMessageDialog ( null , " O funcion�rio:   "  + funcionario +  " Receber� "  +   formato . formato (totalSalario) +  " De sal�rio " );
		
	

		
	}

		
	}



