package finalterm;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class qwd extends JFrame implements ActionListener
{
static JButton buttons[]=new JButton[26];//�إ�25��JButton
public static void main(String args[])	
{
	qwd my=new qwd();
String numbers[]  =new String[26];
FlowLayout flow=new FlowLayout();
GridLayout grid12= new GridLayout(1,2);
GridLayout grid33= new GridLayout(13,2);
my.setLayout(grid12);
my.setSize(700,700);
JPanel p1 = new JPanel(grid33); //��@  panel 1
for (int i=0;i<=25;i++)
{
numbers[i]=String.valueOf(i);
}
for (int i = 0; i < numbers.length; i++)
{
buttons[i] = new JButton(numbers[i]); // create buttons
p1.add(buttons[i], grid33); // �b panel 1���[�J���s�}�C
}
my.add(p1); // �b����myfrm ���[�J panel 1
JPanel p2 = new JPanel(flow); //��@  panel 2
JButton btn1=new JButton("Random"); // �إ߫��s���� btn1
btn1.addActionListener(my);
//p2.add(tbx1); // �b panel 2���[�J��r���
p2.add(btn1); // �b panel 2���[�J���s
my.add(p2); // �b����myfrm ���[�J panel 2

my.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String stringValue;
int i,ran;
String numbers[]  = new String[91];
String j;
for (i=65;i<91;i++)
{
numbers[i]=String.valueOf(i);
}
//�W���j��O���F�bnumbers[ ] �̭���i0~24���Ʀr
for (i=0; i<=25;i++)
{
ran=(int)(Math.random()*(91-i));   // ���Ͷü�
buttons[i].setLabel(numbers[ran]);  // �ھڶüơA��numbers[ ] �̭����Ʀr ��buttons[ ] ���D����
//�H�U�}�l�����
j=numbers[ran];
numbers[ran]=numbers[91-i-1];
numbers[91-i-1]=j;
}
}
}