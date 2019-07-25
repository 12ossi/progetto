import java.awt.Dimension;
import java.awt.Container;
import javax.swing.JFrame; //Un oggetto di tipo JFrame costituisce infatti lo scheletro di una finestra grafica sulla quale dovranno essere opportunamente ospitate altre componenti grafiche(é invisibile)
import javax.swing.JLabel; //Un area di visualizzazione per una breve stringa di testo(Etichetta) o immagine ,essa non reagisce agli eveti di input

public class Prova1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloWorldSwingGUI");// costruttore che imposta il titolo della finestra
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// il programma termina quando la finestra viene chiusa

		JLabel label = new JLabel("Hello World!!!ooooooo");//crea una componente JLabel
		Container contPane = frame.getContentPane();// crea un oggetto Container che é in grado di contenere altre componenti AWT, il metodo getContentPnae restituisce il pannello del JFrame, per potervici mettere i controlli dell'interfaccia
		contPane.add(label);// aggiunge l'etichetta al content pane(cioè il pannello) del JFrame

		frame.setPreferredSize(new Dimension(800, 300));

		frame.setSize(new Dimension(800, 300)); // imposta le dimensioni iniziali della finestra
		frame.setSize(800, 300);

		frame.pack(); // calcola le dimensioni ed il layout della finestra in base a quelle delle componenti,nel farlo cerca di visualizzare tutte le componenti per intero
		frame.setVisible(true); //mostra o nasconde questo componente in base al valore del parametro boolean
	}

} // end class
