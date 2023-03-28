import java.util.ArrayList;
public class Playlist {
    public static void main(String[] args){
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("\nLana Del Rey - Doin' Time");
        listaParaIlhaDeserta.add("\nSales - renee");
        listaParaIlhaDeserta.add("\nRadiohead - My Iron Lung");
        listaParaIlhaDeserta.add("\nMy Chemical Romance - Skylines and Turnstyles");
        listaParaIlhaDeserta.add("\nMF DOOM - Doomsday");
        listaParaIlhaDeserta.add("\nArctic Monkeys - Fluorescent Adolescent");
        listaParaIlhaDeserta.add("\nKendrick Lamar - Alright");
        listaParaIlhaDeserta.add("\nKanye West - Father Stretch My Hands Pt.1");
        listaParaIlhaDeserta.remove(2);
        listaParaIlhaDeserta.remove(2);
        listaParaIlhaDeserta.remove(3);
        int musicaA = 0;
        int musicaB = 1;
        String temp = listaParaIlhaDeserta.get(musicaA);
        listaParaIlhaDeserta.set(0, listaParaIlhaDeserta.get(musicaB));
        listaParaIlhaDeserta.set(musicaB, temp);
        System.out.println(listaParaIlhaDeserta);
    }
}