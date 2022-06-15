package n3ex1;

import java.util.ArrayList;

public class Eliminar {
    public static void eliminar(ArrayList<Object> noticies, String tit){

        String titular = "";

        for (Object noticia : noticies){
            if (noticia instanceof NoticiaFutbol) {
                titular = ((NoticiaFutbol) noticia).titular;
                if (titular.equals(tit)) {
                    noticies.remove(noticia);
                    break;
                }
            } else if (noticia instanceof NoticiaBasquet) {
                titular = ((NoticiaBasquet) noticia).titular;
                if (titular.equals(tit)) {
                    noticies.remove(noticia);
                    break;
                }
            } else if (noticia instanceof NoticiaTenis) {
                titular = ((NoticiaTenis) noticia).titular;
                if (titular.equals(tit)) {
                    noticies.remove(noticia);
                    break;
                }
            } else if (noticia instanceof NoticiaF1) {
                titular = ((NoticiaF1) noticia).titular;
                if (titular.equals(tit)) {
                    noticies.remove(noticia);
                    break;
                }
            } else if (noticia instanceof NoticiaMotociclisme) {
                titular = ((NoticiaMotociclisme) noticia).titular;
                if (titular.equals(tit)) {
                    noticies.remove(noticia);
                    break;
                }
            }

        }
    }
}
