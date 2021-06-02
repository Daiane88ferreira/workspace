import  javax.swing.JOptionPane ;

public  class  Questao3 {

	public  static  void  main ( String [] args ) {
		
		
		
JOptionPane . showMessageDialog ( null , " Qual a média do Aluno " , " Notas " , JOptionPane . QUESTION_MESSAGE );
String aluno =  JOptionPane . showInputDialog ( " Nome do Aluno " );
double soma1 =  Double . parseDouble ( JOptionPane . showInputDialog ( " Nota prova 1 " ));
	duplo soma2 =  duplo . parseDouble ( JOptionPane . showInputDialog ( " Nota prova 2 " ));
		resultado duplo = (soma1 + soma2) /  2 ;
		JOptionPane . showMessageDialog ( null , " O Aluno "  + aluno +  " teve média: "  + resultado);
			
	}

}