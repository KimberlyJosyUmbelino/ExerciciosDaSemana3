import javax.swing.JOptionPane;
public class InteiroAoQuadrado
{
   public static void main(String[]args)
   {
   //lendo dados
   String sBase = JOptionPane.showInputDialog("Digite o n�mero que voc� queira elevar ao quadrado: ");
   //convertendo para inteiro
   int base = Integer.parseInt(sBase);
   //calculo
   double resultado= Math.pow(base, 2);
   //apresentando resultado
   JOptionPane.showMessageDialog(null,"O resultado �:" + resultado );
   
   }
   
}