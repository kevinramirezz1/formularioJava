
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Kevin Ramirezz
 */
public class Factura {
    JFrame ventana;
    JLabel etiNPedido, etiNombre, etiTel, etiCorreo, etiDescripcion, etiTotal; 
    JTextField txtNPedido, txtNombre, txtTel, txtCorreo, txtDescripcion, txtTotal;
    JButton btnCargar;
    
    public Factura(){
        ventana= new JFrame();
        
        etiNombre= new JLabel ("Nombre");
        etiNombre.setBounds(30, 30, 200, 30);
        ventana.add(etiNombre);
        
        etiNPedido= new JLabel ("No. Pedido");
        etiNPedido.setBounds(30, 70, 200, 30);
        ventana.add(etiNPedido);
        
        etiTel= new JLabel ("Numero de Tel.");
        etiTel.setBounds(30, 130, 200, 30);
        ventana.add(etiTel);
        
        etiCorreo= new JLabel ("Correo");
        etiCorreo.setBounds(30, 170, 200, 30);
        ventana.add(etiCorreo);
        
        etiDescripcion= new JLabel ("Descripción");
        etiDescripcion.setBounds(30, 230, 200, 30);
        ventana.add(etiDescripcion);
        
        etiTotal= new JLabel ("Total");
        etiTotal.setBounds(30, 330, 200, 30);
        ventana.add(etiTotal);
        
        // seccion 2
        txtNombre= new JTextField();
        txtNombre.setBounds(130, 30, 200, 30);
        ventana.add(txtNombre);
        
        txtNPedido= new JTextField();
        txtNPedido.setBounds(130, 70, 30, 30);
        ventana.add(txtNPedido);
        
        txtTel= new JTextField();
        txtTel.setBounds(130, 130, 200, 30);
        ventana.add(txtTel);
        
        txtCorreo= new JTextField();
        txtCorreo.setBounds(130, 170, 200, 30);
        ventana.add(txtCorreo);
        
        txtDescripcion= new JTextField();
        txtDescripcion.setBounds(130, 230, 200, 60);
        ventana.add(txtDescripcion);
        
        txtTotal= new JTextField();
        txtTotal.setBounds(130, 330, 50, 30);
        ventana.add(txtTotal);
        
        //BOTON
        btnCargar= new JButton("Cargar");
        btnCargar.setBounds(135, 380, 100, 30);
        ventana.add(btnCargar);
        
        ventana.setSize(400, 500);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(3);
        ventana.setVisible(true);
    }
    
    public void mostrarDatosConsola(){
        System.out.println("Gracias por comprar " + txtNombre.getText() +"vuleve pronto");
    }
    
    public void mostrarDatosInterface(){
        JOptionPane.showMessageDialog(this.ventana, "Gracias por comprar " + txtNombre.getText() +"vuelve pronto");
    }
    
    public static void main(String[] args){
        Factura c= new Factura();
    }
    
}


