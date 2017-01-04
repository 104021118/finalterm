package finalterm;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class qwd extends JFrame implements ActionListener
{
static JButton buttons[]=new JButton[26];//建立25個JButton
public static void main(String args[])	
{
	qwd my=new qwd();
String numbers[]  =new String[26];
FlowLayout flow=new FlowLayout();
GridLayout grid12= new GridLayout(1,2);
GridLayout grid33= new GridLayout(13,2);
my.setLayout(grid12);
my.setSize(700,700);
JPanel p1 = new JPanel(grid33); //實作  panel 1
for (int i=0;i<=25;i++)
{
numbers[i]=String.valueOf(i);
}
for (int i = 0; i < numbers.length; i++)
{
buttons[i] = new JButton(numbers[i]); // create buttons
p1.add(buttons[i], grid33); // 在 panel 1內加入按鈕陣列
}
my.add(p1); // 在視窗myfrm 內加入 panel 1
JPanel p2 = new JPanel(flow); //實作  panel 2
JButton btn1=new JButton("Random"); // 建立按鈕物件 btn1
btn1.addActionListener(my);
//p2.add(tbx1); // 在 panel 2內加入文字方塊
p2.add(btn1); // 在 panel 2內加入按鈕
my.add(p2); // 在視窗myfrm 內加入 panel 2

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
//上面迴圈是為了在numbers[ ] 裡面放進0~24的數字
for (i=0; i<=25;i++)
{
ran=(int)(Math.random()*(91-i));   // 產生亂數
buttons[i].setLabel(numbers[ran]);  // 根據亂數，把numbers[ ] 裡面的數字 讓buttons[ ] 標題改變
//以下開始做對調
j=numbers[ran];
numbers[ran]=numbers[91-i-1];
numbers[91-i-1]=j;
}
}
}