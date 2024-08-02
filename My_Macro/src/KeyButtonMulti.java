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

public class KeyButtonMulti extends JButton {
	boolean ststate = false;
	boolean stChange = false; 
	Set<String> stKeySet = new HashSet<String>();
	JLabel _lbState;
	JLabel _stlabel;
	String str;
	String btText = "";
	public KeyButtonMulti(JLabel lbState, JLabel stlabel,String btText) {
		_lbState = lbState;
		_stlabel = stlabel;
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
				// TODO Auto-generated method stub
				String tmp = KeyEvent.getKeyText(e.getKeyCode());
				if(ststate == true) {
					//System.out.println(stKeySet);
					if(stKeySet.add(tmp)) {
						if(stKeySet.size() == 1) {
							str = tmp;
						}else {
							str = str+"+"+tmp; 
						}
					}
					_stlabel.setText(""+str);
				}
			}
		});
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ststate == false) {
					stKeySet.clear();
					setText("입력 멈추기");
					_lbState.setText("[입력중]");
					_stlabel.setText("");
					ststate = true;
				}
				else {
					ststate = false;
					setText(btText);
					String tmp = stKeySet.toString();
					String ttmp = tmp.replaceAll("\\[","").replaceAll("\\]","").replaceAll(", ","+");
					_lbState.setText("현재 종료 버튼");
					_stlabel.setText(ttmp);
				}
			}
		});
	}
}
