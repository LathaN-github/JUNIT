import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.*;

public class Assignmentpg extends Applet {
	Button b,b1;
	TextField t;
	public void init()
	{
		add(b = new Button("Click"));
		add(t = new TextField(15));
		add(b1 = new Button("Clear"));
		b.addActionListener(new ActionListener()
		{
			public void ActionPerformed(ActionEvent e)
			{
				t.setText("Hello");
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		b1.addActionListener(new ActionListener()
		{
			public void ActionPerformed1(ActionEvent e)
			{
				t.setText("Hello");
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
}	
		
		

