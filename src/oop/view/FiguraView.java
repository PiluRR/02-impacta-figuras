package oop.view;

import oop.model.Figura;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FiguraView extends JFrame {
    private JLabel figuraLabel;
    private JComboBox<Figura> figuraComboBox;
    private JLabel simboloLabel;
    private JTextField simboloTextField;
    private JLabel alturaLabel;
    private JSpinner alturaSpinner;
    private JLabel larguraLabel;
    private JSpinner larguraSpinner;
    private JButton desenharButton;
    private JButton limparButton;

    public FiguraView() {
        initComponents();
        initView();
        init();
        this.setVisible(true);
    }

    private void escolherFigura(ActionEvent e) {
        Figura f = (Figura) figuraComboBox.getSelectedItem();
        JOptionPane.showMessageDialog(null, "Escolheu" + f);
    }

    private void desenharFigura(ActionEvent e) {
        Figura f = (Figura) figuraComboBox.getSelectedItem();
        JOptionPane.showMessageDialog(null, f.desenhar());
    }

    private void limparFigura(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Limpou");
    }

    private void init() {
        figuraComboBox.addActionListener(e -> escolherFigura(e));
        desenharButton.addActionListener(e -> desenharFigura(e));
        limparButton.addActionListener(e -> limparFigura(e));
        this.setTitle("Impacta Figura");
        this.setSize(340, 150);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initView() {
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(0, 2));
        painel.add(figuraLabel);
        painel.add(figuraComboBox);
        painel.add(simboloLabel);
        painel.add(simboloTextField);
        painel.add(alturaLabel);
        painel.add(alturaSpinner);
        painel.add(larguraLabel);
        painel.add(larguraSpinner);
        painel.add(desenharButton);
        painel.add(limparButton);
        this.add(painel);
    }

    private void initComponents() {
        figuraLabel = new JLabel("Figura:");
        figuraComboBox = new FiguraComboBox();
        simboloLabel = new JLabel("Simbolo:");
        simboloTextField = new JTextField("*");
        alturaLabel = new JLabel("Altura:");
        alturaSpinner = new JSpinner(new SpinnerNumberModel(5, 0, 50, 1));
        larguraLabel = new JLabel("Largura:");
        larguraSpinner = new JSpinner(new SpinnerNumberModel(9, 0, 50, 1));
        desenharButton = new JButton("Desenhar");
        limparButton = new JButton("Limpar");
    }
}
