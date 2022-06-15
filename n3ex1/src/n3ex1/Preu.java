package n3ex1;

import java.util.ArrayList;

public class Preu {
    public static int calcularPreu(ArrayList<Object> noticies, String tit){

        String titular = "";
        int preu = 0;

        for (Object noticia : noticies){
            if (noticia instanceof NoticiaFutbol) {
                titular = ((NoticiaFutbol) noticia).titular;
                if (titular.equals(tit)) {
                    preu = ((NoticiaFutbol) noticia).calcularPreuNoticia(((NoticiaFutbol) noticia).competicio,
                            ((NoticiaFutbol) noticia).club,
                            ((NoticiaFutbol) noticia).jugador);
                    break;
                }
            } else if (noticia instanceof NoticiaBasquet) {
                titular = ((NoticiaBasquet) noticia).titular;
                if (titular.equals(tit)) {
                    preu = ((NoticiaBasquet) noticia).calcularPreuNoticia(((NoticiaBasquet) noticia).competicio,
                            ((NoticiaBasquet) noticia).club);
                    break;
                }
            } else if (noticia instanceof NoticiaTenis) {
                titular = ((NoticiaTenis) noticia).titular;
                if (titular.equals(tit)) {
                    preu = ((NoticiaTenis) noticia).calcularPreuNoticia(((NoticiaTenis) noticia).tenistes);
                    break;
                }
            } else if (noticia instanceof NoticiaF1) {
                titular = ((NoticiaF1) noticia).titular;
                if (titular.equals(tit)) {
                    preu = ((NoticiaF1) noticia).calcularPreuNoticia(((NoticiaF1) noticia).escuderia);
                    break;
                }
            } else if (noticia instanceof NoticiaMotociclisme) {
                titular = ((NoticiaMotociclisme) noticia).titular;
                if (titular.equals(tit)) {
                    preu = ((NoticiaMotociclisme) noticia).calcularPreuNoticia(((NoticiaMotociclisme) noticia).equip);
                    break;
                }
            }

        }

        return preu;
    }
}
