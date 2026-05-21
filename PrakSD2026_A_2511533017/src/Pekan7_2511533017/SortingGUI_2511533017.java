package Pekan7_2511533017;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SortingGUI_2511533017 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	// Komponen Input
	private JTextField txtNama_3017, txtNim_3017, txtProdi_3017;
	private JButton btnTambah_3017, btnHapus_3017, btnSort_3017, btnStep_3017, btnReset_3017;
	private JComboBox<String> comboAlgoritma_3017;
	
	// Tabel
	private JTable table_3017;
	private DefaultTableModel tableModel_3017;
	
	// Area Log
	private JTextArea logArea_3017;
	
	// Data
	private ArrayList<Mahasiswa_2511533017> dataList_3017;
	private ArrayList<Mahasiswa_2511533017> workingList_3017;
	
	// State sorting
	private String selectedAlgorithm_3017 = "";
	private boolean isSorting_3017 = false;
	
	// Variabel untuk Insertion Sort
	private int insertionI_3017, insertionJ_3017;
	private Mahasiswa_2511533017 insertionKey_3017;
	private int insertionPhase_3017;
	
	// Variabel untuk Selection Sort
	private int selectionI_3017, selectionJ_3017, selectionMinIdx_3017;
	private int selectionPhase_3017;
	
	// Variabel untuk Bubble Sort
	private int bubbleI_3017, bubbleJ_3017;
	private int bubblePhase_3017;
	
	private int stepCounter_3017 = 1;
	
	public SortingGUI_2511533017() {
		setTitle("Aplikasi Sorting Data Mahasiswa");
		setSize(1300, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// Inisialisasi data
		dataList_3017 = new ArrayList<>();
		workingList_3017 = new ArrayList<>();
		
		// Data awal
		dataList_3017.add(new Mahasiswa_2511533017("Zaky", "2511533017", "Informatika"));
		dataList_3017.add(new Mahasiswa_2511533017("Digo", "2511523017", "Sistem Informasi"));
		dataList_3017.add(new Mahasiswa_2511533017("Karim", "2511512029", "Teknik Komputer"));
		dataList_3017.add(new Mahasiswa_2511533017("Endy", "2511531017", "Informatika"));
		dataList_3017.add(new Mahasiswa_2511533017("Fahri", "2511511007", "Teknik Komputer"));
		
		// ==================== PANEL KIRI ====================
		JPanel leftPanel = new JPanel(new BorderLayout(10, 10));
		leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		// Panel Kontrol Sorting - Menggunakan GridLayout agar rapi
		JPanel controlPanel = new JPanel(new GridLayout(2, 1, 10, 10));
		controlPanel.setBorder(BorderFactory.createTitledBorder("Kontrol Sorting"));
		
		// Panel untuk pilih algoritma
		JPanel algoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
		algoPanel.add(new JLabel("Pilih Algoritma:"));
		comboAlgoritma_3017 = new JComboBox<>(new String[]{
			"Pilih Algoritma", "Insertion Sort", "Selection Sort", "Bubble Sort"
		});
		comboAlgoritma_3017.setPreferredSize(new Dimension(180, 30));
		algoPanel.add(comboAlgoritma_3017);
		
		// Panel untuk tombol-tombol
		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
		btnSort_3017 = new JButton("Mulai Sorting");
		btnSort_3017.setPreferredSize(new Dimension(140, 35));
		btnStep_3017 = new JButton("Langkah Selanjutnya");
		btnStep_3017.setPreferredSize(new Dimension(170, 35));
		btnReset_3017 = new JButton("Reset Semua");
		btnReset_3017.setPreferredSize(new Dimension(130, 35));
		
		buttonPanel.add(btnSort_3017);
		buttonPanel.add(btnStep_3017);
		buttonPanel.add(btnReset_3017);
		
		controlPanel.add(algoPanel);
		controlPanel.add(buttonPanel);
		
		// Area Log
		logArea_3017 = new JTextArea();
		logArea_3017.setEditable(false);
		logArea_3017.setFont(new Font("Monospaced", Font.PLAIN, 12));
		JScrollPane logScroll = new JScrollPane(logArea_3017);
		logScroll.setBorder(BorderFactory.createTitledBorder("Log Proses Sorting (Step by Step)"));
		logScroll.setPreferredSize(new Dimension(500, 500));
		
		leftPanel.add(controlPanel, BorderLayout.NORTH);
		leftPanel.add(logScroll, BorderLayout.CENTER);
		
		// ==================== PANEL KANAN ====================
		JPanel rightPanel = new JPanel(new BorderLayout(10, 10));
		rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		// Panel Input
		JPanel inputPanel = new JPanel(new GridLayout(4, 2, 10, 10));
		inputPanel.setBorder(BorderFactory.createTitledBorder("Form Input Mahasiswa"));
		
		inputPanel.add(new JLabel("Nama Mahasiswa:"));
		txtNama_3017 = new JTextField();
		inputPanel.add(txtNama_3017);
		
		inputPanel.add(new JLabel("NIM:"));
		txtNim_3017 = new JTextField();
		inputPanel.add(txtNim_3017);
		
		inputPanel.add(new JLabel("Program Studi:"));
		txtProdi_3017 = new JTextField();
		inputPanel.add(txtProdi_3017);
		
		JPanel tombolInputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 5));
		btnTambah_3017 = new JButton("Tambah Data");
		btnTambah_3017.setPreferredSize(new Dimension(120, 35));
		btnHapus_3017 = new JButton("Hapus Data");
		btnHapus_3017.setPreferredSize(new Dimension(120, 35));
		tombolInputPanel.add(btnTambah_3017);
		tombolInputPanel.add(btnHapus_3017);
		
		inputPanel.add(new JLabel(""));
		inputPanel.add(tombolInputPanel);
		
		// Tabel
		String[] columns = {"No", "Nama", "NIM", "Program Studi"};
		tableModel_3017 = new DefaultTableModel(columns, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table_3017 = new JTable(tableModel_3017);
		table_3017.setRowHeight(30);
		table_3017.setFont(new Font("Arial", Font.PLAIN, 13));
		table_3017.getTableHeader().setFont(new Font("Arial", Font.BOLD, 13));
		
		JScrollPane tableScroll = new JScrollPane(table_3017);
		tableScroll.setBorder(BorderFactory.createTitledBorder("Daftar Mahasiswa"));
		tableScroll.setPreferredSize(new Dimension(600, 400));
		
		rightPanel.add(inputPanel, BorderLayout.NORTH);
		rightPanel.add(tableScroll, BorderLayout.CENTER);
		
		// ==================== SPLIT PANE ====================
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
		splitPane.setDividerLocation(550);
		splitPane.setDividerSize(5);
		splitPane.setContinuousLayout(true);
		
		add(splitPane, BorderLayout.CENTER);
		
		// ==================== STATUS BAR ====================
		JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
		statusBar.setBackground(new Color(240, 240, 240));
		statusBar.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		statusBar.setPreferredSize(new Dimension(getWidth(), 30));
		
		JLabel statusLabel = new JLabel("✓ Siap | Pilih algoritma sorting, lalu klik 'Mulai Sorting' | Gunakan 'Langkah Selanjutnya' untuk melihat proses sorting");
		statusLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		statusBar.add(statusLabel);
		add(statusBar, BorderLayout.SOUTH);
		
		// Set awal tombol tidak aktif
		btnStep_3017.setEnabled(false);
		btnSort_3017.setEnabled(false);
		
		// Refresh tabel
		refreshTable();
		
		// ==================== EVENT HANDLER ====================
		btnTambah_3017.addActionListener(e -> tambahData());
		btnHapus_3017.addActionListener(e -> hapusData());
		comboAlgoritma_3017.addActionListener(e -> updateButtonState());
		btnSort_3017.addActionListener(e -> mulaiSorting());
		btnStep_3017.addActionListener(e -> langkahSelanjutnya());
		btnReset_3017.addActionListener(e -> resetSemua());
	}
	
	// ==================== METHOD-METHOD ====================
	
	private void tambahData() {
		String nama = txtNama_3017.getText().trim();
		String nim = txtNim_3017.getText().trim();
		String prodi = txtProdi_3017.getText().trim();
		
		if (nama.isEmpty() || nim.isEmpty() || prodi.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Harap isi semua data (Nama, NIM, Prodi)!", "Peringatan", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		Mahasiswa_2511533017 mhs = new Mahasiswa_2511533017(nama, nim, prodi);
		dataList_3017.add(mhs);
		refreshTable();
		
		txtNama_3017.setText("");
		txtNim_3017.setText("");
		txtProdi_3017.setText("");
		txtNama_3017.requestFocus();
		
		updateButtonState();
		JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void hapusData() {
		int row = table_3017.getSelectedRow();
		if (row == -1) {
			JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus dari tabel!", "Peringatan", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		String nama = (String) tableModel_3017.getValueAt(row, 1);
		int confirm = JOptionPane.showConfirmDialog(this, "Hapus data '" + nama + "'?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
		
		if (confirm == JOptionPane.YES_OPTION) {
			dataList_3017.remove(row);
			refreshTable();
			updateButtonState();
		}
	}
	
	private void refreshTable() {
		tableModel_3017.setRowCount(0);
		for (int i = 0; i < dataList_3017.size(); i++) {
			Mahasiswa_2511533017 m = dataList_3017.get(i);
			tableModel_3017.addRow(new Object[]{i + 1, m.getNama_3017(), m.getNim_3017(), m.getProdi_3017()});
		}
	}
	
	private void refreshTableWorking() {
		tableModel_3017.setRowCount(0);
		for (int i = 0; i < workingList_3017.size(); i++) {
			Mahasiswa_2511533017 m = workingList_3017.get(i);
			tableModel_3017.addRow(new Object[]{i + 1, m.getNama_3017(), m.getNim_3017(), m.getProdi_3017()});
		}
	}
	
	private void updateButtonState() {
		boolean adaData = !dataList_3017.isEmpty();
		String pilihan = (String) comboAlgoritma_3017.getSelectedItem();
		btnSort_3017.setEnabled(adaData && !pilihan.equals("Pilih Algoritma"));
	}
	
	private void mulaiSorting() {
		if (dataList_3017.isEmpty()) return;
		
		selectedAlgorithm_3017 = (String) comboAlgoritma_3017.getSelectedItem();
		workingList_3017 = new ArrayList<>(dataList_3017);
		isSorting_3017 = true;
		stepCounter_3017 = 1;
		
		btnStep_3017.setEnabled(true);
		btnSort_3017.setEnabled(false);
		comboAlgoritma_3017.setEnabled(false);
		btnTambah_3017.setEnabled(false);
		btnHapus_3017.setEnabled(false);
		
		logArea_3017.setText("");
		logArea_3017.append("========================================\n");
		logArea_3017.append("     " + selectedAlgorithm_3017.toUpperCase() + "\n");
		logArea_3017.append("========================================\n\n");
		logArea_3017.append("Data awal: " + listToString(workingList_3017) + "\n");
		logArea_3017.append("----------------------------------------\n\n");
		
		if (selectedAlgorithm_3017.equals("Insertion Sort")) {
			insertionI_3017 = 1;
			insertionPhase_3017 = 0;
		} else if (selectedAlgorithm_3017.equals("Selection Sort")) {
			selectionI_3017 = 0;
			selectionJ_3017 = 1;
			selectionPhase_3017 = 0;
		} else if (selectedAlgorithm_3017.equals("Bubble Sort")) {
			bubbleI_3017 = 0;
			bubbleJ_3017 = 0;
			bubblePhase_3017 = 0;
		}
	}
	
	private void langkahSelanjutnya() {
		if (!isSorting_3017) return;
		
		switch (selectedAlgorithm_3017) {
			case "Insertion Sort":
				stepInsertionSort();
				break;
			case "Selection Sort":
				stepSelectionSort();
				break;
			case "Bubble Sort":
				stepBubbleSort();
				break;
		}
		
		refreshTableWorking();
	}
	
	private void stepInsertionSort() {
		if (insertionI_3017 >= workingList_3017.size()) {
			sortingSelesai();
			return;
		}
		
		if (insertionPhase_3017 == 0) {
			insertionKey_3017 = workingList_3017.get(insertionI_3017);
			insertionJ_3017 = insertionI_3017 - 1;
			logArea_3017.append("Langkah " + stepCounter_3017 + ": Memproses '" + insertionKey_3017.getNama_3017() + "'\n");
			insertionPhase_3017 = 1;
		} 
		else if (insertionPhase_3017 == 1) {
			if (insertionJ_3017 >= 0 && 
				workingList_3017.get(insertionJ_3017).getNama_3017().compareToIgnoreCase(insertionKey_3017.getNama_3017()) > 0) {
				
				workingList_3017.set(insertionJ_3017 + 1, workingList_3017.get(insertionJ_3017));
				logArea_3017.append("   -> Geser '" + workingList_3017.get(insertionJ_3017 + 1).getNama_3017() + "' ke kanan\n");
				insertionJ_3017--;
			} else {
				insertionPhase_3017 = 2;
			}
		}
		else if (insertionPhase_3017 == 2) {
			workingList_3017.set(insertionJ_3017 + 1, insertionKey_3017);
			logArea_3017.append("   -> Sisipkan '" + insertionKey_3017.getNama_3017() + "'\n");
			logArea_3017.append("   Hasil: " + listToString(workingList_3017) + "\n\n");
			
			insertionI_3017++;
			insertionPhase_3017 = 0;
			stepCounter_3017++;
			
			if (insertionI_3017 >= workingList_3017.size()) {
				sortingSelesai();
			}
		}
	}
	
	private void stepSelectionSort() {
		if (selectionI_3017 >= workingList_3017.size() - 1) {
			sortingSelesai();
			return;
		}
		
		if (selectionPhase_3017 == 0) {
			if (selectionJ_3017 == selectionI_3017 + 1) {
				selectionMinIdx_3017 = selectionI_3017;
				logArea_3017.append("Langkah " + stepCounter_3017 + ": Pass " + (selectionI_3017 + 1) + "\n");
			}
			
			if (selectionJ_3017 < workingList_3017.size()) {
				if (workingList_3017.get(selectionJ_3017).getNama_3017().compareToIgnoreCase(
					workingList_3017.get(selectionMinIdx_3017).getNama_3017()) < 0) {
					selectionMinIdx_3017 = selectionJ_3017;
					logArea_3017.append("   -> Data terkecil: '" + workingList_3017.get(selectionMinIdx_3017).getNama_3017() + "'\n");
				}
				selectionJ_3017++;
			} else {
				selectionPhase_3017 = 1;
			}
		}
		else if (selectionPhase_3017 == 1) {
			if (selectionMinIdx_3017 != selectionI_3017) {
				Mahasiswa_2511533017 temp = workingList_3017.get(selectionI_3017);
				workingList_3017.set(selectionI_3017, workingList_3017.get(selectionMinIdx_3017));
				workingList_3017.set(selectionMinIdx_3017, temp);
				logArea_3017.append("   -> Tukar posisi\n");
			}
			logArea_3017.append("   Hasil Pass " + (selectionI_3017 + 1) + ": " + listToString(workingList_3017) + "\n\n");
			
			selectionI_3017++;
			selectionJ_3017 = selectionI_3017 + 1;
			selectionPhase_3017 = 0;
			stepCounter_3017++;
			
			if (selectionI_3017 >= workingList_3017.size() - 1) {
				sortingSelesai();
			}
		}
	}
	
	private void stepBubbleSort() {
		if (bubbleI_3017 >= workingList_3017.size() - 1) {
			sortingSelesai();
			return;
		}
		
		if (bubblePhase_3017 == 0) {
			if (bubbleJ_3017 == 0) {
				logArea_3017.append("Langkah " + stepCounter_3017 + ": Pass " + (bubbleI_3017 + 1) + "\n");
			}
			
			String kiri = workingList_3017.get(bubbleJ_3017).getNama_3017();
			String kanan = workingList_3017.get(bubbleJ_3017 + 1).getNama_3017();
			logArea_3017.append("   -> Bandingkan '" + kiri + "' vs '" + kanan + "'\n");
			
			if (kiri.compareToIgnoreCase(kanan) > 0) {
				bubblePhase_3017 = 1;
			} else {
				bubbleJ_3017++;
				if (bubbleJ_3017 >= workingList_3017.size() - 1 - bubbleI_3017) {
					logArea_3017.append("   Hasil Pass " + (bubbleI_3017 + 1) + ": " + listToString(workingList_3017) + "\n\n");
					bubbleI_3017++;
					bubbleJ_3017 = 0;
					stepCounter_3017++;
					if (bubbleI_3017 >= workingList_3017.size() - 1) {
						sortingSelesai();
					}
				}
			}
		}
		else if (bubblePhase_3017 == 1) {
			Mahasiswa_2511533017 temp = workingList_3017.get(bubbleJ_3017);
			workingList_3017.set(bubbleJ_3017, workingList_3017.get(bubbleJ_3017 + 1));
			workingList_3017.set(bubbleJ_3017 + 1, temp);
			logArea_3017.append("   -> Tukar posisi!\n");
			
			bubblePhase_3017 = 0;
			bubbleJ_3017++;
			
			if (bubbleJ_3017 >= workingList_3017.size() - 1 - bubbleI_3017) {
				logArea_3017.append("   Hasil Pass " + (bubbleI_3017 + 1) + ": " + listToString(workingList_3017) + "\n\n");
				bubbleI_3017++;
				bubbleJ_3017 = 0;
				stepCounter_3017++;
				if (bubbleI_3017 >= workingList_3017.size() - 1) {
					sortingSelesai();
				}
			}
		}
	}
	
	private void sortingSelesai() {
		logArea_3017.append("========================================\n");
		logArea_3017.append("        SORTING SELESAI!\n");
		logArea_3017.append("========================================\n");
		logArea_3017.append("Hasil akhir: " + listToString(workingList_3017) + "\n");
		
		isSorting_3017 = false;
		btnStep_3017.setEnabled(false);
		btnSort_3017.setEnabled(true);
		comboAlgoritma_3017.setEnabled(true);
		btnTambah_3017.setEnabled(true);
		btnHapus_3017.setEnabled(true);
		
		JOptionPane.showMessageDialog(this, "Sorting selesai! Data sudah terurut berdasarkan nama.", "Selesai", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void resetSemua() {
		dataList_3017.clear();
		workingList_3017.clear();
		refreshTable();
		logArea_3017.setText("");
		comboAlgoritma_3017.setSelectedIndex(0);
		btnStep_3017.setEnabled(false);
		btnSort_3017.setEnabled(false);
		comboAlgoritma_3017.setEnabled(true);
		btnTambah_3017.setEnabled(true);
		btnHapus_3017.setEnabled(true);
		isSorting_3017 = false;
		
		txtNama_3017.setText("");
		txtNim_3017.setText("");
		txtProdi_3017.setText("");
		
		JOptionPane.showMessageDialog(this, "Semua data telah direset!", "Reset", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private String listToString(ArrayList<Mahasiswa_2511533017> list) {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i).getNama_3017());
			if (i < list.size() - 1) sb.append(" -> ");
		}
		sb.append("]");
		return sb.toString();
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				SortingGUI_2511533017 frame = new SortingGUI_2511533017();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}