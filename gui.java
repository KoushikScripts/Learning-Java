// import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class gui {
    public static void main (String[] agrs){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
        JOptionPane.showMessageDialog(null, "You are "+age+ "Years old");
        
        double hight = Double.parseDouble(JOptionPane.showInputDialog("Enter your hight "));
        JOptionPane.showMessageDialog(null, "You are "+hight+ " foot tall");
        

    }
}