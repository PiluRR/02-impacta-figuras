package oop.view;

import oop.model.Figura;
import oop.model.Quadrado;
import oop.model.Retangulo;
import oop.model.Triangulo;

import javax.swing.JComboBox;

public class FiguraComboBox extends JComboBox<Figura> {
    public FiguraComboBox() {
        super(new Figura[] {
                new Quadrado(),
                new Retangulo(),
                new Triangulo()
        });
    }
}
