import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WampusGUI extends JFrame {
	public static final String USER_COMMAND = "user command";
	private String userCommand;
	private JTextArea displayTextArea = new JTextArea(10, 30);
	private JTextField commandText = new JTextField(10);

	public WampusGUI() {
		initComponents();
	}

	private void setUserCommand(String userCommand) {
		String oldValue = this.userCommand;
		String newValue = userCommand;
		this.userCommand = userCommand;
		firePropertyChange(USER_COMMAND, oldValue, newValue);
	}

	private void initComponents() {
		displayTextArea.setEditable(false);
		displayTextArea.setFocusable(false);
		JButton enterButton = new JButton("Enter Command");
		enterButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				enterButtonActionPerformed(evt);
			}
		});
		JPanel commandPanel = new JPanel();
		commandPanel.add(commandText);
		commandPanel.add(Box.createHorizontalStrut(15));
		commandPanel.add(enterButton);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(new JScrollPane(displayTextArea));
		mainPanel.add(commandPanel, BorderLayout.SOUTH);
		add(mainPanel);
	}

	public void setTextArea(String text) {
		displayTextArea.append(text);
	}

	private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {
		setUserCommand(commandText.getText());
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				WampusGUI w = new WampusGUI();
				w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				w.pack();
				w.setLocationRelativeTo(null);
				w.setVisible(true);
				Game g = new Game(w);
				g.play();
			}
		});
	}
}

class Game {
	private WampusGUI gui;

	public Game(WampusGUI w) { gui = w; gui.addPropertyChangeListener(new PropertyChangeListener() { @Override public void propertyChange(PropertyChangeEvent pcEvt) { // is the property being changed the one we're interested in? if (WampusGUI.USER_COMMAND.equals(pcEvt.getPropertyName())) { // get user command: String userCommand = pcEvt.getNewValue().toString(); // then we can do with it what we want play(userCommand); } } }); } public void play() { gui.setTextArea("Welcome!\n"); gui.setTextArea("Please enjoy the game!\n"); } public void play(String userCommand) { // here we can do what we want with the String. For instance we can display it in the gui: gui.setTextArea("User entered: " + userCommand + "\n"); } } 
public class kjhgffd {

}
