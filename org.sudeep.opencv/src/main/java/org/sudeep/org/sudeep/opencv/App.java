package org.sudeep.org.sudeep.opencv;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Welcome to OpenCV " + Core.VERSION);
        System.out.println(System.getProperty("java.library.path"));
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
         Mat m  = Mat.eye(3, 3, CvType.CV_8UC1);
        System.out.println("m = " + m.dump());
        
        
//        accessing camera
        VideoCapture capture = new VideoCapture();
        
     // Reading the next video frame from the camera 
        Mat matrix = new Mat(); 
        capture.read(matrix);
        System.out.println(matrix);
        
        
    }
}
