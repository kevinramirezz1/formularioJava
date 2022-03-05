
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kevin Ramirezz
 */
public class Control1 implements ActionListener{
    
    Cliente ventana;
    
    public Control1(){
        ventana= new Cliente();
        
        this.ventana.btnCargar.addActionListener(this);
    }
    
    
    
    

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(ventana.btnCargar)){
            ventana.mostrarDatosConsola();
            ventana.mostrarDatosInterfa();
        }
    }
    
    
        public static void main(String[] args) {
        Control1 ctrl= new Control1();
    } 
    
    
    
    
}
