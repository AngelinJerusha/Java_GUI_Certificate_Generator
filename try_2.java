import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class try_2 {
    private JFrame frame;  // Added frame declaration
    private JLabel head,name, insti, loc, course, date ,sel_course,sel_location;
    private JTextField n, i, d;
    private JComboBox<String> cb;
    private JRadioButton r1, r2, r3, r4, r5;
    private String con[] = {"Afghanistan","Albania","Algeria","Andorra","Angola","Anguilla","Antigua &amp; Barbuda","Argentina","Armenia","Aruba","Australia","Austria","Azerbaijan","Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bermuda","Bhutan","Bolivia","Bosnia &amp; Herzegovina","Botswana","Brazil","British Virgin Islands","Brunei","Bulgaria","Burkina Faso","Burundi","Cambodia","Cameroon","Cape Verde","Cayman Islands","Chad","Chile","China","Colombia","Congo","Cook Islands","Costa Rica","Cote D Ivoire","Croatia","Cruise Ship","Cuba","Cyprus","Czech Republic","Denmark","Djibouti","Dominica","Dominican Republic","Ecuador","Egypt","El Salvador","Equatorial Guinea","Estonia","Ethiopia","Falkland Islands","Faroe Islands","Fiji","Finland","France","French Polynesia","French West Indies","Gabon","Gambia","Georgia","Germany","Ghana","Gibraltar","Greece","Greenland","Grenada","Guam","Guatemala","Guernsey","Guinea","Guinea Bissau","Guyana","Haiti","Honduras","Hong Kong","Hungary","Iceland","India","Indonesia","Iran","Iraq","Ireland","Isle of Man","Israel","Italy","Jamaica","Japan","Jersey","Jordan","Kazakhstan","Kenya","Kuwait","Kyrgyz Republic","Laos","Latvia","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg","Macau","Macedonia","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Mauritania","Mauritius","Mexico","Moldova","Monaco","Mongolia","Montenegro","Montserrat","Morocco","Mozambique","Namibia","Nepal","Netherlands","Netherlands Antilles","New Caledonia","New Zealand","Nicaragua","Niger","Nigeria","Norway","Oman","Pakistan","Palestine","Panama","Papua New Guinea","Paraguay","Peru","Philippines","Poland","Portugal","Puerto Rico","Qatar","Reunion","Romania","Russia","Rwanda","Saint Pierre &amp; Miquelon","Samoa","San Marino","Satellite","Saudi Arabia","Senegal","Serbia","Seychelles","Sierra Leone","Singapore","Slovakia","Slovenia","South Africa","South Korea","Spain","Sri Lanka","St Kitts &amp; Nevis","St Lucia","St Vincent","St. Lucia","Sudan","Suriname","Swaziland","Sweden","Switzerland","Syria","Taiwan","Tajikistan","Tanzania","Thailand","Timor L'Este","Togo","Tonga","Trinidad &amp; Tobago","Tunisia","Turkey","Turkmenistan","Turks &amp; Caicos","Uganda","Ukraine","United Arab Emirates","United Kingdom","Uruguay","Uzbekistan","Venezuela","Vietnam","Virgin Islands (US)","Yemen","Zambia","Zimbabwe"};
    private JButton b1,b2,b3,b4;

    public try_2() {
        frame = new JFrame("User Information Form"); // Initialize the frame
        head = new JLabel("Certificate Generator");
        name = new JLabel("Name:");
        insti = new JLabel("Institute name:");
        loc = new JLabel("Country:");
        course = new JLabel("Course:");
        date = new JLabel("Date(dd/mm/yyyy)");
        sel_course = new JLabel();
        sel_location = new JLabel();
        n = new JTextField(50);
        i = new JTextField(200);
        d = new JTextField(20);
        cb = new JComboBox<>(con);
        r1 = new JRadioButton("Signal Processing for Beginners");
        r2 = new JRadioButton("Machine Learning Ramp");
        r3 = new JRadioButton("C programming Fundamentals");
        r4 = new JRadioButton("UI/UX design for Beginners");
        r5 = new JRadioButton("Linux Fundamentals");
        b1 = new JButton("Certificate1");
        b2 = new JButton("Certificate2");
        b3 = new JButton("Certificate3");
        b4 = new JButton("Certificate4");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(r1);
        radioGroup.add(r2);
        radioGroup.add(r3);
        radioGroup.add(r4);
        radioGroup.add(r5);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = n.getText();
                String insti = i.getText();
                String date = d.getText(); 
                String sel_course1 = sel_course.getText();
                String sel_location1 = sel_location.getText();
                displayCertificate1(userName,insti,date,sel_course1,sel_location1);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = n.getText();
                String insti = i.getText();
                String date = d.getText(); 
                String sel_course1 = sel_course.getText();
                String sel_location1 = sel_location.getText();
                displayCertificate2(userName,insti,date,sel_course1,sel_location1);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = n.getText();
                String insti = i.getText();
                String date = d.getText(); 
                String sel_course1 = sel_course.getText();
                String sel_location1 = sel_location.getText();
                displayCertificate3(userName,insti,date,sel_course1,sel_location1);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = n.getText();
                String insti = i.getText();
                String date = d.getText(); 
                String sel_course1 = sel_course.getText();
                String sel_location1 = sel_location.getText();
                displayCertificate4(userName,insti,date,sel_course1,sel_location1);
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(head);
        panel.add(name);
        panel.add(insti);
        panel.add(loc);
        panel.add(course);
        panel.add(date);
        panel.add(n);
        panel.add(i);
        panel.add(d);
        panel.add(cb);
        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
        panel.add(r4);
        panel.add(r5);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);

        head.setBounds(200,10,200,30);
        name.setBounds(50, 50, 100, 30);
        insti.setBounds(50, 100, 100, 30);
        loc.setBounds(50, 150, 100, 30);
        course.setBounds(50, 200, 100, 30);
        date.setBounds(50, 370, 100, 30);
        n.setBounds(150, 50, 300, 30);
        i.setBounds(150, 100, 300, 30);
        cb.setBounds(150, 150, 300, 30);
        r1.setBounds(150, 200, 300, 30);
        r2.setBounds(150, 230, 300, 30);
        r3.setBounds(150, 260, 300, 30);
        r4.setBounds(150, 290, 300, 30);
        r5.setBounds(150, 320, 300, 30);
        d.setBounds(150, 370, 300, 30);
        b1.setBounds(30, 420, 100,30);
        b2.setBounds(150, 420, 100, 30);
        b3.setBounds(260, 420, 100,30);
        b4.setBounds(370, 420, 100, 30);


        frame.add(panel);
        frame.setTitle("Certificate Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        ActionListener actionListener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              if(e.getSource() instanceof JRadioButton){
                JRadioButton radioButton = (JRadioButton) e.getSource();
                if(radioButton.isSelected()){
                  sel_course.setText(radioButton.getText());
                }
              }
            }
          };
          r1.addActionListener(actionListener1);
          r2.addActionListener(actionListener1);
          r3.addActionListener(actionListener1);
          r4.addActionListener(actionListener1);
          r5.addActionListener(actionListener1);
          ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource() instanceof JComboBox){
                    JComboBox<String> comboBox = (JComboBox<String>)e.getSource();
                    Object selectedItem = comboBox.getSelectedItem();
                    if(comboBox != null){
                        sel_location.setText(selectedItem.toString());
                        
                    }
                }
            }
          };
          cb.addActionListener(actionListener2);

          
    }

    private void displayCertificate1(String userName,String insti, String date, String sel_course,String sel_location) {
        ImageIcon certi;
        JLabel myLabel;
        
        certi = new ImageIcon(this.getClass().getResource("/Cer_F.jpg"));
        myLabel = new JLabel(certi);
        myLabel.setSize(1000,708);
        
        JFrame certFrame = new JFrame("Certificate");
        certFrame.add(myLabel);
        JLabel certLabel1 = new JLabel(userName);
        certLabel1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel1.setBounds(400,250,700,50);
        myLabel.add(certLabel1);
        JLabel certLabel2 = new JLabel(insti);
        certLabel2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel2.setBounds(280,325,700,50);
        myLabel.add(certLabel2);
        JLabel certLabel3 = new JLabel(date);
        certLabel3.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel3.setBounds(800,480,700,50);
        myLabel.add(certLabel3);
        JLabel certLabel4 = new JLabel(sel_course);
        certLabel4.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel4.setBounds(405,375,700,50);
        myLabel.add(certLabel4);
        JLabel certLabel5 = new JLabel(sel_location);
        certLabel5.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel5.setBounds(100,480,700,50);
        myLabel.add(certLabel5);

        certFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        certFrame.setSize(1000, 708);
        certFrame.setVisible(true);
        certFrame.setLocationRelativeTo(null);

        
    }
    private void displayCertificate2(String userName,String insti, String date, String sel_course,String sel_location) {
        ImageIcon certi;
        JLabel myLabel;
        
        certi = new ImageIcon(this.getClass().getResource("/Cer_F1.jpg"));
        myLabel = new JLabel(certi);
        myLabel.setSize(1000,708);
        
        JFrame certFrame = new JFrame("Certificate");
        certFrame.add(myLabel);
        JLabel certLabel1 = new JLabel(userName);
        certLabel1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        certLabel1.setBounds(380,260,700,50);
        myLabel.add(certLabel1);
        JLabel certLabel2 = new JLabel(insti);
        certLabel2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        certLabel2.setBounds(300,330,700,50);
        myLabel.add(certLabel2);
        JLabel certLabel3 = new JLabel(date);
        certLabel3.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel3.setBounds(630,480,700,50);
        myLabel.add(certLabel3);
        JLabel certLabel4 = new JLabel(sel_course);
        certLabel4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        certLabel4.setBounds(440,353,700,50);
        myLabel.add(certLabel4);
        JLabel certLabel5 = new JLabel(sel_location);
        certLabel5.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel5.setBounds(270,480,700,50);
        myLabel.add(certLabel5);

        certFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        certFrame.setSize(1000, 708);
        certFrame.setVisible(true);
        certFrame.setLocationRelativeTo(null);

        
    }
        private void displayCertificate3(String userName,String insti, String date, String sel_course,String sel_location) {
        ImageIcon certi;
        JLabel myLabel;
        
        certi = new ImageIcon(this.getClass().getResource("/Cer_2.jpg"));
        myLabel = new JLabel(certi);
        myLabel.setSize(1000,708);
        
        JFrame certFrame = new JFrame("Certificate");
        certFrame.add(myLabel);
        JLabel certLabel1 = new JLabel(userName);
        certLabel1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel1.setForeground(Color.WHITE);
        certLabel1.setBounds(400,250,700,50);
        myLabel.add(certLabel1);
        JLabel certLabel2 = new JLabel(insti);
        certLabel2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel2.setForeground(Color.WHITE);
        certLabel2.setBounds(300,340,700,50);
        myLabel.add(certLabel2);
        JLabel certLabel3 = new JLabel(date);
        certLabel3.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel3.setForeground(Color.WHITE);
        certLabel3.setBounds(620,500,700,50);
        myLabel.add(certLabel3);
        JLabel certLabel4 = new JLabel(sel_course);
        certLabel4.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel4.setForeground(Color.WHITE);
        certLabel4.setBounds(400,400,700,50);
        myLabel.add(certLabel4);
        JLabel certLabel5 = new JLabel(sel_location);
        certLabel5.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel5.setBounds(240,500,700,50);
        certLabel5.setForeground(Color.WHITE);
        myLabel.add(certLabel5);
        
        certFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        certFrame.setSize(1000, 708);
        certFrame.setVisible(true);
        certFrame.setLocationRelativeTo(null);

        
    }
        private void displayCertificate4(String userName,String insti, String date, String sel_course,String sel_location) {
        ImageIcon certi;
        JLabel myLabel;
        
        certi = new ImageIcon(this.getClass().getResource("/Cer_3.jpg"));
        myLabel = new JLabel(certi);
        myLabel.setSize(1000,708);
        
        JFrame certFrame = new JFrame("Certificate");
        certFrame.add(myLabel);
        JLabel certLabel1 = new JLabel(userName);
        certLabel1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel1.setBounds(400,240,700,50);
        myLabel.add(certLabel1);
        JLabel certLabel2 = new JLabel(insti);
        certLabel2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel2.setBounds(280,320,700,50);
        myLabel.add(certLabel2);
        JLabel certLabel3 = new JLabel(date);
        certLabel3.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel3.setBounds(280,510,700,50);
        myLabel.add(certLabel3);
        JLabel certLabel4 = new JLabel(sel_course);
        certLabel4.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel4.setBounds(350,395,700,50);
        myLabel.add(certLabel4);
        JLabel certLabel5 = new JLabel(sel_location);
        certLabel5.setFont(new Font("Times New Roman", Font.BOLD, 25));
        certLabel5.setBounds(175,510,700,50);
        myLabel.add(certLabel5);

        certFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        certFrame.setSize(1000, 708);
        certFrame.setVisible(true);
        certFrame.setLocationRelativeTo(null);

        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new try_2();
            }
        });
    }
}
