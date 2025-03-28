import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.GridBagConstraints;

public class Usht2 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Makine Llogaritese");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 600);

    JPanel panel = new JPanel(new GridBagLayout());

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10);

    JTextField num1Field = new JTextField(10);
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 1;
    gbc.gridheight = 1;
    gbc.weightx = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    panel.add(num1Field, gbc);

    JTextField num2Field = new JTextField(10);
    gbc.gridx = 1;
    gbc.gridy = 0;
    gbc.gridwidth = 1;
    gbc.gridheight = 1;
    gbc.weightx = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    panel.add(num2Field, gbc);

    JButton additionButton = new JButton("+");
    gbc.gridx = 2;
    gbc.gridy = 0;
    gbc.gridwidth = 1;
    gbc.gridheight = 1;
    gbc.weightx = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    panel.add(additionButton, gbc);

    JButton subtractionButton = new JButton("-");
    gbc.gridx = 3;
    gbc.gridy = 0;
    gbc.gridwidth = 1;
    gbc.gridheight = 1;
    gbc.weightx = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    panel.add(subtractionButton, gbc);

    JButton multiplicationButton = new JButton("*");
    gbc.gridx = 4;
    gbc.gridy = 0;
    gbc.gridwidth = 1;
    gbc.gridheight = 1;
    gbc.weightx = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    panel.add(multiplicationButton, gbc);

    JButton divisionButton = new JButton("/");
    gbc.gridx = 5;
    gbc.gridy = 0;
    gbc.gridwidth = 1;
    gbc.gridheight = 1;
    gbc.weightx = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    panel.add(divisionButton, gbc);

    DefaultListModel<String> listModel = new DefaultListModel<>();
    JList<String> namesList = new JList<String>(listModel);
    JScrollPane scrollPane = new JScrollPane(namesList);

    scrollPane.setPreferredSize(new Dimension(0, 150));
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.gridwidth = 6;
    gbc.gridheight = 1;
    gbc.weightx = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    panel.add(scrollPane, gbc);

    JButton clearButton = new JButton("Pastro");
    gbc.gridx = 4;
    gbc.gridy = 2;
    gbc.gridwidth = 2;
    gbc.gridheight = 1;
    gbc.weightx = 1.0;
    gbc.fill = GridBagConstraints.BOTH;

    additionButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          Double num1 = Double.parseDouble(num1Field.getText());
          Double num2 = Double.parseDouble(num2Field.getText());

          if (!num1Field.getText().isEmpty() || !num1Field.getText().isEmpty()) {
            listModel.addElement(num1 + " + " + num2 + " = " + (num1 + num2));
            num1Field.setText("");
            num2Field.setText("");
          }
        } catch (Exception error) {
          JOptionPane.showMessageDialog(frame, "Vendos vlera te sakta", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });

    subtractionButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          Double num1 = Double.parseDouble(num1Field.getText());
          Double num2 = Double.parseDouble(num2Field.getText());

          if (!num1Field.getText().isEmpty() || !num1Field.getText().isEmpty()) {
            listModel.addElement(num1 + " - " + num2 + " = " + (num1 - num2));
            num1Field.setText("");
            num2Field.setText("");
          }
        } catch (Exception error) {
          JOptionPane.showMessageDialog(frame, "Vendos vlera te sakta", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });

    multiplicationButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          Double num1 = Double.parseDouble(num1Field.getText());
          Double num2 = Double.parseDouble(num2Field.getText());

          if (!num1Field.getText().isEmpty() || !num1Field.getText().isEmpty()) {
            listModel.addElement(num1 + " * " + num2 + " = " + (num1 * num2));
            num1Field.setText("");
            num2Field.setText("");
          }
        } catch (Exception error) {
          JOptionPane.showMessageDialog(frame, "Vendos vlera te sakta", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });

    divisionButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          Double num1 = Double.parseDouble(num1Field.getText());
          Double num2 = Double.parseDouble(num2Field.getText());

          if ((!num1Field.getText().isEmpty() || !num1Field.getText().isEmpty()) && num2 != 0) {
            listModel.addElement(num1 + " / " + num2 + " = " + (num1 / num2));
            num1Field.setText("");
            num2Field.setText("");
          } else {
            JOptionPane.showMessageDialog(frame, "Nuk mund te pjestoni me 0", "Error", JOptionPane.ERROR_MESSAGE);
          }
        } catch (Exception error) {
          JOptionPane.showMessageDialog(frame, "Vendos vlera te sakta", "Error", JOptionPane.ERROR_MESSAGE);
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
