/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo3;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class VentanaInscripccion extends JFrame {
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JCheckBox> jCheckboxList;
    private JComboBox jComboBox1;
    
    
    public VentanaInscripccion(String title) throws HeadlessException {
        super(title);
        this.setSize(500,600);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setLayout(new GridLayout(6,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarBotones();
        this.iniciarCombo();
        this.iniciarCombo1();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5)); 
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Seleccione una sede :"));
        this.jLabelList.add(new JLabel("Tipo Domumento: "));
        this.jLabelList.add(new JLabel("Ingrese su Identificacion: "));
     
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
         
    }
     public void iniciarCombo(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Matriz Cuenca");
        this.jComboBox1.addItem("Sede Quito");
        this.jComboBox1.addItem("Sede Guaquil");
        this.jComboBox1.addItem("Modalidad En Linea ");
        ;
        
        this.jPanelList.get(0).add(this.jComboBox1);
     }
     public void iniciarCombo1(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("CEDULA");
        this.jComboBox1.addItem("PASAPORTE");
        this.jComboBox1.addItem("CARNET");
        this.jComboBox1.addItem("LICENCIA");
        ;
        
        this.jPanelList.get(1).add(this.jComboBox1);
     }
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(0).setColumns(10);
        this.jPanelList.get(2).add(this.jTextFieldList.get(0));
    }
    
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Ingresar"));
        this.jPanelList.get(3).add(this.jButtonList.get(0));
          
    }
   
    
   
    
    
}

