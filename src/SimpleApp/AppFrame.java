package SimpleApp;

import CompressorDecompressure.Compressor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.BorderLayout;
public class AppFrame extends JFrame implements ActionListener {
        int B_Width = 400;
        int B_height = 400;
        JButton Compress;
        JButton Decompress;

        AppFrame() {
            // add buttons
            //setPreferredSize(new Dimension(B_Width,B_height));
            setSize(400,400);
            setBackground(Color.red);
            this.setVisible(true);
            setResizable(false);
            Compress = new JButton("Please select a file to Compress");
            Compress.setBounds(50, 75, 300, 20);

            Compress.setVisible(true);
            Compress.setBackground(Color.white);
            Compress.addActionListener(this);
            Decompress = new JButton("Please select a file to Decompress");
            Decompress.setBounds(50, 100, 300, 20);
            Decompress.setVisible(true);
            Decompress.addActionListener(this);
            Decompress.setBackground(Color.white);
            this.add(Compress);
            this.add(Decompress);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Compress) {
                JFileChooser filechooser = new JFileChooser();
                int response = filechooser.showSaveDialog(null);
                if (response == JFileChooser.APPROVE_OPTION) {
                    File file = new File(String.valueOf(filechooser.getSelectedFile().getAbsoluteFile()));
                    System.out.println(file);
                    try {
                        Compressor.method(file);

                    } catch (Exception p) {
                        JOptionPane.showMessageDialog(null, p.toString());
                    }
                }
            }
            if (e.getSource() == Decompress) {
                JFileChooser filechooser = new JFileChooser();
                int response = filechooser.showSaveDialog(null);
                if (response == JFileChooser.APPROVE_OPTION) {
                    File file = new File(String.valueOf(filechooser.getSelectedFile().getAbsoluteFile()));
                    System.out.println(file);
                    try {
                        Compressor.method(file);

                    } catch (Exception p) {
                        JOptionPane.showMessageDialog(null, p.toString());
                    }
                }
            }
        }
}