import javax.swing.JOptionPane;

public class teste2 {

    public static void main (String[]args){
        
        //variables    
        String name;
        String nationality;
        String dream;
        
        //request information 
        name = JOptionPane.showInputDialog(null, "What is your Name?", JOptionPane.QUESTION_MESSAGE );
        nationality = JOptionPane.showInputDialog(null, "What is your Nationality?", JOptionPane.QUESTION_MESSAGE );
        dream = JOptionPane.showInputDialog(null, "What is your Biggest Dream?", JOptionPane.QUESTION_MESSAGE );
        
        //show information requested
        JOptionPane.showMessageDialog(null, name,"Name",  JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, nationality,"Nationality",  JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, dream,"Dream",  JOptionPane.INFORMATION_MESSAGE);
    }

    
}
