package oop.view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DesenhoView extends JFrame {
    private static final long serialVersionUID = 1L;

    private JTextArea area;

    public DesenhoView() {
        initComponents();
        initView();
        init();
    }

    public void desenhar(String desenho) {
        area.setText(desenho);
        this.setVisible(true);
    }

    public void limpar() {
        area.setText("");
    }

    private void init() {
        this.setTitle("Desenho");
        this.setSize(640, 480);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    private void initView() {
        JScrollPane painel = new JScrollPane(area);
        area.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
        area.setEditable(false);
        this.add(painel);
    }

    private void initComponents() {
        area = new JTextArea();
    }
}
