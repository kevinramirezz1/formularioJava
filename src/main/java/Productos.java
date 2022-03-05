
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Kevin Ramirezz
 */
public class Productos {
    JFrame ventana;
    JLabel etiNombre,etiApellido, etiCorreo, etiNumTel, etiDireccion, etiCantidad, etiPago;;
    JTextField txtNombre, txtApellido, txtCorreo, txtNumTel, txtDireccion, txtCantidad, txtPago;
    JButton btnCargar;
    
    
    public Productos() {
        ventana= new JFrame ();
        
        
        //Sección de entrada
        etiNombre= new JLabel ("Nombre");
        etiNombre.setBounds(30, 30, 200, 30);
        ventana.add(etiNombre);
        
        etiApellido= new JLabel ("Apellido");
        etiApellido.setBounds(30, 70, 100, 30);
        ventana.add(etiApellido);
        
        etiCorreo= new JLabel ("Correo");
        etiCorreo.setBounds(30, 130, 100, 30);
        ventana.add(etiCorreo);
        
        etiNumTel= new JLabel ("Numero de tel:");
        etiNumTel.setBounds(30, 170, 100, 30);
        ventana.add(etiNumTel);
        
        etiDireccion= new JLabel ("Dirección");
        etiDireccion.setBounds(30, 230, 100, 30);
        ventana.add(etiDireccion);
        
        etiCantidad= new JLabel ("Cantidad");
        etiCantidad.setBounds(30, 270, 100, 30);
        ventana.add(etiCantidad);
        
        etiPago= new JLabel ("Forma de Pago");
        etiPago.setBounds(30, 330, 100, 30);
        ventana.add(etiPago);
        
        
        //sección de texto
            //Nombre
        txtNombre= new JTextField();
        txtNombre.setBounds(130, 30, 200, 30);
        ventana.add(txtNombre);
            //Apellido
        txtApellido= new JTextField();
        txtApellido.setBounds(130, 70, 200, 30);
        ventana.add(txtApellido);

        txtCorreo= new JTextField();
        txtCorreo.setBounds(130, 130, 200, 30);
        ventana.add(txtCorreo);
           
        txtNumTel= new JTextField();
        txtNumTel.setBounds(130, 170, 200, 30);
        ventana.add(txtNumTel);

        txtDireccion= new JTextField();
        txtDireccion.setBounds(130, 230, 200, 30);
        ventana.add(txtDireccion);
        
        txtCantidad= new JTextField();
        txtCantidad.setBounds(130, 270, 30, 30);
        ventana.add(txtCantidad);
        
        txtPago= new JTextField();
        txtPago.setBounds(130, 330, 200, 30);
        ventana.add(txtPago);
        
        //sección de botón
        btnCargar= new JButton("Cargar");
        btnCargar.setBounds(135, 380, 100, 30);
        ventana.add(btnCargar);
        
        ventana.setSize(400,500);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(3);
        ventana.setVisible(true);
    }
    
    public void mostrarDatosConsola(){
        System.out.println("Hola " + txtNombre.getText()+ " " + txtApellido.getText() + " Tu Pedido a sido enviado");
    }
    
    public void mostrarDatosInterfa(){
        JOptionPane.showMessageDialog(this.ventana, "Hola " + txtNombre.getText()+ " " + txtApellido.getText() + " Tu Pedido a sido enviado");
    }
    
     public static void main(String [] args) {
        Productos c= new Productos();
    }
    
}
