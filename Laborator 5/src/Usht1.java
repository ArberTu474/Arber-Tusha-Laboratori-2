// 1. Ndërtoni një aplikacion i cili do të përmbajë një frame, me një textArea ku do te
//    afishohet një tekst. Të shtohen 2 butona: “To Lower Case”, dhe “To Upper Case”
//    që do te kthejnë tekstin në shkronja të vogla ose të mëdha në varësi të butonit të
//    zgjedhur.

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Usht1 {
  public static void main(String[] args) throws Exception {
    JFrame frame = new JFrame("Ushtrimi 1");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);

    JPanel panel = new JPanel(new BorderLayout());
    panel.setBorder(new EmptyBorder(20, 20, 20, 20));

    JTextArea textArea = new JTextArea(10, 30);

    JPanel buttonsPanel = new JPanel();

    JButton lowerCaseButton = new JButton("To Lower Case");
    JButton upperCaseButton = new JButton("To Upper Case");

    lowerCaseButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        textArea.setText(textArea.getText().toLowerCase());
      }

    });

    upperCaseButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        textArea.setText(textArea.getText().toUpperCase());
      }

    });

    buttonsPanel.add(lowerCaseButton);
    buttonsPanel.add(upperCaseButton);

    panel.add(textArea, BorderLayout.CENTER);
    panel.add(buttonsPanel, BorderLayout.SOUTH);

    frame.add(panel);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
