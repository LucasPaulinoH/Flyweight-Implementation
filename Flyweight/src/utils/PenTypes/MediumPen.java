package utils.PenTypes;

import utils.BrushSize;
import utils.Pen;

public class MediumPen implements Pen {
  final BrushSize brushSize = BrushSize.MEDIUM;
  private String color = null;

  @Override
  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void draw(String content) {
    System.out.println("Desenhando conteúdo com traço médio na cor " + this.color);
  }
}
