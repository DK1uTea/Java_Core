package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.ThiSinh;
import model.Tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.awt.event.ActionEvent;

public class QLSVView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public QLSVModel model;
	public JTextField textField_MaThiSinhTimKiem;
	public JTable table;
	public JTextField textField_ID;
	public JTextField textField_HoVaTen;
	public JTextField textField_NgaySinh;
	public JTextField textField_Mon1;
	public JTextField textField_Mon2;
	public JTextField textField_Mon3;
	public ButtonGroup buttonGroup_gioiTinh;
	public JComboBox comboBox_QueQuan;
	public JComboBox comboBox_QueQuan_timKiem;
	public JRadioButton rdbtnNewRadioButton_Nam;
	public JRadioButton rdbtnNewRadioButton_Nu;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		this.model = new QLSVModel();
		this.setTitle("Quản lý thí sinh");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 706);
		
		ActionListener action = new QLSVController(this);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.addActionListener(action);
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.addActionListener(action);
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuOpen);
		
		JMenuItem menuSave = new JMenuItem("Save");
		menuSave.addActionListener(action);
		menuSave.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuSave);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.addActionListener(action);
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.addActionListener(action);
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuAbout);
		
		JMenuItem menuAboutMe  = new JMenuItem("About Me");
		menuAboutMe.addActionListener(action);
		menuAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuAbout.add(menuAboutMe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_QueQuan = new JLabel("Quên quán");
		label_QueQuan.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_QueQuan.setBounds(46, 13, 101, 23);
		contentPane.add(label_QueQuan);
		
		JLabel label_MaSinhVien = new JLabel("Mã sinh viên");
		label_MaSinhVien.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_MaSinhVien.setBounds(354, 13, 119, 23);
		contentPane.add(label_MaSinhVien);
		
		textField_MaThiSinhTimKiem = new JTextField();
		textField_MaThiSinhTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_MaThiSinhTimKiem.setBounds(474, 7, 129, 40);
		contentPane.add(textField_MaThiSinhTimKiem);
		textField_MaThiSinhTimKiem.setColumns(10);
		
		JButton btnTim = new JButton("Tìm");
		btnTim.addActionListener(action);
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTim.setBounds(640, 10, 89, 31);
		contentPane.add(btnTim);
		
		comboBox_QueQuan_timKiem = new JComboBox();
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		comboBox_QueQuan_timKiem.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_QueQuan_timKiem.addItem(tinh.getTenTinh());
		}
		comboBox_QueQuan_timKiem.setBounds(159, 7, 129, 40);
		contentPane.add(comboBox_QueQuan_timKiem);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 68, 844, 2);
		contentPane.add(separator_1);
		
		JLabel label_DanhSachThiSinh = new JLabel("Danh sách thí sinh");
		label_DanhSachThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_DanhSachThiSinh.setBounds(22, 83, 169, 31);
		contentPane.add(label_DanhSachThiSinh);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 19));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 th\u00ED sinh", "H\u1ECD t\u00EAn", "Qu\u00EAn qu\u00E1n", "Ng\u00E0y sinh", "Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3"
			}
		));
		table.setRowHeight(25);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 127, 844, 198);
		contentPane.add(scrollPane);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(12, 347, 844, 2);
		contentPane.add(separator_1_1);
		
		JLabel label_ThongTinThiSinh = new JLabel("Thông tin thí sinh");
		label_ThongTinThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_ThongTinThiSinh.setBounds(12, 357, 169, 31);
		contentPane.add(label_ThongTinThiSinh);
		
		JLabel label_ID = new JLabel("Mã sinh viên");
		label_ID.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_ID.setBounds(12, 392, 119, 23);
		contentPane.add(label_ID);
		
		textField_ID = new JTextField();
		textField_ID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_ID.setColumns(10);
		textField_ID.setBounds(132, 390, 206, 28);
		contentPane.add(textField_ID);
		
		JLabel label_HoVaTen = new JLabel("Họ và tên");
		label_HoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_HoVaTen.setBounds(12, 440, 119, 23);
		contentPane.add(label_HoVaTen);
		
		textField_HoVaTen = new JTextField();
		textField_HoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_HoVaTen.setColumns(10);
		textField_HoVaTen.setBounds(132, 438, 206, 28);
		contentPane.add(textField_HoVaTen);
		
		JLabel label_QueQuan_1 = new JLabel("Quê quán");
		label_QueQuan_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_QueQuan_1.setBounds(12, 487, 119, 23);
		contentPane.add(label_QueQuan_1);
		
		comboBox_QueQuan = new JComboBox();
		comboBox_QueQuan.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_QueQuan.addItem(tinh.getTenTinh());
		}
		comboBox_QueQuan.setBounds(132, 489, 206, 24);
		contentPane.add(comboBox_QueQuan);
		
		JLabel label_NgaySinh = new JLabel("Ngày sinh");
		label_NgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_NgaySinh.setBounds(12, 537, 119, 23);
		contentPane.add(label_NgaySinh);
		
		textField_NgaySinh = new JTextField();
		textField_NgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_NgaySinh.setColumns(10);
		textField_NgaySinh.setBounds(132, 535, 206, 28);
		contentPane.add(textField_NgaySinh);
		
		JLabel label_GioiTinh = new JLabel("Giới tính");
		label_GioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_GioiTinh.setBounds(476, 392, 74, 23);
		contentPane.add(label_GioiTinh);
		
		rdbtnNewRadioButton_Nam = new JRadioButton("Nam");
		rdbtnNewRadioButton_Nam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton_Nam.setBounds(576, 390, 60, 25);
		contentPane.add(rdbtnNewRadioButton_Nam);
		
		rdbtnNewRadioButton_Nu = new JRadioButton("Nữ");
		rdbtnNewRadioButton_Nu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton_Nu.setBounds(640, 390, 60, 25);
		contentPane.add(rdbtnNewRadioButton_Nu);
		
		buttonGroup_gioiTinh = new ButtonGroup();
		buttonGroup_gioiTinh.add(rdbtnNewRadioButton_Nam);
		buttonGroup_gioiTinh.add(rdbtnNewRadioButton_Nu);
		
		JLabel label_Mon1 = new JLabel("Môn 1");
		label_Mon1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_Mon1.setBounds(476, 437, 119, 23);
		contentPane.add(label_Mon1);
		
		textField_Mon1 = new JTextField();
		textField_Mon1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_Mon1.setColumns(10);
		textField_Mon1.setBounds(596, 435, 156, 28);
		contentPane.add(textField_Mon1);
		
		JLabel label_Mon2 = new JLabel("Môn 2");
		label_Mon2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_Mon2.setBounds(476, 487, 119, 23);
		contentPane.add(label_Mon2);
		
		textField_Mon2 = new JTextField();
		textField_Mon2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_Mon2.setColumns(10);
		textField_Mon2.setBounds(596, 485, 156, 28);
		contentPane.add(textField_Mon2);
		
		JLabel label_Mon3 = new JLabel("Môn 3");
		label_Mon3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_Mon3.setBounds(476, 534, 119, 23);
		contentPane.add(label_Mon3);
		
		textField_Mon3 = new JTextField();
		textField_Mon3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_Mon3.setColumns(10);
		textField_Mon3.setBounds(596, 532, 156, 28);
		contentPane.add(textField_Mon3);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(action);
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThem.setBounds(12, 588, 101, 31);
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(action);
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnXoa.setBounds(200, 588, 88, 31);
		contentPane.add(btnXoa);
		
		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.addActionListener(action);
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCapNhat.setBounds(378, 588, 130, 31);
		contentPane.add(btnCapNhat);
		
		JButton btnLuu = new JButton("Lưu");
		btnLuu.addActionListener(action);
		btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLuu.setBounds(596, 588, 89, 31);
		contentPane.add(btnLuu);
		
		JButton btnHuyBo = new JButton("Hủy bỏ");
		btnHuyBo.addActionListener(action);
		btnHuyBo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHuyBo.setBounds(745, 588, 111, 31);
		contentPane.add(btnHuyBo);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(12, 573, 844, 2);
		contentPane.add(separator_1_2);
		
		JButton btnHuyTim = new JButton("Hủy tìm");
		btnHuyTim.addActionListener(action);
		btnHuyTim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHuyTim.setBounds(750, 10, 106, 31);
		contentPane.add(btnHuyTim);
		
		this.setVisible(true);
	}

	public void xoaForm() {
		textField_ID.setText("");
		textField_HoVaTen.setText("");
		textField_NgaySinh.setText("");
		textField_Mon1.setText("");
		textField_Mon2.setText("");
		textField_Mon3.setText("");
		comboBox_QueQuan.setSelectedIndex(-1);
		buttonGroup_gioiTinh.clearSelection();
	}
	
	public void themThiSinhVaoTable(ThiSinh ts) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		model_table.addRow(new Object[] {ts.getMaThiSinh() + "", 
				ts.getTenThiSinh(), 
				ts.getQueQuan().getTenTinh(),
				ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/" + (ts.getNgaySinh().getYear()+1900),
				(ts.isGioiTinh()?"Nam":"Nữ"),
				ts.getDiemMon1() + "",
				ts.getDiemMon2() + "",
				ts.getDiemMon3() + ""
				});
	}
	
	public void themHoacCapNhatThiSinh(ThiSinh ts) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		if(!this.model.kiemTraTonTai(ts)) {
			this.model.insert(ts);
			this.themThiSinhVaoTable(ts);
		}
		else {
			this.model.update(ts);
			int soLuongDong = model_table.getRowCount();
			for(int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0)+"";
				if(id.equals(ts.getMaThiSinh()+"")) {
					model_table.setValueAt(ts.getMaThiSinh()+"", i, 0);
					model_table.setValueAt(ts.getTenThiSinh()+"", i, 1);
					model_table.setValueAt(ts.getQueQuan().getTenTinh()+"", i, 2);
					model_table.setValueAt(ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/" + (ts.getNgaySinh().getYear()+1900), i, 3);
					model_table.setValueAt((ts.isGioiTinh()?"Nam":"Nữ"), i, 4);
					model_table.setValueAt(ts.getDiemMon1() + "", i, 5);
					model_table.setValueAt(ts.getDiemMon2() + "", i, 6);
					model_table.setValueAt(ts.getDiemMon3() + "", i, 7);
				}
			}
		}
	}

	
	public ThiSinh getThiSinhDangChon() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		
		int maThiSinh = Integer.valueOf(model_table.getValueAt(i_row, 0)+"");
		String tenThiSinh = model_table.getValueAt(i_row, 1) + "";
		Tinh tinh = Tinh.getTinhByTen(model_table.getValueAt(i_row, 2)+"");
		//Date ngaySinh = new Date(this.view.textField_NgaySinh.getText());
		String dateString = model_table.getValueAt(i_row, 3)+"";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ngaySinh = LocalDate.parse(dateString, formatter);
		// Convert LocalDate to Date
		Date dateNgaySinh = Date.valueOf(ngaySinh);
		String textGioiTinh = model_table.getValueAt(i_row, 4)+"";
		boolean gioiTinh = textGioiTinh.equals("Nam");
		float diemMon1 = Float.valueOf(model_table.getValueAt(i_row, 5)+"");
		float diemMon2 = Float.valueOf(model_table.getValueAt(i_row, 6)+"");
		float diemMon3 = Float.valueOf(model_table.getValueAt(i_row, 7)+"");
		
		ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, dateNgaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
		return ts;
	}
	
	public void hienThiThongTinThiSinhDaChon() {
		ThiSinh ts = getThiSinhDangChon();
		
		this.textField_ID.setText(ts.getMaThiSinh()+"");
		this.textField_HoVaTen.setText(ts.getTenThiSinh());
		this.comboBox_QueQuan.setSelectedItem(ts.getQueQuan().getTenTinh());
		String s_ngaySinh = ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/" + (ts.getNgaySinh().getYear()+1900);
		this.textField_NgaySinh.setText(s_ngaySinh+"");
		if(ts.isGioiTinh()) {
			rdbtnNewRadioButton_Nam.setSelected(true);
		}
		else {
			rdbtnNewRadioButton_Nu.setSelected(true);
		}
//		this.buttonGroup_gioiTinh.setSelected(null, gioiTinh);
		this.textField_Mon1.setText(ts.getDiemMon1()+"");
		this.textField_Mon2.setText(ts.getDiemMon2()+"");
		this.textField_Mon3.setText(ts.getDiemMon3()+"");
	}

	public void thucHienXoa() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa dòng đã chọn?");
		if(luaChon == JOptionPane.YES_OPTION) {
			ThiSinh ts = getThiSinhDangChon();
			this.model.delete(ts);
			model_table.removeRow(i_row);
		}
	}

	public void thucHienThemThiSinh() {
		// get du lieu
		int maThiSinh = Integer.valueOf(this.textField_ID.getText());
		String tenThiSinh = this.textField_HoVaTen.getText();
		int queQuan = this.comboBox_QueQuan.getSelectedIndex()-1;
		Tinh tinh = Tinh.getTinhById(queQuan);
		//Date ngaySinh = new Date(this.view.textField_NgaySinh.getText());
		String dateString = this.textField_NgaySinh.getText();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ngaySinh = LocalDate.parse(dateString, formatter);
		// Convert LocalDate to Date
		Date dateNgaySinh = Date.valueOf(ngaySinh);
		
		boolean gioiTinh = true;
		if(this.rdbtnNewRadioButton_Nam.isSelected()) {
			gioiTinh = true;
		}
		else if(this.rdbtnNewRadioButton_Nu.isSelected()) {
			gioiTinh = false;
		}
		float diemMon1 = Float.valueOf(this.textField_Mon1.getText());
		float diemMon2 = Float.valueOf(this.textField_Mon2.getText());
		float diemMon3 = Float.valueOf(this.textField_Mon3.getText());
		
		ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, dateNgaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
		
		this.themHoacCapNhatThiSinh(ts);
	}

	public void thucHienTim() {
		// Goi ham huy tim kiem
		this.thucHienTaiLaiDuLieu();
		
		// Thuc hien tim kiem
		int queQuan = this.comboBox_QueQuan_timKiem.getSelectedIndex()-1;
		String maThiSinhTimKiem = this.textField_MaThiSinhTimKiem.getText();
		
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int soLuongDong = model_table.getRowCount();
		Set<Integer> idCuaThiSinhCanXoa = new TreeSet<Integer>();
		if(queQuan >= 0) {
			Tinh tinhDaChon = Tinh.getTinhById(queQuan);
			for(int i = 0; i < soLuongDong; i++) {
				String tenTinh = model_table.getValueAt(i, 2)+"";
				String id = model_table.getValueAt(i, 0) + "";
				if(!tenTinh.equals(tinhDaChon.getTenTinh())) {
					idCuaThiSinhCanXoa.add(Integer.valueOf(id));
				}
			}
		}
		if(maThiSinhTimKiem.length() > 0) {
			for(int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				if(!id.equals(maThiSinhTimKiem)) {
					idCuaThiSinhCanXoa.add(Integer.valueOf(id));
				}
			}
		}
		
		for (Integer idCanXoa : idCuaThiSinhCanXoa) {
			soLuongDong = model_table.getRowCount();
			for(int i = 0; i < soLuongDong; i++) {
				String idTrongTable = model_table.getValueAt(i, 0)+"";
				
				if(idTrongTable.equals(idCanXoa.toString())) {
					try {
						model_table.removeRow(i);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
			}
		}
	}
	
	
	public void thucHienTaiLaiDuLieu() {
		while (true) {
			DefaultTableModel model_table = (DefaultTableModel) table.getModel();
			int soLuongDong = model_table.getRowCount();
			if(soLuongDong == 0) {
				break;
			}
			else {
				try {
					model_table.removeRow(0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		for ( ThiSinh ts : this.model.getDsThiSinh()) {
			this.themThiSinhVaoTable(ts);
		}
	}

	public void hienThiAbout() {
		JOptionPane.showMessageDialog(this, "Phần mềm quản lý thí sinh 1.0!");
	}

	public void thoatKhoiChuongTrinh() {
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát khỏi chương trình?",
				"Exit", JOptionPane.YES_NO_OPTION);
		if(luaChon == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	public void saveFile(String path) {
		try {
			this.model.setTenFile(path);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (ThiSinh ts : this.model.getDsThiSinh()) {
				oos.writeObject(ts);
			}
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void openFile(File file) {
		ArrayList<ThiSinh> ds = new ArrayList<ThiSinh>();
		try {
			this.model.setTenFile(file.getAbsolutePath());
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ThiSinh ts = null;
			while ((ts = (ThiSinh) ois.readObject()) != null) {
				ds.add(ts);
			}			
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.model.setDsThiSinh(ds);
	}
	
	public void thucHienSaveFile() {
		if(this.model.getTenFile().length() > 0) {
			saveFile(this.model.getTenFile());
		}
		else {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(this);

	        if (returnVal == JFileChooser.APPROVE_OPTION) {
	        	File file = fc.getSelectedFile();
	        	saveFile(file.getAbsolutePath());
	        } 
		}
	}

	public void thucHienOpenFile() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
        	File file = fc.getSelectedFile();
        	openFile(file);
        	thucHienTaiLaiDuLieu();
        } 
	}
}
