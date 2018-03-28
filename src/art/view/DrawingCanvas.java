package art.view;

import java.awt.Polygon;
import java.awt.Rectangle;
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
		
	}
}
