
import java.util.ArrayList;
import javax.swing.*;
import java.io.*;

public class GymGUI {

    public static void main(String[] args) {
        ArrayList<membership> memberships = new ArrayList<>();

        JFrame frame = new JFrame("Gym Membership Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 500);
        frame.setResizable(true);
        frame.setBounds(100, 100, 900, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Name:");
        label.setBounds(100, 50, 200, 30);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(150, 50, 200, 30);
        frame.add(textField);

        JLabel FeeLabel = new JLabel("Fee:");
        FeeLabel.setBounds(100, 100, 200, 30);
        frame.add(FeeLabel);

        JTextField feeField = new JTextField();
        feeField.setBounds(150, 100, 200, 30);
        frame.add(feeField);

        JLabel durationLabel = new JLabel("Duration:");
        durationLabel.setBounds(100, 150, 200, 30);
        frame.add(durationLabel);

        JTextField durationField = new JTextField();
        durationField.setBounds(150, 150, 200, 30);
        frame.add(durationField);

        JLabel typLabeleLabel = new JLabel("Type:");
        typLabeleLabel.setBounds(100, 200, 200, 30);
        frame.add(typLabeleLabel);

        JTextField typeField = new JTextField();
        typeField.setBounds(150, 200, 200, 30);
        frame.add(typeField);

        JLabel SessionsLabel = new JLabel("Sessions:");
        SessionsLabel.setBounds(75, 250, 200, 30);
        frame.add(SessionsLabel);

        JTextField sessionsField = new JTextField();
        sessionsField.setBounds(150, 250, 200, 30);
        frame.add(sessionsField);

        JLabel trainerSlotsLabel = new JLabel("Trainer Slots:");
        trainerSlotsLabel.setBounds(70, 300, 200, 30);
        frame.add(trainerSlotsLabel);

        JTextField trainerSlotsField = new JTextField();
        trainerSlotsField.setBounds(150, 300, 200, 30);
        frame.add(trainerSlotsField);

        JLabel indexlabel = new JLabel("Index:");
        indexlabel.setBounds(100, 350, 200, 30);
        frame.add(indexlabel);

        JTextField indexField = new JTextField();
        indexField.setBounds(150, 350, 200, 30);
        frame.add(indexField);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(400, 50, 350, 300);
        frame.add(textArea);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(400, 50, 350, 300);
        frame.add(scrollPane);

        JButton BasicButton = new JButton("Basic Membership");
        BasicButton.setBounds(50, 400, 150, 30);
        frame.add(BasicButton);

        JButton PremiumButton = new JButton("Premium Membership");
        PremiumButton.setBounds(250, 400, 150, 30);
        frame.add(PremiumButton);

        JButton displayButton = new JButton("Display Memberships");
        displayButton.setBounds(450, 400, 150, 30);
        frame.add(displayButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(650, 400, 150, 30);
        frame.add(clearButton);

        BasicButton.addActionListener(e -> {
            String name = textField.getText();
            double fee = Double.parseDouble(feeField.getText());
            int duration = Integer.parseInt(durationField.getText());
            String type = typeField.getText();
            int sessions = Integer.parseInt(sessionsField.getText());

            BasicMembership basicMembership = new BasicMembership(name, fee, duration, type, sessions);
            memberships.add(basicMembership);

            JOptionPane.showMessageDialog(frame, "Name:" + basicMembership.getName() + "\nFee: " + basicMembership.getFee() + "\nDuration: "
                    + basicMembership.getDuration() + "\nType: " + basicMembership.getType() + "\nSessions: " + basicMembership.getSessions());
        });
        PremiumButton.addActionListener(e2 -> {
            String premiumName = textField.getText();
            double premiumFee = Double.parseDouble(feeField.getText());
            int premiumDuration = Integer.parseInt(durationField.getText());
            String premiumType = typeField.getText();
            int trainerSlots = Integer.parseInt(trainerSlotsField.getText());

            PremiumMembership premiumMembership = new PremiumMembership(premiumName, premiumFee, premiumDuration, premiumType, trainerSlots);
            memberships.add(premiumMembership);

            JOptionPane.showMessageDialog(frame, "Name:" + premiumMembership.getName() + "\nFee: " + premiumMembership.getFee() + "\nDuration: "
                    + premiumMembership.getDuration() + "\nType: " + premiumMembership.getType() + "\nTrainer Slots: " + premiumMembership.getTrainerSlot());
        }); 
                    clearButton.addActionListener(e4 -> {
                        textField.setText("");
                        feeField.setText("");
                        durationField.setText("");
                        typeField.setText("");
                        sessionsField.setText("");
                        trainerSlotsField.setText("");
                        indexField.setText("");
                        textArea.setText("");
        });

        displayButton.addActionListener(e3 -> {
            for (membership m : memberships) {
                textArea.append(m.display() + "\n");
            }
        });

        frame.setVisible(true);

         try(BufferedWriter bw = new BufferedWriter(new FileWriter("Membership.txt"))){
            if(memberships.isEmpty()){
                
            }
        }
        catch(Exception e){
            System.out.println("e");
        }

    }

}
