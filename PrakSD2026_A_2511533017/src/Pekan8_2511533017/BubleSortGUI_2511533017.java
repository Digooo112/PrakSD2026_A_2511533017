package Pekan8_2511533017;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BubleSortGUI_2511533017 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_3017;
	private JLabel[] labelArray_3017;
	private JButton stepButton_3017, resetButton_3017, setButton_3017;
	private JTextField inputField_3017;
	private JPanel panelArray_3017;
	private JTextArea stepArea_3017;

	private int i_3017 = 1, j_3017;
	private boolean sorting_3017 = false;
	private int stepCount_3017 = 1;

	public BubleSortGUI_2511533017() {
		setTitle("Insertion Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// Panel input
		JPanel inputPanel_3017 = new JPanel(new FlowLayout());
		inputField_3017 = new JTextField(30);
		setButton_3017 = new JButton("Set Array");

		inputPanel_3017.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
		inputPanel_3017.add(inputField_3017);
		inputPanel_3017.add(setButton_3017);

		// Panel array visual
		panelArray_3017 = new JPanel();
		panelArray_3017.setLayout(new FlowLayout());

		// Panel kontrol
		JPanel controlPanel_3017 = new JPanel();
		stepButton_3017 = new JButton("Langkah Selanjutnya");
		resetButton_3017 = new JButton("Reset");
		stepButton_3017.setEnabled(false);

		controlPanel_3017.add(stepButton_3017);
		controlPanel_3017.add(resetButton_3017);

		// Area teks untuk log langkah-langkah
		stepArea_3017 = new JTextArea(8, 60);
		stepArea_3017.setEditable(false);
		stepArea_3017.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_3017 = new JScrollPane(stepArea_3017);

		// Tambahkan panel ke frame
		add(inputPanel_3017, BorderLayout.NORTH);
		add(panelArray_3017, BorderLayout.CENTER);
		add(controlPanel_3017, BorderLayout.SOUTH);
		add(scrollPane_3017, BorderLayout.EAST);

		// Event Set Array
		setButton_3017.addActionListener(e -> setArrayFromInput_3017());

		// Event Langkah Selanjutnya
		stepButton_3017.addActionListener(e -> performStep_3017());

		// Event Reset
		resetButton_3017.addActionListener(e -> reset_3017());
	}

	private void setArrayFromInput_3017() {
		String text_3017 = inputField_3017.getText().trim();

		if (text_3017.isEmpty()) {
			return;
		}

		String[] parts_3017 = text_3017.split(",");
		array_3017 = new int[parts_3017.length];

		try {
			for (int k_3017 = 0; k_3017 < parts_3017.length; k_3017++) {
				array_3017[k_3017] = Integer.parseInt(parts_3017[k_3017].trim());
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(
					this,
					"Masukkan hanya angka yang dipisahkan dengan koma!",
					"Error",
					JOptionPane.ERROR_MESSAGE
			);
			return;
		}

		i_3017 = 0;
		j_3017 = 0;
		stepCount_3017 = 1;
		sorting_3017 = true;
		stepButton_3017.setEnabled(true);
		stepArea_3017.setText("");

		panelArray_3017.removeAll();
		labelArray_3017 = new JLabel[array_3017.length];

		for (int k_3017 = 0; k_3017 < array_3017.length; k_3017++) {
			labelArray_3017[k_3017] = new JLabel(String.valueOf(array_3017[k_3017]));
			labelArray_3017[k_3017].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray_3017[k_3017].setOpaque(true);
			labelArray_3017[k_3017].setBackground(Color.WHITE);
			labelArray_3017[k_3017].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_3017[k_3017].setPreferredSize(new Dimension(50, 50));
			labelArray_3017[k_3017].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_3017.add(labelArray_3017[k_3017]);
		}

		panelArray_3017.revalidate();
		panelArray_3017.repaint();
	}

	private void performStep_3017() {
		 if (!sorting_3017 || i_3017 >= array_3017.length - 1) {
		        sorting_3017 = false;
		        stepButton_3017.setEnabled(false);
		        JOptionPane.showMessageDialog(this, "Sorting selesai!");
		        return;
		    }

		    resetHighlights_3017();
		    StringBuilder stepLog_3017 = new StringBuilder();

		    labelArray_3017[j_3017].setBackground(Color.cyan);
		    labelArray_3017[j_3017 + 1].setBackground(Color.cyan);

		    if (array_3017[j_3017] > array_3017[j_3017 + 1]) {
		        // swap
		        int temp_3017 = array_3017[j_3017];
		        array_3017[j_3017] = array_3017[j_3017 + 1];
		        array_3017[j_3017 + 1] = temp_3017;

		        labelArray_3017[j_3017].setBackground(Color.RED);
		        labelArray_3017[j_3017 + 1].setBackground(Color.RED);

		        stepLog_3017.append("Langkah")
		                .append(stepCount_3017)
		                .append(":Menukar elemen ke-")
		                .append(j_3017)
		                .append(" (")
		                .append(array_3017[j_3017 + 1])
		                .append(") dengan ke-")
		                .append(j_3017 + 1)
		                .append(" (")
		                .append(array_3017[j_3017])
		                .append(")\n");
		    } else {
		        stepLog_3017.append("Langkah ")
		                .append(stepCount_3017)
		                .append(":Tidak ada pertukaran elemen ke-")
		                .append(j_3017)
		                .append(" dan ke-")
		                .append(j_3017 + 1)
		                .append("\n");
		    }

		    stepLog_3017.append("Hasil : ")
		            .append(arrayToString_3017(array_3017))
		            .append("\n\n");

		    stepArea_3017.append(stepLog_3017.toString());

		    updateLabels_3017();

		    j_3017++;

		    if (j_3017 >= array_3017.length - i_3017 - 1) {
		        j_3017 = 0;
		        i_3017++;
		    }

		    stepCount_3017++;

		    if (i_3017 >= array_3017.length - 1) {
		        sorting_3017 = false;
		        stepButton_3017.setEnabled(false);
		        JOptionPane.showMessageDialog(this, "Sorting selesai!");
		    }
		}

		private void updateLabels_3017() {
		    for (int k_3017 = 0; k_3017 < array_3017.length; k_3017++) {
		        labelArray_3017[k_3017].setText(String.valueOf(array_3017[k_3017]));
		    }
		}

		private void resetHighlights_3017() {
		    for (JLabel label_3017 : labelArray_3017) {
		        label_3017.setBackground(Color.white);
		    }
		}

		private void reset_3017() {
		    inputField_3017.setText("");
		    panelArray_3017.removeAll();
		    panelArray_3017.revalidate();
		    panelArray_3017.repaint();
		    stepArea_3017.setText("");
		    stepButton_3017.setEnabled(false);
		    sorting_3017 = false;
		    i_3017 = 0;
		    j_3017 = 0;
		    stepCount_3017 = 1;
		}

		private String arrayToString_3017(int[] arr_3017) {
		    StringBuilder sb_3017 = new StringBuilder();

		    for (int k_3017 = 0; k_3017 < arr_3017.length; k_3017++) {
		        sb_3017.append(arr_3017[k_3017]);

		        if (k_3017 < arr_3017.length - 1)
		            sb_3017.append(", ");
		    }

		    return sb_3017.toString();
		}

		public static void main(String[] args) {
		    EventQueue.invokeLater(new Runnable() {
		        public void run() {
		            try {
		                BubleSortGUI_2511533017 frame = new BubleSortGUI_2511533017();
		                frame.setVisible(true);
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
		        }
		    });
		}

		}
