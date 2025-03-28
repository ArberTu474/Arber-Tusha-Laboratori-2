import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Usht2 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Ushtrimi 2");

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
    JScrollPane scrollPane = new JScrollPane(table);

    panel.add(scrollPane);

    frame.add(panel);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
