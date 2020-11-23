import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class DataScienceToolbox {
	private static MicroserviceButton[] services;
	
	private static void populateServices() {
		services = new MicroserviceButton[] {
				new MicroserviceButton("RStudio", new Runnable() {
					public void run() {
						System.out.println("RStudio");
						BareBonesBrowserLaunch.openURL("http://host.docker.internal:8787/");
					}
				}),
				new MicroserviceButton("Spyder", new Runnable() {
					public void run() {
						System.out.println("Spyder");
						BareBonesBrowserLaunch.openURL("http://host.docker.internal:6081/vnc.html?resize=downscale");
					}
				}),
				new MicroserviceButton("Orange", new Runnable() {
					public void run() {
						System.out.println("Orange");
						BareBonesBrowserLaunch.openURL("http://host.docker.internal:6901/");
					}
				}),
				new MicroserviceButton("Jupyter Notebook", new Runnable() {
					public void run() {
						System.out.println("Jupyter Notebook");
						BareBonesBrowserLaunch.openURL("http://host.docker.internal:8888/");
					}
				}),
				new MicroserviceButton("Tensorflow", new Runnable() {
					public void run() {
						System.out.println("Tensorflow");
						BareBonesBrowserLaunch.openURL("http://host.docker.internal:8889/");
					}
				}),
				new MicroserviceButton("Markdown", new Runnable() {
					public void run() {
						System.out.println("Markdown");
						BareBonesBrowserLaunch.openURL("http://host.docker.internal:12345/");
					}
				}),
				new MicroserviceButton("VSCode", new Runnable() {
					public void run() {
						System.out.println("VSCode");
						BareBonesBrowserLaunch.openURL("http://host.docker.internal:8443/");
					}
				}),
				new MicroserviceButton("SonarQube", new Runnable() {
					public void run() {
						System.out.println("SonarQube");
						BareBonesBrowserLaunch.openURL("http://host.docker.internal:9001/");
					}
				}),
				new MicroserviceButton("Hadoop", new Runnable() {
					public void run() {
						System.out.println("Hadoop");
						BareBonesBrowserLaunch.openURL("http://host.docker.internal:9000/");
					}
				}),
		};
	}
	
    public static void main(String[] args) {
        JFrame frame = new JFrame("Data Science Toolbox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
       

        JPanel centerPanel = new JPanel();
        centerPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        frame.getContentPane().add(BorderLayout.CENTER, centerPanel);

        centerPanel.add(Box.createVerticalGlue());
        JLabel label = new JLabel("Welcome to the Data Science Toolbox");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.add(label);
        label = new JLabel("Please run one of the following applications:");
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(label);
        /*centerPanel.add(Box.createVerticalGlue());
        JButton chooseFilesButton = new JButton("Choose Files");
        chooseFilesButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.add(chooseFilesButton);
        centerPanel.add(Box.createVerticalGlue());*/
        /*JButton constructButton = new JButton("Construct Inverted Indices");
        constructButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.add(constructButton);
        centerPanel.add(Box.createVerticalGlue());*/
        populateServices();
        for (JButton b : services) {
        	centerPanel.add(b);
        }
        
        centerPanel.add(Box.createVerticalGlue());

        frame.setVisible(true);
    }
}
