import javax.swing.JOptionPane;

import Modelo.Partida.Partida;
import Modelo.Personaje.Personaje;

public class olvido {
	public boolean menuCombateRey(Partida partida, Personaje personaje) {
		
		if(protagonista.getVida() > 0) {
			while (!combateRey) {
				do {
					eleccionMenuCombateRey = "<html><div style=text align:left>" + partida.getReino().getNombreRey()
							+ " te esta desafiando �Que haras para derrotarle?" + "<br>" + "1.Hablar" + "<br>"
							+ "2.Esquivar" + "<br>" + "3.Defender" + "<br>" + "4.Desgastar" + "<br>"
							+ "5.Silencio</div></html>";
					switch (tryCatchInt(eleccionMenuCombateRey)) {
					case 1:
						partida.getReinos()[0].debilidad(partida.getReino().getRey());
						break;
					case 2:
						partida.getReinos()[1].debilidad(partida.getReino().getRey());
						break;
					case 3:
						partida.getReinos()[2].debilidad(partida.getReino().getRey());
						break;
					case 4:
						partida.getReinos()[3].debilidad(partida.getReino().getRey());
						break;
					case 5:
						partida.getReinos()[4].debilidad(partida.getReino().getRey());
						break;
					default:
						break;
					}
					
					if (partida.getReino().getRey().getVidaRey() == 0) {
						partida.getReino().setRey(null);
	
					} else {
						partida.getProtagonistaPartida().setAtaqueAProtagonista();
						JOptionPane.showMessageDialog(null, "<html><div style='text-align: left;'>�"
								+ partida.getReino().getRey() + " te ha quitado vida ten cuidado o moriras!</div></html>");
						if (partida.getProtagonistaPartida().getVida() == 0)
							mensajeHasMuerto(partida, partida.getReino().getRey());
						combateRey = true;
					}
					//Posible fallo de cuando matas al primer rey (probablemente poner una condición)
					while (();
	
				} while (partida.getReino().getRey() != null || !combateRey);
			}

		}
		return combateRey;
	}
}
