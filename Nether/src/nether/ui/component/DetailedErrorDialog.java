package nether.ui.component;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

//UIManager.put("OptionPane.okButtonText", "OK"); para cambiar el texto del botón
//del JOptionPane
/**
 *
 * @author Héctor-
 */
public class DetailedErrorDialog {

    private final static String LINEBREAK = System.getProperty("line.separator");

    public static void showErrorDialog(String title, String details) {
        final JTextArea textPane = new JTextArea();

//        textPane.setForeground(Color.LIGHT_GRAY);
//        textPane.setBackground(Color.BLACK);
        textPane.setText(LINEBREAK + details + LINEBREAK);
        textPane.setEditable(false);

        final JScrollPane scrollPane = new JScrollPane(textPane);
        scrollPane.setAlignmentX(0);

        final JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));

        final JDialog dialog = new JOptionPane(
                content,
                JOptionPane.ERROR_MESSAGE,
                JOptionPane.DEFAULT_OPTION).createDialog(null, "Ha ocurrido un error");

        JLabel message = new JLabel(title);
        message.setBorder(new EmptyBorder(10, 10, 10, 10));
        message.setAlignmentX(0);
        Dimension labelSize = message.getPreferredSize();
        labelSize.setSize(300, labelSize.height);
        message.setPreferredSize(labelSize);
        content.add(message);

        JCheckBox cb = new JCheckBox(new AbstractAction() {

            private static final long serialVersionUID = 1L;

            {
                this.putValue(Action.SELECTED_KEY, false);
                this.putValue(Action.NAME, "Ver detalles");
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if ((Boolean) this.getValue(Action.SELECTED_KEY)) {
                    content.add(scrollPane);
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                } else {
                    content.remove(scrollPane);
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                }
                content.invalidate();
                dialog.invalidate();
                dialog.pack();
            }
        });
        content.add(cb);

        dialog.setResizable(false);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }
}
