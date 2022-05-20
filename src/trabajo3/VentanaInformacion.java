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
public class VentanaInformacion extends JFrame {
     private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JCheckBox> jCheckboxList;
    private JComboBox jComboBox1;
    
    
    public VentanaInformacion(String title) throws HeadlessException {
        super(title);
        this.setSize(500,600);
        this.setLocation(600, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setLayout(new GridLayout(9,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
         this.iniciarBotones();
         
        this.iniciarCombo();
        this.iniciarCombo1();
        this.iniciarCombo2();
        this.iniciarCombo3();
        this.iniciarCombo4();

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
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5)); 
         this.jPanel1.add(this.jPanelList.get(6));
        this.jPanel1.add(this.jPanelList.get(7)); 
        this.jPanel1.add(this.jPanelList.get(8)); 
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Periodo Academico :"));
         this.jLabelList.add(new JLabel("2022-2022"));
        this.jLabelList.add(new JLabel("Carrera:"));
        this.jLabelList.add(new JLabel("Modalidad:"));
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Campus: "));
        this.jLabelList.add(new JLabel("Jornada: "));
        this.jLabelList.add(new JLabel("Fecha de Registro: "));
         this.jLabelList.add(new JLabel("20/05/2022"));
       
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(1).add(this.jLabelList.get(2));
        this.jPanelList.get(2).add(this.jLabelList.get(3));
        this.jPanelList.get(3).add(this.jLabelList.get(4));
        this.jPanelList.get(4).add(this.jLabelList.get(5)); 
        this.jPanelList.get(5).add(this.jLabelList.get(6));
        this.jPanelList.get(6).add(this.jLabelList.get(7)); 
          this.jPanelList.get(6).add(this.jLabelList.get(8)); 
    
        
     }
      public void iniciarCombo(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("ARQUITECTURA");
        this.jComboBox1.addItem("INGENIERIA MECANICA");
        this.jComboBox1.addItem("ADMINISTRACION DE EMPRESAS");
        this.jComboBox1.addItem("AGROPECUARIA");
        this.jComboBox1.addItem("BIOMEDICINA ");
        this.jComboBox1.addItem("BIOTECNOLOGÍA");
        this.jComboBox1.addItem("COMPUTACIÓN");
        this.jComboBox1.addItem("COMUNICACIÓN");
        this.jComboBox1.addItem("CONTABILIDAD Y AUDITORIA ");
         this.jComboBox1.addItem("AGROPECUARIA");
        this.jComboBox1.addItem("DERECHO ");
        this.jComboBox1.addItem("DISEÑO MULTIMEDIA");
        this.jComboBox1.addItem("ECONOMIA");
        this.jComboBox1.addItem("EDUCACION BASICA");
        this.jComboBox1.addItem("EDUCACION INICIAL");
         this.jComboBox1.addItem("ELECTRICIDAD");
        this.jComboBox1.addItem("ELECTRONICA Y AUTOMATIZACION");
        this.jComboBox1.addItem("GESTION DE RIESGOS Y DESASTRES");
        this.jComboBox1.addItem("INGENIERIA MECANICA");
        this.jComboBox1.addItem("INGENIERIA AMBIENTAL");
        this.jComboBox1.addItem("INGENIERIA AUTOMOTRIZ");
        this.jComboBox1.addItem("INGENIERIA CIVIL ");
        this.jComboBox1.addItem("INGENIERIA INDUSTRIAL");
        this.jComboBox1.addItem("INGENIERIA MECATRONICA");
        this.jComboBox1.addItem("MEDICINA VETERINARIA");
        this.jComboBox1.addItem("PEDAGOGIA DE LA ACTIVIDAD ");
        this.jComboBox1.addItem("PSICOLOGIA");
        this.jComboBox1.addItem("TELECOMUNICACIONES");
        
        this.jPanelList.get(1).add(this.jComboBox1);
    
    }
      public void iniciarCombo1(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("PRESENCIAL");
        this.jComboBox1.addItem("SEMIPRESENCIAL");
        this.jComboBox1.addItem("VITUAL");
        
        
        this.jPanelList.get(2).add(this.jComboBox1);
      }
        public void iniciarCombo2(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("MATRIZ CUENCA");
        this.jComboBox1.addItem("SEDE QUITO");
        this.jComboBox1.addItem("SEDE GUAYAQUIL");
      
        
        this.jPanelList.get(3).add(this.jComboBox1);
        }
        public void iniciarCombo3(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("EL VECINO");
        this.jComboBox1.addItem("MARIA AUXILADORA");
        this.jComboBox1.addItem("GIRON");
       
        
        this.jPanelList.get(4).add(this.jComboBox1);
        }
    
      public void iniciarCombo4(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("SELECCIONE UNA OPCION");
        this.jComboBox1.addItem("MATUTINA");
        this.jComboBox1.addItem("VESPERTINA");
        this.jComboBox1.addItem("NOCTURNA");
        
        
        this.jPanelList.get(5).add(this.jComboBox1);
    
    }
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Siguiente"));
        this.jPanelList.get(8).add(this.jButtonList.get(0));
           
    }
}
