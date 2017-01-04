package finalterm;
import java.util.*;
import javax.swing.JTextArea;
//import hw.MainFrames.Act;
import java.awt.event.*;
import java.awt.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame mf=new MainFrame();
		mf.setVisible(true);
	}
}
		class MainFrame extends Frame{
			private static final Object[] R = null;
			int a = 0;
		private Label lab=new Label("0");
		private Button b0=new Button("Random");
		private Button b1=new Button("A");
		private Button b2=new Button("B");
		private Button b3=new Button("C");
		private Button b4=new Button("D");
		private Button b5=new Button("E");
		private Button b6=new Button("F");
		private Button b7=new Button("G");
		private Button b8=new Button("H");
		private Button b9=new Button("I");
		private Button b10=new Button("J");
		private Button b11=new Button("K");
		private Button b12=new Button("L");
		private Button b13=new Button("M");
		private Button b14=new Button("N");
		private Button b15=new Button("O");
		private Button b16=new Button("P");
		private Button b17=new Button("Q");
		private Button b18=new Button("R");
		private Button b19=new Button("S");
		private Button b20=new Button("T");
		private Button b21=new Button("U");
		private Button b22=new Button("V");
		private Button b23=new Button("W");
		private Button b24=new Button("X");
		private Button b25=new Button("Y");
		private Button b26=new Button("Z");
		private Button p1=new Button("+");
		private Button p2=new Button("-");
		private Button p3=new Button("*");
		private Button p4=new Button("/");
		private Button p5=new Button(",");
		private Button p6=new Button("~");
		private Button p7=new Button("!");
		private Button p8=new Button("@");
		private Button p9=new Button("#");
		private Button p10=new Button("%");
		private Button p11=new Button("(");
		private Button p12=new Button(")");
		private Button p13=new Button("=");
		private Button p14=new Button("?");
		private Button p15=new Button("}");
		private Button p16=new Button("{");
		private Button a1=new Button("0");
		private Button a2=new Button("9");
		private Button a3=new Button("8");
		private Button a4=new Button("7");
		private Button a5=new Button("6");
		private Button a6=new Button("5");
		private Button a7=new Button("4");
		private Button a8=new Button("3");
		private Button a9=new Button("2");
		private Button a10=new Button("1"); 
		private Button Q1=new Button("Clear");
        private TextArea ta=new TextArea();	
public MainFrame(){
	 initComp();
}
private void initComp(){
    this.setLayout(null);
	this.setBackground(Color.black);
	this.setBounds(150,150,1200,800);
	this.setFont(new Font("º–∑¢≈È", Font.BOLD, 32));
	this.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we){
			System.exit(0);
}
	});
 b0.setBounds(100,90,300,100);
 b1.setBounds(50,250,100,70);
 b2.setBounds(50,330,100,70);
 b3.setBounds(50,410,100,70);
 b4.setBounds(50,490,100,70);
 b5.setBounds(50,570,100,70);
 b6.setBounds(50,650,100,70);
 b7.setBounds(160,250,100,70);
 b8.setBounds(160,330,100,70);
 b9.setBounds(160,410,100,70);
 b10.setBounds(160,490,100,70);
 b11.setBounds(160,570,100,70);
 b12.setBounds(160,650,100,70);
 b13.setBounds(270,250,100,70);
 b14.setBounds(270,330,100,70);
 b15.setBounds(270,410,100,70);
 b16.setBounds(270,490,100,70);
 b17.setBounds(270,570,100,70);
 b18.setBounds(270,650,100,70);
 b19.setBounds(380,250,100,70);
 b20.setBounds(380,330,100,70);
 b21.setBounds(380,410,100,70);
 b22.setBounds(380,490,100,70);
 b23.setBounds(380,570,100,70);
 b24.setBounds(380,650,100,70);
 b25.setBounds(490,250,100,70);
 b26.setBounds(490,330,100,70);
 p1.setBounds(490,410,100,70);
 p2.setBounds(490,490,100,70);
 p3.setBounds(490,570,100,70);
 p4.setBounds(490,650,100,70);
 p5.setBounds(600,250,100,70);
 p6.setBounds(600,330,100,70);
 p7.setBounds(600,410,100,70);
 p8.setBounds(600,490,100,70);
 p9.setBounds(600,570,100,70);
 p10.setBounds(600,650,100,70);
 p11.setBounds(710,250,100,70);
 p12.setBounds(710,330,100,70);
 p13.setBounds(710,410,100,70);
 p14.setBounds(710,490,100,70);
 p15.setBounds(710,570,100,70);
 p16.setBounds(710,650,100,70);
