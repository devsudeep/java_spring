package org.sudeep.org.sudeep.opencv;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

import javax.swing.*;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;

public class CamereAppLayout {
	JFrame f;

	CamereAppLayout() {
		
		
		
	}

	public JFrame getF() {
		return f;
	}

	public void setF(JFrame f) {
		this.f = f;
	}
	
	public static BufferedImage Mat2BufferedImage(Mat m) {
		// Method converts a Mat to a Buffered Image
		int type = BufferedImage.TYPE_BYTE_GRAY;
		if (m.channels() > 1) {
			type = BufferedImage.TYPE_3BYTE_BGR;
		}
		int bufferSize = m.channels() * m.cols() * m.rows();
		byte[] b = new byte[bufferSize];
		m.get(0, 0, b); // get all the pixels
		BufferedImage image = new BufferedImage(m.cols(), m.rows(), type);
		final byte[] targetPixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
		System.arraycopy(b, 0, targetPixels, 0, b.length);
		return image;
	}

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton camStart = new JButton("Start");
		camStart.setSize(20, 10);
		 
		JButton b9 = new JButton("9");
		// Create a new JLabel object vidpanel
		JLabel vidPanel = new JLabel();

		// assign vidPanel to jframe
		f.setContentPane(vidPanel);
		// set frame size
		f.setSize(100, 100);

		// make jframe visible
		f.setVisible(true);

		f.add(camStart);
		f.add(b9);
		f.add(vidPanel);

		
		
		// TODO Auto-generated method stub
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

		// Create new MAT object
		Mat frame = new Mat();

		// Create new VideoCapture object
		VideoCapture camera = new VideoCapture();
		camera.open(0, 0);
		// Create new JFrame object

  
		// assign vidPanel to jframe
		f.add(vidPanel);
		// set frame size
		f.setSize(2000, 4000);

		// make jframe visible
		f.setVisible(true);
		
		f.setLayout(new GridLayout(2, 2));
		// setting grid layout of 3 rows and 3 columns

		f.setSize(300, 300);
		f.setVisible(true);
		while (true) {
			// If next video frame is available
			if (camera.read(frame)) {
				
 				// Create new image icon object and convert Mat to Buffered Image
				ImageIcon image = new ImageIcon(Mat2BufferedImage(frame));
				// Update the image in the vidPanel
				vidPanel.setIcon(image);
				// Update the vidPanel in the JFrame
				vidPanel.repaint();

			}
		}
	}
}