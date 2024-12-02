package javaaa;

 import javax.swing.ImageIcon;
 import javax.swing.JOptionPane;

      public class Javaaa {
 
   public static void main(String[] args) {
   
        ImageIcon icon = new ImageIcon("emote.jpg");         
      String name = JOptionPane.showInputDialog("Hi What's Your Name?"); 
           
   String[] responses={"I want advice"," I want to talk"};
   JOptionPane.showOptionDialog(null,"Hello Christian How can i help you?","A.I is always here for you",
           JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,responses,0);
   String[] responsess={"About Love?"," About Life?"};
   JOptionPane.showOptionDialog(null,"So what advice do you need?","A.I is always here for you"
           ,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,responsess,0);
   String input = JOptionPane.showInputDialog("Are you tired?");
   String inputs = JOptionPane.showInputDialog("Im sorry about that: )");
   JOptionPane.showMessageDialog(null,"I know you are tired learn to rest and not to quit,",
           "Advice about Life",JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,"Wag masyadong i-pressure ang sarili mo.","Advice about Life",JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,"Hindi naman kailangan perfect ang journey .","Advice about Life",JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,"Keep going,","Advice about Life",JOptionPane.INFORMATION_MESSAGE);
   JOptionPane.showMessageDialog(null,"Keep praying","Advice about Life",JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,"trust me,everything will be alright","Advice about Life",JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,"Cheer up Christian","Advice about Life",JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,"Apaka pogi mo pa naman","Advice about Life",JOptionPane.INFORMATION_MESSAGE);
         	
    }
}