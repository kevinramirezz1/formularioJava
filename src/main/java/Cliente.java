
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Kevin Ramirezz
 */
public class Cliente {
    JFrame ventana;
    JLabel etiNombre, etiApellido, etiContacto, etiCorreo, etiUbicacion;
    JTextField txtNombre, txtApellido, txtContacto, txtCorreo, txtUbicacion;
    JButton btnCargar;
    
    
    public Cliente() {
        ventana= new JFrame ();
        
        
        //Sección de entrada
        etiNombre= new JLabel ("Nombre");
        etiNombre.setBounds(30, 30, 200, 30);
        ventana.add(etiNombre);
        
        etiApellido= new JLabel ("Apellido");
        etiApellido.setBounds(30, 70, 100, 30);
        ventana.add(etiApellido);
        
        etiContacto= new JLabel ("Contacto");
        etiContacto.setBounds(30, 130, 100, 30);
        ventana.add(etiContacto);
        
        etiCorreo= new JLabel ("Correo");
        etiCorreo.setBounds(30, 170, 100, 30);
        ventana.add(etiCorreo);
        
        etiUbicacion= new JLabel ("Ubicación");
        etiUbicacion.setBounds(30, 230, 100, 30);
        ventana.add(etiUbicacion);
        
        //sección de texto
            //Nombre
        txtNombre= new JTextField();
        txtNombre.setBounds(130, 30, 200, 30);
        ventana.add(txtNombre);
            //Apellido
        txtApellido= new JTextField();
        txtApellido.setBounds(130, 70, 200, 30);
        ventana.add(txtApellido);
            //Contacto
        txtContacto= new JTextField();
        txtContacto.setBounds(130, 130, 200, 30);
        ventana.add(txtContacto);
            //Correo Electronico
        txtCorreo= new JTextField();
        txtCorreo.setBounds(130, 170, 200, 30);
        ventana.add(txtCorreo);
            //Ubicación
        txtUbicacion= new JTextField();
        txtUbicacion.setBounds(130, 230, 200, 30);
        ventana.add(txtUbicacion);
        
        //sección de botón
        btnCargar= new JButton("Cargar");
        btnCargar.setBounds(135, 350, 100, 30);
        ventana.add(btnCargar);
        
        ventana.setSize(400,500);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(3);
        ventana.setVisible(true);
    }
    
    public void mostrarDatosConsola(){
        System.out.println("Hola " + txtNombre.getText()+ " " + txtApellido.getText() + " Bienvenido");
    }
    
    public  void mostrarDatosInterfa(){
        JOptionPane.showMessageDialog(this.ventana,"Hola " + txtNombre.getText() + "" + txtApellido.getText() + " Bienvenido");
    }
    
    public static void main(String [] args) {
        Cliente c= new Cliente();
    }

}
