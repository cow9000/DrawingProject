package art.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

import art.controller.Controller;

public class DrawingCanvas extends JPanel
{
	
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Rectangle> rectangleList;
	Controller app;
	
	private BufferedImage canvasImage;
	
	DrawingCanvas(Controller app){
		super();
		this.app = app;
		triangleList = new ArrayList<Polygon>();
		polygonList = new ArrayList<Polygon>();
		ellipseList = new ArrayList<Ellipse2D>();
		rectangleList = new ArrayList<Rectangle>();
		
		canvasImage = new BufferedImage(600,600,BufferedImage.TYPE_INT_ARGB);
		
		this.setMinimumSize(new Dimension(600,600));
		this.setPreferredSize(new Dimension(600,600));
		this.setMaximumSize(getPreferredSize());
	}
	
	public void addShape(Shape current) {
		if(current instanceof Polygon) {
			if(((Polygon)current).xpoints.length == 3) {
				triangleList.add((Polygon) current);
			}else {
				polygonList.add((Polygon) current);
			}
		}else if(current instanceof Ellipse2D) {
			ellipseList.add((Ellipse2D) current);
		}else {
			rectangleList.add((Rectangle) current);
		}
		
		updateImage();
	}
	
	public void clear() {}
	public void changeBackground() {}
	public void save() {}
	private Color randomColor() {}
	private void updateImage() {}
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		graphics.drawImage(canvasImage, 0, 0, null);
	}
}
