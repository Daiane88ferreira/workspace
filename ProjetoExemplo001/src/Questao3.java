
import javax.swing.JOptionPane;

	public class Questao3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero."));
			int n1 = num -1; 
			int n2 = +1;
			
			
			JOptionPane.showMessageDialog(null, "Os vizinhos s�o "+n1+" e "+n2);
			
			

		}

	}