a1.setBounds(910,300,100,70);
 a2.setBounds(910,380,100,70);
 a3.setBounds(910,460,100,70);
 a4.setBounds(910,540,100,70);
 a5.setBounds(910,620,100,70);
 a6.setBounds(1050,300,100,70);
 a7.setBounds(1050,380,100,70);
 a8.setBounds(1050,460,100,70);
 a9.setBounds(1050,540,100,70);
 a10.setBounds(1050,620,100,70);
 Q1.setBounds(910,220,240,70);
 this.add(b0);
 this.add(b1);
 this.add(b2);
 this.add(b3);
 this.add(b4);
 this.add(b5);
 this.add(b6);
 this.add(b7);
 this.add(b8);
 this.add(b9);
 this.add(b10);
 this.add(b11);
 this.add(b12);
 this.add(b13);
 this.add(b14);
 this.add(b15);
 this.add(b16);
 this.add(b17);
 this.add(b18);
 this.add(b19);
 this.add(b20);
 this.add(b21);
 this.add(b22);
 this.add(b23);
 this.add(b24);
 this.add(b25);
 this.add(b26);
 this.add(p1);
 this.add(p2);
 this.add(p3);
 this.add(p4);
 this.add(p5);
 this.add(p6);
 this.add(p7);
 this.add(p8);
 this.add(p9);
 this.add(p10);
 this.add(p11);
 this.add(p12);
 this.add(p13);
 this.add(p14);
 this.add(p15);
 this.add(p16);
 this.add(a1);
 this.add(a2);
 this.add(a3);
 this.add(a4);
 this.add(a5);
 this.add(a6);
 this.add(a7);
 this.add(a8);
 this.add(a9);
 this.add(a10); 
 this.add(ta);
 this.add(Q1);
 ta.setBounds(440,90,700,100);
 
 b1.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
      ta.append("A");
    }
});
 b2.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("B"); 
}
 });
 b3.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("C");
}
});
 b4.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("D");
}
});
 b5.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("E");
}
});
 b6.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("F");
    	 
}
});
 b7.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("G");
}
});
 b8.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("H");
}
});
 b9.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("I");
}
});
 b10.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("J");
}
});
 b11.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("K");
}
});
 b12.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("L");
}
});
 b13.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("M");
}
});
 b14.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("N");
}
});
 b15.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("O");
}
});
 b16.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("P");
}
});
 b17.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("Q");
}
});
 b18.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("R");
    	 
}
});
 b19.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("S");
    	 
}
});
 b20.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("T");
}
});
 b21.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("U");
}
});
 b22.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("V");
}
});
 b23.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("W");
}
});
 b24.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("X");
}
});
 b25.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("Y");
}
});
 b26.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("Z");
}
});
 p1.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("+");
}
});
 p2.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("-");
     }
     });
 p3.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("*");
     }
     });
 p4.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("/");
     }
     });
 p5.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append(",");
     }
     });
 p6.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("~");
     }
     });
 p7.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("!");
     }
     });
 p8.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("@");
     }
     });
 p9.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("#");
     }
     });
 p10.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("%");
     }
     });
 p11.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("(");
     }
     });
 p12.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append(")");
     }
     });
 p13.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("=");
     }
     });
 p14.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("?");
     }
     });
 p15.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("}");
     }
     });
 p16.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("{");
     }
    });
 a1.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("0");
     }
     });
 a2.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("9");
     }
     });
 a3.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("8");
     }
     });
 a4.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("7");
     }
     });
 a5.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("6");
     }
     });
 a6.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("5");
     }
     });
 a7.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("4");
     }
     });
 a8.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("3");
     }
     });
 a9.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("2");
     }
     });
 a10.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.append("1");
     }
     });
 Q1.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
    	 ta.setText("");
     }
     });
}
}
