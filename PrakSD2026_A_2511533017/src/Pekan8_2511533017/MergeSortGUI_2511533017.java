package Pekan8_2511533017;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import java.util.LinkedList;
import java.util.Queue;

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
import javax.swing.SwingUtilities;

public class MergeSortGUI_2511533017 extends JFrame {

    private static final long serialVersionUID_3017 = 1L;

    private int[] array_3017;
    private JLabel[] labelArray_3017;
    private JButton stepButton_3017, resetButton_3017, setButton_3017;
    private JTextField inputField_3017;
    private JPanel panelArray_3017;
    private JTextArea stepArea_3017;

    private int i_3017, j_3017, k_3017;
    private int left_3017, mid_3017, right_3017;
    private int[] temp_3017;

    private boolean isMerging_3017 = false;
    private boolean copying_3017 = false;
    private int stepCount_3017 = 1;

    private Queue<int[]> mergeQueue_3017 = new LinkedList<>();

    public MergeSortGUI_2511533017() {
        setTitle("Merge Sort Langkah per Langkah");
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
        setButton_3017.addActionListener(e_3017 -> setArrayFromInput_3017());

        // Event Langkah Selanjutnya
        stepButton_3017.addActionListener(e_3017 -> performStep_3017());

        // Event Reset
        resetButton_3017.addActionListener(e_3017 -> reset_3017());
    }

    private void setArrayFromInput_3017() {
        String text_3017 = inputField_3017.getText().trim();
        if (text_3017.isEmpty()) return;

        String[] parts_3017 = text_3017.split(",");
        array_3017 = new int[parts_3017.length];

        try {
            for (int i_3017 = 0; i_3017 < parts_3017.length; i_3017++) {
                array_3017[i_3017] = Integer.parseInt(parts_3017[i_3017].trim());
            }
        } catch (NumberFormatException e_3017) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        labelArray_3017 = new JLabel[array_3017.length];
        panelArray_3017.removeAll();

        for (int i_3017 = 0; i_3017 < array_3017.length; i_3017++) {
            labelArray_3017[i_3017] = new JLabel(String.valueOf(array_3017[i_3017]));
            labelArray_3017[i_3017].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_3017[i_3017].setOpaque(true);
            labelArray_3017[i_3017].setBackground(Color.WHITE);
            labelArray_3017[i_3017].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3017[i_3017].setPreferredSize(new Dimension(50, 50));
            labelArray_3017[i_3017].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3017.add(labelArray_3017[i_3017]);
        }

        mergeQueue_3017.clear();
        generateMergeSteps_3017(0, array_3017.length - 1);

        stepButton_3017.setEnabled(true);
        stepArea_3017.setText("");
        stepCount_3017 = 1;
        isMerging_3017 = false;
        copying_3017 = false;

        panelArray_3017.revalidate();
        panelArray_3017.repaint();
    }

    private void generateMergeSteps_3017(int left_3017, int right_3017) {
        if (left_3017 < right_3017) {
            int mid_3017 = left_3017 + (right_3017 - left_3017) / 2;

            generateMergeSteps_3017(left_3017, mid_3017);
            generateMergeSteps_3017(mid_3017 + 1, right_3017);

            mergeQueue_3017.add(new int[] { left_3017, mid_3017, right_3017 });
        }
    }

    private void performStep_3017() {
        resetHighlights_3017();

        if (!isMerging_3017 && !mergeQueue_3017.isEmpty()) {
            int[] range_3017 = mergeQueue_3017.poll();

            left_3017 = range_3017[0];
            mid_3017 = range_3017[1];
            right_3017 = range_3017[2];

            temp_3017 = new int[right_3017 - left_3017 + 1];

            i_3017 = left_3017;
            j_3017 = mid_3017 + 1;
            k_3017 = 0;

            copying_3017 = false;
            isMerging_3017 = true;

            stepArea_3017.append(
                    "Langkah " + stepCount_3017++
                            + ": Mulai merge dari "
                            + left_3017 + " ke "
                            + right_3017 + "\n"
            );

            return;
        }

        if (isMerging_3017 && !copying_3017) {
            if (i_3017 <= mid_3017 && j_3017 <= right_3017) {
                labelArray_3017[i_3017].setBackground(Color.CYAN);
                labelArray_3017[j_3017].setBackground(Color.CYAN);

                if (array_3017[i_3017] <= array_3017[j_3017]) {
                    temp_3017[k_3017++] = array_3017[i_3017++];
                } else {
                    temp_3017[k_3017++] = array_3017[j_3017++];
                }

                stepArea_3017.append(
                        "Langkah " + stepCount_3017++
                                + ": Bandingkan dan salin elemen\n"
                );

                return;

            } else if (i_3017 <= mid_3017) {
                temp_3017[k_3017++] = array_3017[i_3017++];

                stepArea_3017.append(
                        "Langkah " + stepCount_3017++
                                + ": Salin sisa kiri\n"
                );

                return;

            } else if (j_3017 <= right_3017) {
                temp_3017[k_3017++] = array_3017[j_3017++];

                stepArea_3017.append(
                        "Langkah " + stepCount_3017++
                                + ": Salin sisa kanan\n"
                );

                return;

            } else {
                copying_3017 = true;
                k_3017 = 0;
                return;
            }
        }

        if (copying_3017 && k_3017 < temp_3017.length) {
            array_3017[left_3017 + k_3017] = temp_3017[k_3017];
            labelArray_3017[left_3017 + k_3017].setText(String.valueOf(temp_3017[k_3017]));
            labelArray_3017[left_3017 + k_3017].setBackground(Color.GREEN);
            k_3017++;

            stepArea_3017.append("Langkah " + stepCount_3017++ + ": Tempelkan ke array utama\n");
            return;
        }

        if (copying_3017 && k_3017 == temp_3017.length) {
            isMerging_3017 = false;
            copying_3017 = false;
        }

        if (mergeQueue_3017.isEmpty() && !isMerging_3017) {
            stepArea_3017.append("Selesai.\n");
            stepButton_3017.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
        }
    }

    private void resetHighlights_3017() {
        if (labelArray_3017 == null) return;

        for (JLabel label_3017 : labelArray_3017) {
            label_3017.setBackground(Color.WHITE);
        }
    }

    private void reset_3017() {
        inputField_3017.setText("");
        panelArray_3017.removeAll();
        panelArray_3017.revalidate();
        panelArray_3017.repaint();
        stepArea_3017.setText("");
        stepButton_3017.setEnabled(false);
        mergeQueue_3017.clear();
        isMerging_3017 = false;
        copying_3017 = false;
        stepCount_3017 = 1;
    }

    public static void main(String[] args_3017) {
        SwingUtilities.invokeLater(() -> {
            MergeSortGUI_2511533017 frame_3017 = new MergeSortGUI_2511533017();
            frame_3017.setVisible(true);
        });
    }
}