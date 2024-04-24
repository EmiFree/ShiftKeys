package shiftkeys;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static String getGreeting() {
        return "hello";
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Shift keys");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        JTextArea inputField = new JTextArea(); 
        panel.add(inputField, BorderLayout.NORTH);
        inputField.setRows(10);

        JTextArea outputField = new JTextArea();
        panel.add(outputField, BorderLayout.SOUTH);
        outputField.setRows(10);
        outputField.setEditable(false);


        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c. gridx = 0;
        c.gridy = 0;
        JButton leftButton = new JButton("Shift Left");
        JButton rightButton = new JButton("Shift Right");
        buttonPanel.add(leftButton, c);
        c.gridx = 1;
        buttonPanel.add(rightButton, c);

        leftButton.addActionListener(e -> {
            String text = shiftLeftString(inputField.getText());
            outputField.setText(text);
            System.out.println("Text entered: " + text);
        });
        rightButton.addActionListener(e -> {
            String text = shiftRightString(inputField.getText());
            outputField.setText(text);
            System.out.println("Text entered: " + text);
        });

        panel.add(buttonPanel, BorderLayout.CENTER);
        
        frame.getContentPane().add(panel);
        frame.setSize(600, 800);
        frame.setVisible(true);
    }

    private static String shiftLeftString(String in) {

        Map<Character, Character> map = new HashMap<>();
            map.put('[', 'p');
            map.put('w', 'q');
            map.put('e', 'w');
            map.put('r', 'e');
            map.put('t', 'r');
            map.put('y', 't');
            map.put('u', 'y');
            map.put('i', 'u');
            map.put('o', 'i');
            map.put('p', 'o');
            map.put('s', 'a');
            map.put('d', 's');
            map.put('f', 'd');
            map.put('g', 'f');
            map.put('h', 'g');
            map.put('j', 'h');
            map.put('k', 'j');
            map.put('l', 'k');
            map.put(';', 'l');
            map.put('\'', ';');
            map.put('x', 'z');
            map.put('c', 'x');
            map.put('v', 'c');
            map.put('b', 'v');
            map.put('n', 'b');
            map.put('m', 'n');
            map.put(',', 'm');
            map.put('.', ',');
            map.put('/', '.');
            map.put('W', 'Q');
            map.put('E', 'W');
            map.put('R', 'E');
            map.put('T', 'R');
            map.put('Y', 'T');
            map.put('U', 'Y');
            map.put('I', 'U');
            map.put('O', 'I');
            map.put('P', 'O');
            map.put('{', 'P');
            map.put('S', 'A');
            map.put('D', 'S');
            map.put('F', 'D');
            map.put('G', 'F');
            map.put('H', 'G');
            map.put('J', 'H');
            map.put('K', 'J');
            map.put('L', 'K');
            map.put(':', 'L');
            map.put('"', ':');
            map.put('X', 'Z');
            map.put('C', 'X');
            map.put('V', 'C');
            map.put('B', 'V');
            map.put('N', 'B');
            map.put('M', 'N');
            map.put('<', 'M');
            map.put('>', '<');
            map.put('?', '>');

        StringBuilder result = new StringBuilder();
        
        for (char ch : in.toCharArray()) {
            if (map.containsKey(ch)) {
                result.append(map.get(ch));
            } else {
                result.append(ch); // Keep unchanged if not in the map
            }
        }
        return result.toString();
    }

    private static String shiftRightString(String in) {

        Map<Character, Character> map = new HashMap<>();
            map.put('p', '[');
            map.put('q', 'w');
            map.put('w', 'e');
            map.put('e', 'r');
            map.put('r', 't');
            map.put('t', 'y');
            map.put('y', 'u');
            map.put('u', 'i');
            map.put('i', 'o');
            map.put('o', 'p');
            map.put('a', 's');
            map.put('s', 'd');
            map.put('d', 'f');
            map.put('f', 'g');
            map.put('g', 'h');
            map.put('h', 'j');
            map.put('j', 'k');
            map.put('k', 'l');
            map.put('l', ';');
            map.put(';', '\'');
            map.put('z', 'x');
            map.put('x', 'c');
            map.put('c', 'v');
            map.put('v', 'b');
            map.put('b', 'n');
            map.put('n', 'm');
            map.put('m', ',');
            map.put(',', '.');
            map.put('.', '/');
            map.put('P', '{');
            map.put('Q', 'W');
            map.put('W', 'E');
            map.put('E', 'R');
            map.put('R', 'T');
            map.put('T', 'Y');
            map.put('Y', 'U');
            map.put('U', 'I');
            map.put('I', 'O');
            map.put('O', 'P');
            map.put('A', 'S');
            map.put('S', 'D');
            map.put('D', 'F');
            map.put('F', 'G');
            map.put('G', 'H');
            map.put('H', 'J');
            map.put('J', 'K');
            map.put('K', 'L');
            map.put('L', ':');
            map.put(':', '"');
            map.put('Z', 'X');
            map.put('X', 'C');
            map.put('C', 'V');
            map.put('V', 'B');
            map.put('B', 'N');
            map.put('N', 'M');
            map.put('M', '<');
            map.put('<', '>');
            map.put('>', '?');


        StringBuilder result = new StringBuilder();
        
        for (char ch : in.toCharArray()) {
            if (map.containsKey(ch)) {
                result.append(map.get(ch));
            } else {
                result.append(ch); // Keep unchanged if not in the map
            }
        }
        return result.toString();
    }
}

