import javax.swing.JOptionPane;
public class LeiaASomaDoComprimentoDas3Palavras
{
   public static void main(String[]args)
   {
   
      //entrada de dados
		String s1 = JOptionPane.showInputDialog(null, "primeira string");
		String s2 = JOptionPane.showInputDialog(null, "segunda string");
		String s3 = JOptionPane.showInputDialog(null, "terceira string");

		//soma do tamanho da string
		int soma = s1.length() + s2.length() + s3.length();

		//saida que exibe a soma
		JOptionPane.showMessageDialog(null, String.format("soma total é:%d", + soma));
      
   }
}