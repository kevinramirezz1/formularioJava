import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kevin Ramirezz
 */
public class Control2 implements ActionListener{
    
    Productos ventana;
    
    public Control2(){
        ventana= new Productos();
        
        this.ventana.btnCargar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(ventana.btnCargar)){
            ventana.mostrarDatosConsola();
            ventana.mostrarDatosInterfa();
        }
    }
    
    public static void main(String[] args){
        Control2 ctrl= new Control2();
    }
    
    
}
