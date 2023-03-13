package utils.PenTypes;

import utils.BrushSize;
import utils.Pen;

public class ThinPen implements Pen{
  final BrushSize brushSize = BrushSize.THIN;
  private String color = null;

  @Override
  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void draw(String content) {
    System.out.println("Desenhando conteúdo com traço fino na cor " + this.color);
  }
}
