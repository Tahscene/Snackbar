package Common;
import javax.swing.JOptionPane;
import java.io.File;


public class OpenPdf {
    
  
    public static void openById(String id){
        try{
            if((new File("D:\\"+id+".pdf")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler D:\\"+id+".pdf");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
       
    }
    
}  
    
    
    
    
    
}
