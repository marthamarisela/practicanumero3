/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo3;

import java.awt.Color;
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
public class VentanaDatos extends JFrame{
     private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
   
    
    
    public VentanaDatos(String title) throws HeadlessException {
        super(title);
        this.setSize(500,600);
        this.setLocation(600, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
 public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(14,2));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        
    }
    
    public void iniciarPaneles(){
        
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
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
        this.jPanel1.add(this.jPanelList.get(6));
        this.jPanel1.add(this.jPanelList.get(7));
        
         
    }
    
    
       public void iniciarEtiquetas(){
        
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Apellidos: "));
        this.jLabelList.add(new JLabel("ORTIZ TERREROS"));
        this.jLabelList.add(new JLabel("Nombres: "));
        this.jLabelList.add(new JLabel("JOSUE BENIGNO  "));
        this.jLabelList.add(new JLabel("Nacionalidad: *"));
        this.jLabelList.add(new JLabel("ECUATORIANA"));
        this.jLabelList.add(new JLabel("Genero: *"));
        this.jLabelList.add(new JLabel("MASCULINO"));
        this.jLabelList.add(new JLabel("Correo Electronico Personal: *"));
        this.jLabelList.add(new JLabel(" mortizi@yahoo.com"));
        this.jLabelList.add(new JLabel("Fecha de nacimiento: *"));
        this.jLabelList.add(new JLabel("01-09-1940"));
        this.jLabelList.add(new JLabel("Telefono domicilio: *"));
        this.jLabelList.add(new JLabel(" 072818314"));
        this.jLabelList.add(new JLabel("Telefono celular: * "));
        this.jLabelList.add(new JLabel("0984357604 "));
        
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(1).add(this.jLabelList.get(2));
        this.jPanelList.get(1).add(this.jLabelList.get(3));
        this.jPanelList.get(2).add(this.jLabelList.get(4));
        this.jPanelList.get(2).add(this.jLabelList.get(5));
        this.jPanelList.get(3).add(this.jLabelList.get(6));
        this.jPanelList.get(3).add(this.jLabelList.get(7));
        this.jPanelList.get(4).add(this.jLabelList.get(8));
        this.jPanelList.get(4).add(this.jLabelList.get(9));
        this.jPanelList.get(5).add(this.jLabelList.get(10));
        this.jPanelList.get(5).add(this.jLabelList.get(11));
        this.jPanelList.get(6).add(this.jLabelList.get(12));
        this.jPanelList.get(6).add(this.jLabelList.get(13));
        this.jPanelList.get(7).add(this.jLabelList.get(14));
        this.jPanelList.get(8).add(this.jLabelList.get(15));
        this.jPanelList.get(9).add(this.jLabelList.get(16));
        this.jPanelList.get(10).add(this.jLabelList.get(17));
        this.jPanelList.get(11).add(this.jLabelList.get(18));
        this.jPanelList.get(12).add(this.jLabelList.get(19));
        
    }
    
    public void iniciarTextos(){
        
        JTextField boton = new JTextField(10);
        
    }
}
