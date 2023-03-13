package utils.PenTypes;

import utils.BrushSize;
import utils.Pen;

public class ThickPen implements Pen{
  final BrushSize brushSize = BrushSize.THICK;
  private String color = null;

  @Override
  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void draw(String content) {
    System.out.println("Desenhando conteúdo com traço cheio na cor " + this.color);
  }
}
