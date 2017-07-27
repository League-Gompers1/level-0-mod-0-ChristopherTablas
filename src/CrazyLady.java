import java.net.URI;

import javax.swing.JOptionPane;

	public class CrazyLady {
		public static void main(String[] args) {
			// 1. Ask the user how many cats they have
			String answer = JOptionPane.showInputDialog("How many Cats do you have?");
			// 2. Convert their answer into an int
			int cats = Integer.parseInt(answer);
			// 3. If they have more than 3 cats, tell them they're a crazy cat lady
			if( cats > 3 ){
				JOptionPane.showMessageDialog(null, "your a crazy cat lady");
			}
			
			// 4. If they have 3 or less, call the method below to show them a cat video
			if( cats <= 3  ){
				playVideo("https://www.youtube.com/watch?v=lrvqjdMcjjQ");
				
			}
			// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
			if( cats == 0){
				playVideo("https://www.youtube.com/watch?v=tp_XQ7yp5cU");
			}
		}

		static void playVideo(String videoURL) {
			try {
				URI uri = new URI(videoURL);
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}


