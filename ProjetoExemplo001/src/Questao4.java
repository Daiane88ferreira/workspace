import  java.text.DecimalFormat ;

import  javax.swing.JOptionPane ;

public  class  Questao4 {
	

	public  static  void  main ( String [] args ) {
	
		
		JOptionPane . showMessageDialog ( null , " Total Gasto " , " Pedido 01 " , JOptionPane . QUESTION_MESSAGE );
		Cliente de string =  JOptionPane . showInputDialog ( " Nome do Cliente " );
		double produto1 =  Double . parseDouble ( JOptionPane . showInputDialog ( " Valor: " ));
		double produto2 =  Double . parseDouble ( JOptionPane . showInputDialog ( " Valor: " ));
		duplo totalPedido = produto1 + produto2;
		garcon duplo = totalPedido *  0,1 ;
		DecimalFormat df =  new  DecimalFormat ( " ###. ## " );
		JOptionPane . showMessageDialog ( null , " Total pedido "  + totalPedido +  " Garçon: "  + formato df . (garcon))
		
		
	}
}
