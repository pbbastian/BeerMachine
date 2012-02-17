package beermachine.client.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Date: 17-02-12
 * Time: 17:05
 */
public class AppGUI {
    private JFrame frame;
    private JTable table;

    /**
     * Starts GUI for demo purposes
     */
    public static void main(String args[]) {
        AppGUI appGUI = new AppGUI();
        appGUI.initialize();
        appGUI.frame.setVisible(true);
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        /**
         * Frame properties
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        frame = new JFrame();
        frame.setBounds(100, 100, 1000, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        /**
         * Gridbaglayout properties
         */
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{0, 100, 100, 0, 0, 0, 0, 0};
        gridBagLayout.rowHeights = new int[]{0, 150, 0, 20, 0, 20, 20, 50, 20, 22, 50, 0, 5, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
        frame.getContentPane().setLayout(gridBagLayout);

        /**
         * Image banner in the top of the application
         */
        JLabel lblImage = new JLabel("");
        lblImage.setIcon(new ImageIcon("banner.jpg"));
        GridBagConstraints gbc_lblImage = new GridBagConstraints();
        gbc_lblImage.gridwidth = 5;
        gbc_lblImage.insets = new Insets(0, 0, 5, 5);
        gbc_lblImage.gridx = 1;
        gbc_lblImage.gridy = 1;
        frame.getContentPane().add(lblImage, gbc_lblImage);

        /**
         * Shopping list label
         */
        JLabel lblShoppingList = new JLabel("Shopping List");
        GridBagConstraints gbc_lblShoppingList = new GridBagConstraints();
        gbc_lblShoppingList.insets = new Insets(0, 0, 5, 5);
        gbc_lblShoppingList.gridx = 1;
        gbc_lblShoppingList.gridy = 2;
        frame.getContentPane().add(lblShoppingList, gbc_lblShoppingList);

        /**
         * Previously bought items label
         */
        JLabel lblPurchased = new JLabel("Purchased");
        GridBagConstraints gbc_lblPurchased = new GridBagConstraints();
        gbc_lblPurchased.insets = new Insets(0, 0, 5, 5);
        gbc_lblPurchased.gridx = 2;
        gbc_lblPurchased.gridy = 2;
        frame.getContentPane().add(lblPurchased, gbc_lblPurchased);

        /**
         * Logged in as label
         */
        JLabel lblLoggedInAs = new JLabel("Logged in as...");
        GridBagConstraints gbc_lblLoggedInAs = new GridBagConstraints();
        gbc_lblLoggedInAs.insets = new Insets(0, 0, 5, 5);
        gbc_lblLoggedInAs.gridx = 4;
        gbc_lblLoggedInAs.gridy = 2;
        frame.getContentPane().add(lblLoggedInAs, gbc_lblLoggedInAs);

        /**
         * User consumption rank label
         */
        JLabel lblRank = new JLabel("Rank #");
        GridBagConstraints gbc_lblRank = new GridBagConstraints();
        gbc_lblRank.insets = new Insets(0, 0, 5, 5);
        gbc_lblRank.gridx = 5;
        gbc_lblRank.gridy = 2;
        frame.getContentPane().add(lblRank, gbc_lblRank);

        /**
         * Shopping list Jlist
         */
        JList list = new JList();
        GridBagConstraints gbc_list = new GridBagConstraints();
        gbc_list.gridheight = 8;
        gbc_list.insets = new Insets(0, 0, 5, 5);
        gbc_list.fill = GridBagConstraints.BOTH;
        gbc_list.gridx = 1;
        gbc_list.gridy = 3;
        frame.getContentPane().add(list, gbc_list);

        /**
         * Previously purchased items list
         */
        JList list_1 = new JList();
        GridBagConstraints gbc_list_1 = new GridBagConstraints();
        gbc_list_1.gridheight = 8;
        gbc_list_1.insets = new Insets(0, 0, 5, 5);
        gbc_list_1.fill = GridBagConstraints.BOTH;
        gbc_list_1.gridx = 2;
        gbc_list_1.gridy = 3;
        frame.getContentPane().add(list_1, gbc_list_1);

        /**
         * Current logged in user (set to Kristian Dam-Jensen for demo purpose)
         */
        JLabel lblKristianDamjensen = new JLabel("Kristian Dam-Jensen");
        lblKristianDamjensen.setFont(new Font("Tahoma", Font.PLAIN, 20));
        GridBagConstraints gbc_lblKristianDamjensen = new GridBagConstraints();
        gbc_lblKristianDamjensen.gridheight = 2;
        gbc_lblKristianDamjensen.insets = new Insets(0, 0, 5, 5);
        gbc_lblKristianDamjensen.gridx = 4;
        gbc_lblKristianDamjensen.gridy = 3;
        frame.getContentPane().add(lblKristianDamjensen, gbc_lblKristianDamjensen);

        /**
         * Current user rank
         */
        JLabel label_1 = new JLabel("4");
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        GridBagConstraints gbc_label_1 = new GridBagConstraints();
        gbc_label_1.gridheight = 2;
        gbc_label_1.insets = new Insets(0, 0, 5, 5);
        gbc_label_1.gridx = 5;
        gbc_label_1.gridy = 3;
        frame.getContentPane().add(label_1, gbc_label_1);

        /**
         * Works as a line seperator
         */
        JLabel label = new JLabel("_________________________________________________________________");
        GridBagConstraints gbc_label = new GridBagConstraints();
        gbc_label.gridwidth = 2;
        gbc_label.insets = new Insets(0, 0, 5, 5);
        gbc_label.gridx = 4;
        gbc_label.gridy = 5;
        frame.getContentPane().add(label, gbc_label);

        /**
         * System status label (right side)
         */
        JLabel lblStatus = new JLabel("Status");
        GridBagConstraints gbc_lblStatus = new GridBagConstraints();
        gbc_lblStatus.gridwidth = 2;
        gbc_lblStatus.insets = new Insets(0, 0, 5, 5);
        gbc_lblStatus.gridx = 4;
        gbc_lblStatus.gridy = 6;
        frame.getContentPane().add(lblStatus, gbc_lblStatus);

        /**
         * System status log
         */
        JTextArea textArea = new JTextArea();
        GridBagConstraints gbc_textArea = new GridBagConstraints();
        gbc_textArea.gridheight = 2;
        gbc_textArea.gridwidth = 2;
        gbc_textArea.insets = new Insets(0, 0, 5, 5);
        gbc_textArea.fill = GridBagConstraints.BOTH;
        gbc_textArea.gridx = 4;
        gbc_textArea.gridy = 7;
        frame.getContentPane().add(textArea, gbc_textArea);

        /**
         * Leaderboard label for top consuming users
         */
        JLabel lblLeaderBoard = new JLabel("Leader board");
        GridBagConstraints gbc_lblLeaderBoard = new GridBagConstraints();
        gbc_lblLeaderBoard.gridwidth = 2;
        gbc_lblLeaderBoard.insets = new Insets(0, 0, 5, 5);
        gbc_lblLeaderBoard.gridx = 4;
        gbc_lblLeaderBoard.gridy = 9;
        frame.getContentPane().add(lblLeaderBoard, gbc_lblLeaderBoard);

        /**
         * Leaderboard for top consuming users
         */
        table = new JTable();
        GridBagConstraints gbc_table = new GridBagConstraints();
        gbc_table.gridheight = 2;
        gbc_table.gridwidth = 2;
        gbc_table.insets = new Insets(0, 0, 5, 5);
        gbc_table.fill = GridBagConstraints.BOTH;
        gbc_table.gridx = 4;
        gbc_table.gridy = 10;
        frame.getContentPane().add(table, gbc_table);

        /**
         * Progress bar below shopping list and previous purchases list
         */
        JProgressBar progressBar = new JProgressBar();
        progressBar.setString("Status");
        progressBar.setStringPainted(true);
        progressBar.setName("Status");
        progressBar.setMinimum(150);
        progressBar.setMaximum(250);
        GridBagConstraints gbc_progressBar = new GridBagConstraints();
        gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
        gbc_progressBar.gridwidth = 2;
        gbc_progressBar.insets = new Insets(0, 0, 5, 5);
        gbc_progressBar.gridx = 1;
        gbc_progressBar.gridy = 11;
        frame.getContentPane().add(progressBar, gbc_progressBar);
    }
}
