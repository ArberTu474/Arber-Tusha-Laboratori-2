import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Usht3 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Ushtrimi 3");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);

    JPanel panel = new JPanel(new BorderLayout());

    JPanel outputPanel = new JPanel();

    JLabel outputLabel = new JLabel("Numri");
    JTextField outputField = new JTextField(10);
    outputField.setEditable(false);

    JPanel dialPanel = new JPanel(new GridLayout(4, 3));

    String buttons[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#" };

    for (String button : buttons) {
      JButton newButton = new JButton(button);
      newButton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          outputField.setText(outputField.getText() + newButton.getText());
        }

      });

      dialPanel.add(newButton);
    }

    outputPanel.add(outputLabel);
    outputPanel.add(outputField);

    panel.add(dialPanel, BorderLayout.CENTER);
    panel.add(outputPanel, BorderLayout.SOUTH);

    frame.add(panel);
    // frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
