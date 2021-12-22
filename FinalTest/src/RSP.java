import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RSP extends JFrame implements ActionListener{

	static final int r = 0;
	static final int s = 1;
	static final int p = 2;
	
	private JPanel panel;
	private JButton rock, sissor, paper;
	private JTextField output, information;
	
	public RSP() {
		this.setSize(400, 300);
		setTitle("���� ���� ��");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));
		
		information = new JTextField("�Ʒ���ư�� �ϳ� Ŭ��!");
		output = new JTextField(20);
		
		rock = new JButton("rock");
		sissor = new JButton("sissor");
		paper = new JButton("paper");
		rock.addActionListener(this);
		sissor.addActionListener(this);
		paper.addActionListener(this);
		
		panel.add(rock);
		panel.add(sissor);
		panel.add(paper);
		
		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		setVisible(true);
		
	
	}
	public static void main(String[] args) {
		RSP gui = new RSP();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		int computer = random.nextInt(3);
		if(e.getSource() == rock) {
			if(computer == s)
				output.setText("����� �¸�!!");
			else if(computer == r)
				output.setText("���");
			else
				output.setText("��ǻ�� �¸�");
		}
		else if(e.getSource() == sissor) {
			if(computer == s)
				output.setText("���");
			else if(computer == r)
				output.setText("��ǻ�� �¸�");
			else
				output.setText("����� �¸�!!");
		}
		else if(e.getSource() == paper) {
			if(computer == s)
				output.setText("����� �¸�!!");
			else if(computer == r)
				output.setText("��ǻ�� �¸�");
			else
				output.setText("���");
		}
		
	}
	
}
