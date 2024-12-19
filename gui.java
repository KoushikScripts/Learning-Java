import javax.swing.JOptionPane;

public class gui {
    public static void main (String[] agrs){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "hello "+name);
         
    }
}