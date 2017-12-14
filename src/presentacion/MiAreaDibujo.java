package presentacion;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JLabel;

public class MiAreaDibujo extends JLabel{

	private ArrayList<ObjetoGrafico> objetosGraficos = new ArrayList<ObjetoGrafico>();

	public MiAreaDibujo() {

	}

	void addObjetoGrafico(ObjetoGrafico objg) {
		objetosGraficos.add(objg);
	}

	public ObjetoGrafico getUltimoObjetoGrafico() {
		return objetosGraficos.get(objetosGraficos.size()-1);
	}

	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < objetosGraficos.size(); i++) {
			ObjetoGrafico objg = objetosGraficos.get(i);
			if (objg instanceof ImagenGrafico)
			{
				g.drawImage(((ImagenGrafico)objg).getImagen(), objg.getX(),
						objg.getY(), null);
			}else if (objg instanceof ClaseGrafica)
			{
				g.setColor(((ClaseGrafica)objg).getColor());
				int w = ((ClaseGrafica)objg).getX1() - objg.getX();
				int h = ((ClaseGrafica)objg).getY1() - objg.getY();
				//System.out.println("DEBUG");
				g.drawRect(objg.getX(),objg.getY(),w,h);
				g.fillRect(objg.getX(), objg.getY(), w, h);
				//objetosGraficos.remove(i);
				}else if(objg instanceof CDUGrafico) {
					g.setColor(((CDUGrafico)objg).getColor());
					int w = ((CDUGrafico)objg).getX1() - objg.getX();
					int h = ((CDUGrafico)objg).getY1() - objg.getY();
					
					g.drawOval(objg.getX(), objg.getY(), w, h);
					g.fillOval(objg.getX(), objg.getY(), w, h);
					//objetosGraficos.remove(i);
				}else if(objg instanceof DependenciaGrafica) {
					//System.out.println("Pintando dependencia");
					g.setColor(((DependenciaGrafica)objg).getColor());
					g.drawLine(objg.getX(), objg.getY(), ((DependenciaGrafica)objg).getX1(), ((DependenciaGrafica)objg).getY1());
					//objetosGraficos.remove(i);
				}else if(objg instanceof TextoGrafico) {
					g.setColor(((TextoGrafico)objg).getColor());
					String str = (((TextoGrafico)objg).getTexto());
					g.drawString(str, objg.getX(), objg.getY());
				}
		}
	}
}
