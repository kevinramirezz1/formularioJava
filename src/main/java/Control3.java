
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kevin Ramirezz
 */
public class Control3 implements ActionListener{
    
    Factura ventana;
    
    public Control3(){
        ventana= new Factura();
        
        this.ventana.btnCargar.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(ventana.btnCargar)){
            ventana.mostrarDatosConsola();
            ventana.mostrarDatosInterface();
        }
    }
    
    public static void main(String[] args){
        Control3 ctrl= new Control3();
    }
}
