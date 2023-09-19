package uz.gita.university347;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;

public class Settings{
    static private Settings settings;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private static final String FILE_NAME = "INFO";
    private ArrayList<Integer> images = new ArrayList<>();
    private ArrayList<Integer> imagesFront = new ArrayList<>();
    private ArrayList<Integer> name = new ArrayList<>();
    private ArrayList<Integer> description = new ArrayList<>();
    private ArrayList<Integer> extraInfoBall = new ArrayList<>();
    private ArrayList<String> telegram = new ArrayList<>();
    private ArrayList<String> instagram = new ArrayList<>();
    private ArrayList<String> linkOliygoh = new ArrayList<>();
    private int SIZE;

    private Settings(Context context){
        sharedPreferences = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        setup();
    }

    public static Settings getInstance(){
        return settings;
    }
    public static void init(Context context){
        if (settings==null)
            settings = new Settings(context);
    }
    private void setup(){
        images.add(R.drawable.tatu);
        imagesFront.add(R.drawable.tatu_front);
        extraInfoBall.add(R.drawable.tatuball);
        name.add(R.string.tatu);
        description.add(R.string.tatu_descriptio);
        telegram.add("https://t.me/tuituz_official");
        instagram.add("https://www.instagram.com/tuit.official/");
        linkOliygoh.add("https://oliygoh.uz/oliygohlar/toshkent-axborot-texnologiyalari-universiteti");

        images.add(R.drawable.tsul);
        imagesFront.add(R.drawable.tsul_front);
        extraInfoBall.add(R.drawable.tsulball);
        name.add(R.string.tsul);
        description.add(R.string.tsul_description);
        telegram.add("https://t.me/tsulofficial");
        instagram.add("https://www.instagram.com/tsulofficial/");
        linkOliygoh.add("https://oliygoh.uz/oliygohlar/toshkent-davlat-yuridik-universiteti");


        images.add(R.drawable.milliy);
        imagesFront.add(R.drawable.milliy_front);
        extraInfoBall.add(R.drawable.milliyball);
        name.add(R.string.milliy);
        description.add(R.string.milliy_description);
        telegram.add("https://t.me/nuu_uz");
        instagram.add("https://www.instagram.com/nuu.uz");
        linkOliygoh.add("https://oliygoh.uz/oliygohlar/o-zbekiston-milliy-universiteti");

        images.add(R.drawable.uzswlu);
        imagesFront.add(R.drawable.uzswlu_front);
        extraInfoBall.add(R.drawable.uzswluball);
        name.add(R.string.uzswlu);
        description.add(R.string.uzswlu_description);
        telegram.add("https://t.me/UzSWLU");
        instagram.add("https://www.instagram.com/uzswlu_official/");
        linkOliygoh.add("https://oliygoh.uz/oliygohlar/o-zbekiston-davlat-jahon-tillari-universiteti");

        images.add(R.drawable.urdu);
        imagesFront.add(R.drawable.urdu_front);
        extraInfoBall.add(R.drawable.urduball);
        name.add(R.string.urdu);
        description.add(R.string.urdu_description);
        telegram.add("https://t.me/URDU_PRESSA");
        instagram.add("https://www.instagram.com/urdumatbuotxizmati/");
        linkOliygoh.add("https://oliygoh.uz/oliygohlar/urganch-davlat-universiteti");

        images.add(R.drawable.samdu);
        imagesFront.add(R.drawable.samdu_front);
        extraInfoBall.add(R.drawable.samduball);
        name.add(R.string.samdu);
        description.add(R.string.samdu_description);
        telegram.add("https://t.me/SamDUeduuz");
        instagram.add("https://www.instagram.com/SamDUeduuz/");
        linkOliygoh.add("https://oliygoh.uz/oliygohlar/samarqand-davlat-universiteti");

        images.add(R.drawable.khan);
        imagesFront.add(R.drawable.khan_front);
        extraInfoBall.add(R.drawable.khanball);
        name.add(R.string.khan);
        description.add(R.string.khan_description);
        telegram.add("https://t.me/j_khan347");
        instagram.add("https://www.instagram.com/j_khan347/");
        linkOliygoh.add("https://t.me/tatu1k");

        SIZE = name.size();
    }

    public int getSIZE() {
        return SIZE;
    }
    public int getImageFrontId(int i){
        return imagesFront.get(i);
    }

    public int getImageId(int i){
        return images.get(i);
    }
    public int getInfoBall(int i){
        return extraInfoBall.get(i);
    }
    public int getNameId(int i){
        return name.get(i);
    }
    public int getDescriptionId(int i){
        return description.get(i);
    }
    public String getTelegramLink(int i){
        return telegram.get(i);
    }
    public String getInstagramLink(int i){
        return instagram.get(i);
    }
    public String getOliygohLink(int i){
        return linkOliygoh.get(i);
    }
}
