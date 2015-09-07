import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class LottoGame {

	private JFrame frame;
	private JTable table;
	private JTable table_2;
	private JTable table_3;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LottoGame window = new LottoGame();
					window.frame.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LottoGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Add Player");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AddPlayer add = new AddPlayer();
				add.setModal(true);
				add.setVisible(true);
				Player player = add.getMainPlayer();
				if (player != null) {
					DefaultTableModel model = (DefaultTableModel) table_1.getModel();
					model.addRow(new Object[] { player.getId(), player.getFirstNumber(), player.getSecondNumber(),
							player.getThirdNumber(), player.getFourthNumber(), player.getFifthNumber() });
				}
			}
		});
		btnNewButton.setBounds(38, 493, 188, 38);
		frame.getContentPane().add(btnNewButton);

		JButton btnWinningNumber = new JButton("Winning number");
		btnWinningNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				WinningNumbers object = new WinningNumbers();

				ArrayList<Integer> list = object.drawNumbers();

				for (int num : list) {
					DefaultTableModel model = (DefaultTableModel) table_2.getModel();

					model.addRow(new Object[] { (Object) num });

				}

				
				btnWinningNumber.setEnabled(false);

			}
		});
		
		btnWinningNumber.setBounds(261, 493, 188, 38);
		frame.getContentPane().add(btnWinningNumber);

		JButton btnWinPlayer = new JButton("Win Player");
		btnWinPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Player player=new Player();
				try {
				NumberFormat numberFormat = NumberFormat.getNumberInstance();
				int[] selectedRow = table_1.getSelectedRows();
				ArrayList<Integer> listNum = new ArrayList<Integer>();

				for (int i = 0; i < 5; i++) {
					int num = 0;
					

						Object t = table_2.getValueAt(i, 0);
						String t2 = t.toString();

						num = numberFormat.parse(t2).intValue();
					
					listNum.add(num);
				}
                 
				
				for (int i = 0; i <= selectedRow[selectedRow.length - 1]; i++) {
					int count = 0;
					for (int j = 1; j <= 5; j++) {

						int temp = 0;
						
							temp = numberFormat.parse(table_1.getValueAt(i, j).toString()).intValue();
						
						if (listNum.contains(temp)) {
							count++;
						}

					}
					if (count == 3) {
						DefaultTableModel model = (DefaultTableModel) table_3.getModel();
						String knownNum = String.format("%s-%s numbers", table_1.getValueAt(i, 0), count);
						model.addRow(new Object[] { knownNum });

					}
					if (count == 4) {
						DefaultTableModel model = (DefaultTableModel) table_3.getModel();
						String knownNum = String.format("%s-%s numbers", table_1.getValueAt(i, 0), count);
						model.addRow(new Object[] { knownNum });

					}
					if (count == 5) {
						DefaultTableModel model = (DefaultTableModel) table_3.getModel();
						String knownNum = String.format("%s-%s numbers", table_1.getValueAt(i, 0), count);
						model.addRow(new Object[] { knownNum });

					}
					count = 0;
					

				}
				
				}catch(ParseException e1){
					JOptionPane.showMessageDialog(null, "Parse Error");
					e1.printStackTrace();
				}

			}
		});
		btnWinPlayer.setBounds(494, 493, 188, 38);
		frame.getContentPane().add(btnWinPlayer);

		JButton btnExport = new JButton("Export");
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					PrintWriter first = new PrintWriter("first.txt", "UTF-8");
					PrintWriter second = new PrintWriter("second.txt", "UTF-8");
					PrintWriter third = new PrintWriter("third.txt", "UTF-8");

					BufferedWriter fwriter = new BufferedWriter(first);
					BufferedWriter swriter = new BufferedWriter(second);
					BufferedWriter twriter = new BufferedWriter(third);

					ArrayList<String> list = new ArrayList<String>();
					int rowF = table_1.getRowCount();
					for (int i = 0; i < rowF; i++) {
						String rowElements1 = String.format("%s:%s,%s,%s,%s,%s", table_1.getValueAt(i, 0),
								table_1.getValueAt(i, 1), table_1.getValueAt(i, 2), table_1.getValueAt(i, 3),
								table_1.getValueAt(i, 4), table_1.getValueAt(i, 5));
						list.add(rowElements1);
					}
					ArrayList<String> list2 = new ArrayList<String>();
					int rowS = table_2.getRowCount();
					for (int i = 0; i < rowS; i++) {
						String rowElements2 = String.format("Winning Numbers:%s", table_2.getValueAt(i, 0));
						list2.add(rowElements2);
					}

					ArrayList<String> list3 = new ArrayList<String>();
					int rowT = table_3.getRowCount();
					for (int i = 0; i < rowT; i++) {
						String rowElements3 = String.format("%s", table_3.getValueAt(i, 0));

						list3.add(rowElements3);
					}

					for (String rowElements2 : list) {

						fwriter.append(rowElements2);
						fwriter.newLine();

					}

					for (String rowElements2 : list2) {

						swriter.append(rowElements2);
						swriter.newLine();

					}
					for (String rowElements2 : list3) {

						twriter.append(rowElements2);
						twriter.newLine();
					}
					fwriter.close();
					swriter.close();
					twriter.close();

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error saving file!");
				}
				JOptionPane.showMessageDialog(null, "Successfully saved file!");
			}

		});
		btnExport.setBounds(728, 493, 188, 38);
		frame.getContentPane().add(btnExport);

		Object[][] rowData2 = new Object[0][1];
		Object[] colum2 = { "Winnig Numbers" };

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(379, 46, 188, 102);
		frame.getContentPane().add(scrollPane_2);
		table_2 = new JTable();
		table_2 = new JTable(new DefaultTableModel(rowData2, colum2));
		scrollPane_2.setViewportView(table_2);
		scrollPane_2.setColumnHeaderView(table_2);
		table_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		scrollPane_2.setViewportView(table_2);

		Object[][] rowData3 = new Object[0][1];
		Object[] colum3 = { "Winnig player" };
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(651, 46, 196, 400);
		frame.getContentPane().add(scrollPane_3);
		table_3 = new JTable();
		table_3 = new JTable(new DefaultTableModel(rowData3, colum3));
		scrollPane_3.setColumnHeaderView(table_3);
		table_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_3.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		scrollPane_3.setViewportView(table_3);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(38, 46, 288, 408);
		frame.getContentPane().add(scrollPane_1);

		Object[][] rowData1 = new Object[0][6];
		Object[] colum1 = { "ID", "First", "Second", "Third", "Forth", "Fifth" };
		table_1 = new JTable();
		table_1 = new JTable(new DefaultTableModel(rowData1, colum1));
		scrollPane_1.setColumnHeaderView(table_1);
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		scrollPane_1.setViewportView(table_1);

	}
}