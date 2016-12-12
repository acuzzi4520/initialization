package guiPractice.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {
	
	String[] words;
	int[] wordSize;

	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
		words = text.split(text);
		wordSize = new int[words.length];
	}
	
	
	@Override
	public void update(Graphics2D g) {
		FontMetrics fm = g.getFontMetrics();
		for(int i = 0; i < words.length; i++){
			wordSize[i] = fm.stringWidth(words[i]);
		}
	}

}
