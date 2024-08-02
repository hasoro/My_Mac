import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JLabel;

public class KeyButton extends JButton {
	boolean ststate = false;
	boolean stChange = false;
	JLabel _lbState;
	JLabel _stlabel;
	String str = "";
	int keyCode = 0;
	String _lbStateTmp;
	public KeyButton(JLabel lbState, JLabel stlabel,String btText,String _str, int defaultKey) {
		_lbState = lbState;
		_stlabel = stlabel;
		_lbStateTmp = _lbState.getText();
		this.str = _str;
		this.keyCode = defaultKey;
		this.setUI(getUI());
		this.setText(btText);
		setBackground(new Color(56,56,56));
		setBorderPainted(false);
		setForeground(new Color(200,200,200));
		this.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void keyPressed(KeyEvent e) {
				if(ststate == true) {
					String tmp = KeyEvent.getKeyText(e.getKeyCode());
					keyCode = e.getKeyCode();
					System.out.println(keyCode);
					str = tmp;
					_stlabel.setText(""+str);
				}
			}
		});
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ststate == false) {
					setText("입력 멈추기");
					_lbState.setText("[입력중]");
					//_stlabel.setText("");
					ststate = true;
				}
				else {
					ststate = false;
					setText(btText);
					String tmp = str;
					_lbState.setText(_lbStateTmp);
					_stlabel.setText(tmp);
				}
			}
		});
	}
}
