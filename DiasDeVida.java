import javax.swing.JOptionPane;
public class DiasDeVida
{
   public static void main(String[]args)
   {
   
   //Leitura de dados   
   String sIdade = JOptionPane.showInputDialog("Digite quantos anos voc� tem:");
   
   //Vamos fazer a convers�o para inteiro
   int idade = Integer.parseInt(sIdade);
   
   //Calculando a idade em dias
   int dias = idade * 365;
   
   //Apresentando o resultado
   JOptionPane.showMessageDialog(null," O n�mero de dias que voc� viveu �:" +dias);
   
   }
}   