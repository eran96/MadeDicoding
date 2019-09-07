package com.muhrizqi.submission2;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieData {
    private static ArrayList<String> getTitles(){
        String[] titles = {
                "Glass",
                "Hunter Killer",
                "Mary Poppins Returns",
                "Mortal Engines",
                "Preman Pensiun",
                "Robin Hood",
                "Spider-Man: Into the Spider-Verse",
                "The Girl in the Spider's Web",
                "The Mule",
                "Venom"

        };
        return new ArrayList<>(Arrays.asList(titles));
    }

    private static ArrayList<String> getOverView(){
        String[] overviews= {
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "Captain Glass of the USS Arkansas discovers that a coup d'état is taking place in Russia, so he and his crew join an elite group working on the ground to prevent a war.",
                "In Depression-era London, a now-grown Jane and Michael Banks, along with Michael's three children, are visited by the enigmatic Mary Poppins following a personal loss. Through her unique magical skills, and with the aid of her friend Jack, she helps the family rediscover the joy and wonder missing in their lives",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "Gobang kembali ke Bandung, mengundang teman-temannya, para mantan preman untuk bertemu kembali. Mereka yang diundang adalah Ujang, Murad, Pipit, Cecep, Bohim, Mang Uu, Dikdik dan Joni. Dikdik kemudian tidak jadi datang karena masalah dengan istrinya. Dalam pertemuan yang disebut “reuni kecil-kecilan” itu, Gobang meminta bantuan teman-temannya untuk melakukan penyelidikan, siapa pelaku pembantaian terhadap adik iparnya hingga tewas. Pelaku pembantaian kemudian diketahui adalah Darman dan kawan-kawan yang hanya sebagai orang suruhan. Dalang di balik kejadian itu ternyata teman mereka sendiri, sesama bekas anak buah Muslihat (Epy Kusnandar) yang sebenarnya juga sudah pensiun. Muslihat mencoba mencegah terjadinya perang saudara, tapi Gobang sudah terlanjur datang dengan membawa dendam, “darah dibayar darah, nyawa dibayar nyawa",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "In Stockholm, Sweden, hacker Lisbeth Salander is hired by Frans Balder, a computer engineer, to retrieve a program that he believes it is too dangerous to exist.",
                "Earl Stone, a man in his 80s, is broke, alone, and facing foreclosure of his business when he is offered a job that simply requires him to drive. Easy enough, but, unbeknownst to Earl, he’s just signed on as a drug courier for a Mexican cartel. He does so well that his cargo increases exponentially, and Earl hit the radar of hard-charging DEA agent Colin Bates.",
                "Seorang jurnalis, Eddie Brock (Tom Hardy) ingin melakukan sebuah investasi kasus terhadap penemuan yang dipimpin oleh Dr. Carlton Drake (Riz Ahmed). Karena investigasinya, Eddie mengunjungi lab milik Dr. Calrlton Drake. Semuanya ditujukan untuk membuktikan bahwa Dr. Carlton Drake sedang sedang melakukan tindakan jahat menggunakan Symbiote. Namun, sial bagi Eddie, organisme hidup ini masuk ke dalam tubuhnya. Eddie menemukan kekuatan super dalam dirinya yang mampu mengendalikan semua hal yang ia lakukan."
        };
        return new ArrayList<>(Arrays.asList(overviews));
    }

    private static ArrayList<String> getDates(){
        String[] dates = {
                "16/01/2019",
                "26/10/2018",
                "13/12/2018",
                "27/11/2018",
                "17/1/2019",
                "20/11//2018",
                "6/12/2018",
                "25/10/2018",
                "14/12/2018",
                "28/9/2018"

        };
        return new ArrayList<>(Arrays.asList(dates));
    }

    private static ArrayList<Double> getVoteAverages(){
        double[] averages = {
                65,
                63,
                66,
                60,
                66,
                58,
                84,
                60,
                66,
                66
        };
        ArrayList<Double> list = new ArrayList<>();
        for(Double aData : averages){
            list.add(aData);
        }
        return list;
    }

    private static ArrayList<Integer> getPosterPath(){
        Integer[] images ={
                R.drawable.poster_glass,
                R.drawable.poster_hunterkiller,
                R.drawable.poster_marrypopins,
                R.drawable.poster_mortalengine,
                R.drawable.poster_preman,
                R.drawable.poster_robinhood,
                R.drawable.poster_spiderman,
                R.drawable.poster_thegirl,
                R.drawable.poster_themule,
                R.drawable.poster_venom,
        };
        return new ArrayList<>(Arrays.asList(images));
    }

    private static ArrayList<Integer>getBackDropPath(){
        Integer[] images ={
                R.drawable.poster_glass,
                R.drawable.poster_hunterkiller,
                R.drawable.poster_marrypopins,
                R.drawable.poster_mortalengine,
                R.drawable.poster_preman,
                R.drawable.poster_robinhood,
                R.drawable.poster_spiderman,
                R.drawable.poster_thegirl,
                R.drawable.poster_themule,
                R.drawable.poster_venom,
        };
        return new ArrayList<>(Arrays.asList(images));
    }

    public static ArrayList<Movie> getMovieListData(){
        ArrayList<Movie> data = new ArrayList<>();
        for (int i = 0; i<=9; i++){
            Movie movie = new Movie();
            movie.setId(i);
            movie.setTitle(MovieData.getTitles().get(i));
            movie.setOverview(MovieData.getOverView().get(i));
            movie.setPoster_path(MovieData.getPosterPath().get(i));
            movie.setRelease_date(MovieData.getDates().get(i));
            movie.setBackdrop_path(MovieData.getBackDropPath().get(i));
            movie.setVote_average(MovieData.getVoteAverages().get(i));

            data.add(movie);
        }
        return data;
    }

}
