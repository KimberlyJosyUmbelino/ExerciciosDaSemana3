import javax.swing.JOptionPane;
public class InteiroAoQuadrado
{
   public static void main(String[]args)
   {
   //lendo dados
   String sBase = JOptionPane.showInputDialog("Digite o número que você queira elevar ao quadrado: ");
   //convertendo para inteiro
   int base = Integer.parseInt(sBase);
   //calculo
   double resultado= Math.pow(base, 2);
   //apresentando resultado
   JOptionPane.showMessageDialog(null,"O resultado é:" + resultado );
   
   }
   
}