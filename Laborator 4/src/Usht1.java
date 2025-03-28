import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.GridBagConstraints;

public class Usht1 {
  public static void main(String[] args) throws Exception {
    JFrame frame = new JFrame("Ushtrimi 1");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 600);

    JPanel panel = new JPanel(new GridBagLayout());

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10);

    JLabel label = new JLabel("Vendosni emrin");
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 1;
    gbc.gridheight = 1;
    gbc.fill = GridBagConstraints.EAST;
    panel.add(label, gbc);

    JTextField nameField = new JTextField(25);
    gbc.gridx = 1;
    gbc.gridy = 0;
    gbc.gridwidth = 1;
    gbc.gridheight = 1;
    gbc.weightx = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    panel.add(nameField, gbc);

    JButton addButton = new JButton("Shto");
    gbc.gridx = 2;
    gbc.gridy = 0;
    gbc.gridwidth = 1;
    gbc.gridheight = 1;
    gbc.weightx = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    panel.add(addButton, gbc);

    DefaultListModel<String> listModel = new DefaultListModel<>();
    JList<String> namesList = new JList<String>(listModel);
    JScrollPane scrollPane = new JScrollPane(namesList);

    scrollPane.setPreferredSize(new Dimension(0, 150));
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.gridwidth = 3;
    gbc.gridheight = 1;
    gbc.weightx = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    panel.add(scrollPane, gbc);

    JButton clearButton = new JButton("Pastro");
    gbc.gridx = 2;
    gbc.gridy = 2;
    gbc.gridwidth = 1;
    gbc.gridheight = 1;
    gbc.weightx = 1.0;
    gbc.fill = GridBagConstraints.BOTH;

    addButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        if (!name.isEmpty()) {
          listModel.addElement(name);
          nameField.setText("");
        }
      }

    });

    clearButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        listModel.clear();
      }

    });

    panel.add(clearButton, gbc);

    frame.add(panel);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
