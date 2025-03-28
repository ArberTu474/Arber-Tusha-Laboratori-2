import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Usht3 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Ushtrimi 3");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);

    JPanel panel = new JPanel(new BorderLayout());

    String[] columns = { "ID Studenti", "Emri", "Mbiemri" };
    String[][] data = {
        { "1", "Emer1", "Mbiemer1" },
        { "2", "Emer2", "Mbiemer2" },
        { "3", "Emer3", "Mbiemer3" }
    };

    JTable table = new JTable(data, columns);

    table.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        int row = table.getSelectedRow();
        int col = table.getSelectedColumn();

        if (row != -1 && col != -1) {
          String value = table.getValueAt(row, col).toString();
          JOptionPane.showMessageDialog(frame, "Vleara e klikuar: " + value, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
      }
    });

    JScrollPane scrollPane = new JScrollPane(table);

    panel.add(scrollPane);

    frame.add(panel);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
