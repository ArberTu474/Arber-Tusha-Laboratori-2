import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Usht1 {
  public static void main(String[] args) throws Exception {
    JFrame frame = new JFrame("Ushtrimi 1");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);

    JPanel panel = new JPanel(new BorderLayout());
    panel.setBorder(new EmptyBorder(20, 20, 20, 20));

    DefaultListModel<String> listModel = new DefaultListModel<>();
    JList<String> namesList = new JList<String>(listModel);
    JScrollPane scrollPane = new JScrollPane(namesList);

    JPanel buttonsPanel = new JPanel();

    JButton addButton = new JButton("Shtoni nje student te ri");
    JButton searchButton = new JButton("Kerkoni nje student");
    JButton sortButton = new JButton("Rendisni studentet");

    addButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        String student = JOptionPane.showInputDialog(frame, "Jepni nje emer studenti:", "Input",
            JOptionPane.QUESTION_MESSAGE);

        if (!student.isEmpty()) {
          listModel.addElement(student);
        }
      }

    });

    searchButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        String student = JOptionPane.showInputDialog(frame, "Kerkoni me emer studenti:", "Input",
            JOptionPane.QUESTION_MESSAGE);

        if (findStudent(listModel, student) != -1) {
          namesList.setSelectedIndex(findStudent(listModel, student));
        } else {
          JOptionPane.showMessageDialog(frame, "Studenti nuk u gjet!", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }

    });

    sortButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        sortStudents(listModel);
      }

    });

    buttonsPanel.add(addButton);
    buttonsPanel.add(searchButton);
    buttonsPanel.add(sortButton);

    panel.add(buttonsPanel, BorderLayout.NORTH);
    panel.add(scrollPane, BorderLayout.CENTER);

    frame.add(panel);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);

  }

  public static int findStudent(DefaultListModel<String> listModel, String student) {
    for (int i = 0; i < listModel.size(); i++) {
      if (listModel.getElementAt(i).toLowerCase().equals(student.toLowerCase())) {
        return i;
      }
    }

    return -1;
  }

  public static void sortStudents(DefaultListModel<String> listModel) {
    ArrayList<String> list = new ArrayList<>();

    for (int i = 0; i < listModel.size(); i++) {
      list.add(listModel.getElementAt(i));
    }

    Collections.sort(list);

    listModel.clear();
    for (String student : list) {
      listModel.addElement(student);
    }
  }

}
