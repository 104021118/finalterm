package finalterm;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class qwsd0331_06 extends JFrame implements ActionListener
{
static JButton buttons[]=new JButton[10];//建立25個JButton
public static void main(String args[])	
{
	qwsd0331_06 myfrm=new qwsd0331_06();
String numbers[]  =new String[10];
FlowLayout flow=new FlowLayout();
GridLayout grid12= new GridLayout(1,2);
GridLayout grid33= new GridLayout(5,2);
myfrm.setLayout(grid12);
myfrm.setSize(700,700);
JPanel p1 = new JPanel(grid33); //實作  panel 1
for (int i=0;i<10;i++)
{
numbers[i]=String.valueOf(i);
}
for (int i = 0; i < numbers.length; i++)
{
buttons[i] = new JButton(numbers[i]); // create buttons
p1.add(buttons[i], grid33); // 在 panel 1內加入按鈕陣列
}
myfrm.add(p1); // 在視窗myfrm 內加入 panel 1
JPanel p2 = new JPanel(flow); //實作  panel 2
JButton btn1=new JButton("Random"); // 建立按鈕物件 btn1
btn1.addActionListener(myfrm);
//p2.add(tbx1); // 在 panel 2內加入文字方塊
p2.add(btn1); // 在 panel 2內加入按鈕
myfrm.add(p2); // 在視窗myfrm 內加入 panel 2

myfrm.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String stringValue;
int i,ran;
String numbers[]  = new String[10];
String j;
for (i=0;i<10;i++)
{
numbers[i]=String.valueOf(i);
}
//上面迴圈是為了在numbers[ ] 裡面放進0~9的數字
for (i=0; i<=9;i++)
{
ran=(int)(Math.random()*(10-i));   // 產生亂數
buttons[i].setLabel(numbers[ran]);  // 根據亂數，把numbers[ ] 裡面的數字 讓buttons[ ] 標題改變
//以下開始做對調
j=numbers[ran];
numbers[ran]=numbers[10-i-1];
numbers[10-i-1]=j;
}
}
}