package com.mongodb.notes;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.OutputStream;

public class JFrameWindow extends OutputStream {

    private JFrame jFrame;
    private JScrollPane jScrollPane;
    private JTextArea jTextArea;

    public JFrameWindow() {
        jFrame = new JFrame("Notes Application");
        jTextArea = new JTextArea();
        jScrollPane = new JScrollPane(jTextArea);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setBounds(400, 150, 1280, 768);
        jTextArea.setBackground(Color.BLACK);
        jTextArea.setForeground(Color.GREEN);
        jTextArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        jFrame.add(jScrollPane);
        jFrame.setVisible(true);
        jTextArea.setVisible(true);
        jTextArea.setEditable(false);
    }

    @Override
    public void write(int b) throws IOException {
        jTextArea.append(String.valueOf((char) b));
        jTextArea.setCaretPosition(jTextArea.getDocument().getLength());
    }
}
