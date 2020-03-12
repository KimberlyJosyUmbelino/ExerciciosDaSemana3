import javax.swing.JOptionPane;
public class DiasDeVida
{
   public static void main(String[]args)
   {
   
   //Leitura de dados   
   String sIdade = JOptionPane.showInputDialog("Digite quantos anos você tem:");
   
   //Vamos fazer a conversão para inteiro
   int idade = Integer.parseInt(sIdade);
   
   //Calculando a idade em dias
   int dias = idade * 365;
   
   //Apresentando o resultado
   JOptionPane.showMessageDialog(null," O número de dias que você viveu é:" +dias);
   
   }
}   