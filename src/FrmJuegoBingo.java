import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FrmJuegoBingo extends JFrame {

    String[] encabezados1 = { "Title 1", "Title 2", "Title 3", "Title 4" };
    String[] encabezados2 = { "Title 1", "Title 2", "Title 3", "Title 4" };
    JTextField txtDevolver;
    JComboBox cmbTabla;

    //metodo constructor
    public FrmJuegoBingo(){

        setSize(800, 450);
        setTitle("JUEGO BINGO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JTable tblJuegoBingo = new JTable();
        JScrollPane spJuegoBingo = new JScrollPane(tblJuegoBingo);
        spJuegoBingo.setBounds(15, 15, 240, 375);
        add(spJuegoBingo);

        DefaultTableModel dtm1 = new DefaultTableModel(null, encabezados1);
        tblJuegoBingo.setModel(dtm1);

        JButton btnIniciar = new JButton("INICIAR");
        btnIniciar.setBounds(290, 15, 100, 40);
        add(btnIniciar);

        JButton btnSacarBalota = new JButton("SACAR BALOTA");
        btnSacarBalota.setBounds(290, 85, 150, 40);
        add(btnSacarBalota);

        JLabel lblTotalTablas = new JLabel("Total Tablas");
        lblTotalTablas.setBounds(600, 15, 100, 40);
        add(lblTotalTablas);

        txtDevolver = new JTextField();
        txtDevolver.setBounds(700, 15, 60, 40);
        add(txtDevolver);

        JLabel lblTabla = new JLabel("Tabla");
        lblTabla.setBounds(290, 140, 100, 40);
        add(lblTabla);

        cmbTabla = new JComboBox();
        cmbTabla.setBounds(360, 140, 400, 40);
        add(cmbTabla);

        JTable tblTable = new JTable();
        JScrollPane spTable = new JScrollPane(tblTable);
        spTable.setBounds(290, 200, 470, 190);
        add(spTable);

        DefaultTableModel dtm2 = new DefaultTableModel(null, encabezados2);
        tblTable.setModel(dtm2);


    }
}
