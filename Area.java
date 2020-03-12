import javax.swing.JOptionPane;
public class Area
{
   public static void main (String[]args)
   {
   
   //Leitura de dados
   String sBase = JOptionPane.showInputDialog("Digite a medida da base:");
   String sAltura = JOptionPane.showInputDialog("Agora digite a medida da altura:");
   
   //Convertendo para reais
   double base = Double.parseDouble(sBase);
   double altura = Double.parseDouble(sAltura);
   
   //Calculando a área
   double area = base * altura;
   
   //Apresentando o resultado
   JOptionPane.showMessageDialog(null,"A área do retângulo é:" + area);
   
   }
}
   