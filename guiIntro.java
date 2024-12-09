import javax.swing.JOptionPane;
public class guiIntro {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Enter your name");
    JOptionPane.showMessageDialog(null,"Hello " +name );

    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));
    JOptionPane.showMessageDialog(null, "You are "+age+" Year old");


    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
    JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
  }

}
