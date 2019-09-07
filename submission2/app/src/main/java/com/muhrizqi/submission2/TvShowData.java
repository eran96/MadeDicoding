package com.muhrizqi.submission2;

import java.util.ArrayList;
import java.util.Arrays;

public class TvShowData {
    private static ArrayList<String> getNames() {
        String[] names = {
                "Arrow",
                "Doom Partol",
                "Dragon Ball",
                "Fairy Tail",
                "The Flash",
                "Game of Throne",
                "Gotham",
                "Naruto Shipudden",
                "Supergirl",
                "The Umbrella Academy"
        };
        return new ArrayList<>(Arrays.asList(names));
    }

    private static ArrayList<String> getOverviews() {
        String[] overviews = {
                "Arrow adalah menceritakan kembali petualangan dari legendaris DC pahlawan Green Arrow",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "Dahulu kala di pegunungan, seorang master pertempuran yang dikenal sebagai Gohan menemukan seorang bocah aneh yang ia beri nama Goku. Gohan membesarkannya dan melatih Goku dalam seni bela diri sampai dia mati. Bocah muda dan sangat kuat itu sendirian, tetapi mudah dikelola. Kemudian suatu hari, Goku bertemu dengan seorang gadis remaja bernama Bulma, yang pencariannya untuk bola naga membawanya ke rumah Goku. Bersama-sama, mereka berangkat untuk menemukan ketujuh bola naga dalam sebuah petualangan yang akan mengubah hidup Goku selamanya. Lihat bagaimana Goku bertemu teman-teman seumur hidupnya Bulma, Yamcha, Krillin, Master Roshi dan banyak lagi. ",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                "Setelah akselerator partikel menyebabkan badai aneh, Penyelidik CSI Barry Allen disambar petir dan jatuh koma. Beberapa bulan kemudian dia terbangun dengan kekuatan kecepatan super, memberinya kemampuan untuk bergerak melalui Central City seperti malaikat penjaga yang tak terlihat. Meskipun awalnya senang dengan kekuatan barunya, Barry terkejut menemukan bahwa dia bukan satu-satunya 'manusia meta' yang diciptakan setelah ledakan akselerator - dan tidak semua orang menggunakan kekuatan baru mereka untuk kebaikan. Barry bermitra dengan S.T.A.R. Lab dan mendedikasikan hidupnya untuk melindungi yang tidak bersalah. Untuk saat ini, hanya beberapa teman dekat dan rekan yang tahu bahwa Barry secara harfiah adalah manusia tercepat, tetapi tidak lama sebelum dunia mengetahui apa yang menjadi Barry Allen ... The Flash.",
                "Tujuh keluarga bangsawan berjuang untuk menguasai tanah mitos Westeros. Gesekan antara rumah-rumah mengarah ke perang skala penuh. Semua sementara kejahatan yang sangat kuno terbangun di utara terjauh. Di tengah-tengah perang, perintah militer yang diabaikan, Night's Watch, adalah yang berdiri di antara alam manusia dan kengerian es di luarnya.",
                "Semua orang tahu nama Komisaris Gordon. Dia adalah salah satu musuh terbesar dunia kejahatan, seorang pria yang reputasinya identik dengan hukum dan ketertiban. Tapi apa yang diketahui tentang kisah Gordon dan kenaikannya dari detektif pemula ke Komisaris Polisi? Apa yang diperlukan untuk menavigasi berbagai lapisan korupsi yang diam-diam memerintah Kota Gotham, tempat bertelurnya penjahat paling ikonik di dunia? Dan keadaan apa yang menciptakan mereka - persona yang lebih besar dari kehidupan yang akan menjadi Catwoman, The Penguin, The Riddler, Two-Face dan The Joker?",
                "Naruto Shippuuden adalah kelanjutan dari serial TV animasi asli Naruto. Kisah ini berkisah tentang Uzumaki Naruto yang lebih tua dan sedikit lebih matang dan upayanya untuk menyelamatkan temannya Uchiha Sasuke dari cengkeraman Shinobi seperti ular, Orochimaru. Setelah 2 setengah tahun, Naruto akhirnya kembali ke desanya Konoha, dan mulai mewujudkan ambisinya, meskipun itu tidak akan mudah, karena Ia telah mengumpulkan beberapa musuh (lebih berbahaya), seperti organisasi shinobi. ; Akatsuki.",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more."

        };
        return new ArrayList<>(Arrays.asList(overviews));
    }

    private static ArrayList<String> getFirstAirDates() {
        String[] dates = {
                "10/10/2012",
                "15/02/2019",
                "26/02/1986",
                "15/04/2011",
                "19/04/2016",
                "17/04/2011",
                "18/08/2014",
                "02/08/2008",
                "26/10/2015",
                "15/02/2019"
        };
        return new ArrayList<>(Arrays.asList(dates));
    }

    private static ArrayList<Double> getVoteAverages() {
        double[] averages = {
                58,
                63,
                70,
                64,
                67,
                81,
                69,
                76,
                58,
                76
        };
        ArrayList<Double> list = new ArrayList<>();
        for (Double aData : averages) {
            list.add(aData);
        }
        return list;
    }

    private static ArrayList<Integer> getposterpath() {
        Integer[] images = {
                R.drawable.tv_poster_arrow,
                R.drawable.tv_poster_doom_patrol,
                R.drawable.tv_poster_dragon_ball,
                R.drawable.tv_poster_fairytail,
                R.drawable.tv_poster_flash,
                R.drawable.tv_poster_got,
                R.drawable.tv_poster_gotham,
                R.drawable.tv_poster_naruto_shipudden,
                R.drawable.tv_poster_supergirl,
                R.drawable.tv_poster_the_umbrella
        };
        return new ArrayList<>(Arrays.asList(images));
    }

    private static ArrayList<Integer> getbackDropPath() {
        Integer[] images = {
                R.drawable.tv_poster_arrow,
                R.drawable.tv_poster_doom_patrol,
                R.drawable.tv_poster_dragon_ball,
                R.drawable.tv_poster_fairytail,
                R.drawable.tv_poster_flash,
                R.drawable.tv_poster_got,
                R.drawable.tv_poster_gotham,
                R.drawable.tv_poster_naruto_shipudden,
                R.drawable.tv_poster_supergirl,
                R.drawable.tv_poster_the_umbrella
        };
        return new ArrayList<>(Arrays.asList(images));
    }

    public static ArrayList<TvShow> getTvShowListData() {
        ArrayList<TvShow> data = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            TvShow tvShows = new TvShow();
            tvShows.setId(i);
            tvShows.setName(TvShowData.getNames().get(i));
            tvShows.setOverview(TvShowData.getOverviews().get(i));
            tvShows.setPoster_path(TvShowData.getposterpath().get(i));
            tvShows.setFirst_air_date(TvShowData.getFirstAirDates().get(i));
            tvShows.setBackdrop_path(TvShowData.getbackDropPath().get(i));
            tvShows.setVote_average(TvShowData.getVoteAverages().get(i));

            data.add(tvShows);
        }
        return data;
    }
}
