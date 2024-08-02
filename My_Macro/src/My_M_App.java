import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.CardLayout;

public class My_M_App extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel mainPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					My_M_App frame = new My_M_App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public My_M_App() {
		setResizable(false);
		setBackground(new Color(76, 76, 76));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\여러가지\\짤\\이모지\\B-Dog1.png"));
		setTitle("My_Mac");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		mainPane = new JPanel();
		mainPane.setBackground(new Color(76, 76, 76));
		mainPane.setBorder(null);
		setOpacity(1f);
		setAlwaysOnTop(true);
		setSize(200, 500);
		
		setContentPane(mainPane);
		mainPane.setLayout(new GridLayout(5, 1, 0, 0));
		
		
		
		JPanel plST = new JPanel();
		plST.setBorder(null);
		plST.setBackground(mainPane.getBackground());
		mainPane.add(plST);
		plST.setLayout(new GridLayout(3, 1, 0, 0));
		
		
		
		JLabel lbStartState = new JLabel("현재 시작 버튼");
		lbStartState.setForeground(Color.WHITE);
		lbStartState.setHorizontalAlignment(SwingConstants.CENTER);
		lbStartState.setFont(new Font("G마켓 산스 TTF Light", Font.PLAIN, 12));
		
		JLabel lbStartButton = new JLabel("F2");
		lbStartButton.setForeground(Color.WHITE);
		lbStartButton.setHorizontalAlignment(SwingConstants.CENTER);
		lbStartButton.setFont(new Font("G마켓 산스 TTF Light", Font.PLAIN, 12));
		
		KeyButton btnRecSt = new KeyButton(lbStartState, lbStartButton, "시작버튼 변경", "F2", KeyEvent.VK_F2);
		btnRecSt.setForeground(Color.LIGHT_GRAY);
		btnRecSt.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 12));
		btnRecSt.setBackground(new Color(50, 50, 50));
		plST.add(btnRecSt);
		
		plST.add(lbStartState);

		plST.add(lbStartButton);
		
		
		JPanel plEd = new JPanel();
		plEd.setBorder(null);
		plEd.setBackground(new Color(76, 76, 76));
		mainPane.add(plEd);
		plEd.setLayout(new GridLayout(3, 1, 0, 0));
		
		
		JLabel lbEndState = new JLabel("현재 종료 버튼");
		lbEndState.setForeground(Color.WHITE);
		lbEndState.setHorizontalAlignment(SwingConstants.CENTER);
		lbEndState.setFont(new Font("G마켓 산스 TTF Light", Font.PLAIN, 12));
		
		JLabel lbEndButton = new JLabel("F3");
		lbEndButton.setForeground(Color.WHITE);
		lbEndButton.setHorizontalAlignment(SwingConstants.CENTER);
		lbEndButton.setFont(new Font("G마켓 산스 TTF Light", Font.PLAIN, 12));
		
		KeyButton btnRecEnd = new KeyButton(lbEndState, lbEndButton ,"종료버튼 변경", "F3", KeyEvent.VK_F3);
		btnRecEnd.setForeground(Color.LIGHT_GRAY);
		btnRecEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRecEnd.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 12));
		btnRecEnd.setBackground(new Color(50, 50, 50));
		plEd.add(btnRecEnd);
		
		plEd.add(lbEndState);
		
		plEd.add(lbEndButton);
		
		
		JPanel plChoseType = new JPanel();
		plChoseType.setBackground(mainPane.getBackground());
		mainPane.add(plChoseType);
		plChoseType.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lbType = new JLabel("종류");
		lbType.setForeground(Color.WHITE);
		plChoseType.add(lbType);
		
		ButtonGroup btnGroup = new ButtonGroup();
		JRadioButton rdbtnType1= new JRadioButton("type1");
		rdbtnType1.setForeground(Color.WHITE);
		rdbtnType1.setBackground(new Color(76, 76, 76));
		rdbtnType1.setSelected(true);
		plChoseType.add(rdbtnType1);
		btnGroup.add(rdbtnType1);
		
		JRadioButton rdbtnType2 = new JRadioButton("연속");
		rdbtnType2.setForeground(Color.WHITE);
		rdbtnType2.setBackground(new Color(76, 76, 76));
		plChoseType.add(rdbtnType2);
		btnGroup.add(rdbtnType2);
		
		
		
		
		JPanel plType = new JPanel();
		plType.setBackground(new Color(76, 76, 76));
		plType.setLayout(new CardLayout(3, 1));
		
		
		
		mainPane.add(plType);
		
		JPanel plType1 = new JPanel();
		plType1.setBackground(new Color(76, 76, 76));
		plType.add(plType1, "name_264403927846400");
		plType1.setLayout(new GridLayout(3, 1, 0, 0));
		
		
		JLabel lbPressState = new JLabel("현재 사용 버튼");
		lbPressState.setHorizontalAlignment(SwingConstants.CENTER);
		lbPressState.setForeground(Color.WHITE);
		lbPressState.setFont(new Font("G마켓 산스 TTF Light", Font.PLAIN, 12));
		
		
		JLabel lbPressbutton = new JLabel("A");
		lbPressbutton.setHorizontalAlignment(SwingConstants.CENTER);
		lbPressbutton.setForeground(Color.WHITE);
		lbPressbutton.setFont(new Font("G마켓 산스 TTF Light", Font.PLAIN, 12));
		
		KeyButton btnPressbutton = new KeyButton(lbPressState, lbPressbutton, "사용버튼 변경", "A", KeyEvent.VK_A);
		btnPressbutton.setText("사용버튼 변경");
		btnPressbutton.setForeground(Color.LIGHT_GRAY);
		btnPressbutton.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 12));
		btnPressbutton.setBackground(new Color(50, 50, 50));
		plType1.add(btnPressbutton);
		plType1.add(lbPressState);
		plType1.add(lbPressbutton);
		
		
		JPanel plType2 = new JPanel();
		plType2.setBackground(new Color(76, 76, 76));
		plType.add(plType2, "name_264306532027600");
		
		
		
		JLabel lblNewLabel = new JLabel("1");
		plType2.add(lblNewLabel);
		
		rdbtnType1.addActionListener(e -> {
			CardLayout cardLayout = (CardLayout)plType.getLayout();
			cardLayout.show(plType, "name_264403927846400");//type1
		});
		rdbtnType2.addActionListener(e -> {
			CardLayout cardLayout = (CardLayout)plType.getLayout();
			cardLayout.show(plType, "name_264306532027600"); //type2
		});
		
		textField = new JTextField();
		plType2.add(textField);
		textField.setColumns(10);
		
		KeyCheckPane plStatement = new KeyCheckPane();
		plStatement.setBackground(new Color(76, 76, 76));
		mainPane.add(plStatement);
		plStatement.setLayout(null);
		
		JLabel lbStatement = new JLabel("[대기중]");
		lbStatement.setBounds(63, 37, 57, 15);
		lbStatement.setForeground(Color.WHITE);
		plStatement.add(lbStatement);
		
		
	}
	
}
