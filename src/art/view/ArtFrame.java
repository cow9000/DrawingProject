package art.view;

import javax.swing.JFrame;

import art.controller.Controller;

public class ArtFrame extends JFrame
{
	
	private ArtPanel appPanel;
	
	public ArtFrame(Controller app) {
		super();
		appPanel = new ArtPanel(app);
		
		setupFrame();
	}
	
	private void setupFrame() {
		this.setSize(1200,700);
		this.setContentPane(appPanel);
		this.setTitle("Art");
		this.setVisible(true);
	}

}
