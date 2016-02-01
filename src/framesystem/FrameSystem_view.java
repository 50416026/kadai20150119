package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;

public class FrameSystem_view extends Frame implements ActionListener,WindowListener{
	private TextField text1 = new TextField("", 10);
	private TextField text2 = new TextField("", 10);
	private Button button1 = new Button("‘«‚µŽZ");
	private Button button2 = new Button("ˆø‚«ŽZ");
	private TextField text3 = new TextField("", 10);
	private TextField text4 = new TextField("", 10);
	private TextField text5 = new TextField("", 10);
	private TextField text6 = new TextField("", 10);
	public FrameSystem_view(){
	setTitle("FrameSystem");	
    addWindowListener(this);
    setLayout(new FlowLayout(FlowLayout.CENTER));
    add(text1);
    button1.addActionListener(this);
    
    add(new Label("+"));
    add(text2);
    add(button1);
    add(text3);
    add(new Label("“š‚¦"));
    add(text5);
    button2.addActionListener(this);
    add(new Label("-"));
    add(text6);
    add(button2);
    add(text4);
    add(new Label("“š‚¦"));
    }
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
		//text3.setText(String.valueOf(val1 + val2));
		Calculation_lib clib = new Calculation_lib(val1, val2);
		text3.setText(String.valueOf(clib.getPlus()));
		
		int val3 = Integer.parseInt(text5.getText());
		int val4 = Integer.parseInt(text6.getText());
		//text4.setText(String.valueOf(val3 - val4));
		Calculation_lib dlib = new Calculation_lib(val3, val4);
		text4.setText(String.valueOf(dlib.getMinus()));
		
		
		




	}

}
