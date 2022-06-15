package n3ex1;

import java.util.ArrayList;

public class Puntuacio {
    public static int calcularPuntuacio(ArrayList<Object> noticies, String tit){

        String titular = "";
        int puntuacio = 0;

        for (Object noticia : noticies){
            if (noticia instanceof NoticiaFutbol) {
                titular = ((NoticiaFutbol) noticia).titular;
                if (titular.equals(tit)) {
                    puntuacio = ((NoticiaFutbol) noticia).calcularPuntuacioNoticia(((NoticiaFutbol) noticia).competicio,
                            ((NoticiaFutbol) noticia).club,
                            ((NoticiaFutbol) noticia).jugador);
                    break;
                }
            } else if (noticia instanceof NoticiaBasquet) {
                titular = ((NoticiaBasquet) noticia).titular;
                if (titular.equals(tit)) {
                    puntuacio = ((NoticiaBasquet) noticia).calcularPuntuacioNoticia(((NoticiaBasquet) noticia).competicio,
                            ((NoticiaBasquet) noticia).club);
                    break;
                }
            } else if (noticia instanceof NoticiaTenis) {
                titular = ((NoticiaTenis) noticia).titular;
                if (titular.equals(tit)) {
                    puntuacio = ((NoticiaTenis) noticia).calcularPuntuacioNoticia(((NoticiaTenis) noticia).tenistes);
                    break;
                }
            } else if (noticia instanceof NoticiaF1) {
                titular = ((NoticiaF1) noticia).titular;
                if (titular.equals(tit)) {
                    puntuacio = ((NoticiaF1) noticia).calcularPuntuacioNoticia(((NoticiaF1) noticia).escuderia);
                    break;
                }
            } else if (noticia instanceof NoticiaMotociclisme) {
                titular = ((NoticiaMotociclisme) noticia).titular;
                if (titular.equals(tit)) {
                    puntuacio = ((NoticiaMotociclisme) noticia).calcularPuntuacioNoticia(((NoticiaMotociclisme) noticia).equip);
                    break;
                }
            }

        }

        return puntuacio;
    }
}
