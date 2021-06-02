
import  javax.swing. * ;
public  class  Questao2 {

	public  static  void  main ( String [] args ) {
		
		
		
		JOptionPane . showMessageDialog ( null , " Vamos somar " , " Soma " , JOptionPane . QUESTION_MESSAGE );
		double soma1 =  Double . parseDouble ( JOptionPane . showInputDialog ( " Insira um número " ));
		duplo soma2 =  duplo . parseDouble ( JOptionPane . showInputDialog ( " Insira outro número " ));
		resultado duplo = soma1 + soma2;
		JOptionPane . showMessageDialog ( null , " O Resultado entre "  + soma1 + " e "  + soma2 +  " é = "  + resultado);
			
	}

}