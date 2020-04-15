package com.example.submissionandroidpemula

object ClubsData {
    private val clubNames = arrayOf(
        "Manchester City",
        "Bayern Munich ",
        "Liverpool",
        "Paris Saint Germain",
        "Barcelona",
        "Juventus",
        "Chelsea",
        "Real Madrid",
        "Atlético Madrid",
        "Borussia Dortmund",
        "Ajax Amsterdam",
        "Manchester United",
        "Arsenal"
    )


    private val clubCountries = arrayOf(
        "Inggris",
        "Jerman",
        "Inggris",
        "Francis",
        "Spanyol",
        "Italia",
        "Inggris",
        "Spanyol",
        "Spanyol",
        "Jerman",
        "Belanda",
        "Inggris",
        "Inggris"
    )

    private val clubDetails = arrayOf(
        "Manchester City Football Club (dikenal pula sebagai Man City atau The Citizens) adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris. Klub ini merupakaan klub sekota dengan Manchester United dan bermarkas di Stadion Etihad, Manchester.",
        "FC Bayern München, FC Bayern Munich, atau FC Bayern, adalah sebuah klub olahraga Jerman yang berbasis di München, Bavaria. Hal ini terkenal karena tim sepak bola profesional, yang bermain di Bundesliga, peringkat teratas sistem liga sepak bola Jerman, dan merupakan klub paling sukses dalam sejarah sepak bola Jerman.",
        "Liverpool Football Club (dikenal pula sebagai Liverpool atau The Reds) adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool. Saat ini Liverpool adalah peserta Liga Utama Inggris. Liverpool juga merupakan juara bertahan Liga Champions UEFA musim 2018-2019.",
        "Paris Saint-Germain Football Club atau dikenal luas dengan sebutan PSG merupakan sebuah tim sepak bola Prancis yang bermain di Ligue 1, Prancis. Bermarkas di Paris, Prancis. Klub ini didirikan pada 12 Agustus 1970, berkat penggabungan Paris FC dan dengan Stade Saint-Germain.",
        "Fútbol Club Barcelona, juga dikenal sebagai Barcelona atau Barça, adalah klub sepak bola profesional yang berbasis di Barcelona, Catalunya, Spanyol.",
        "Juventus adalah klub sepak bola profesional asal Italia yang berbasis di Turin, Piemonte. Klub ini didirikan pada tahun 1897 dengan nama Sport Club Juventus oleh sekelompok pelajar muda di kota Turin,[3] yang dipimpin oleh Eugenio Canfari dan saudaranya Enrico.",
        "Chelsea Football Club  adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris.",
        "Real Madrid Castilla merupakan sebuah klub sepak bola asal Spanyol yang saat ini bermain di Segunda División B. Pemain-pemain yang mengisi skuat Real Madrid Castilla merupakan tim cadangan dari Real Madrid. Mereka biasa memainkan laga kandang mereka di Stadion Alfredo di Stéfano.",
        "Club Atletico de Madrid, SAD (singkatan dari Sociedad Anónima Deportiva) atau Atlético Madrid, atau juga disebut Atlético atau Atleti, adalah tim sepak bola Spanyol yang bermain di La Liga Santander. Bermarkas di Madrid. Klub ini juga memiliki rivalitas dengan tetangganya Real Madrid, yang dikenal dengan Derbi Madrid.",
        "Borussia Dortmund atau BVB, adalah klub olahraga Jerman yang berbasis di Dortmund, Rhine-Westphalia Utara. Didirikan pada tahun 1909 oleh delapan belas pemain sepak bola dari Dortmund. Dortmund bermain di Bundesliga, tingkat teratas sistem liga sepakbola Jerman.",
        "Ajax Amsterdam, AFC Ajax, atau hanya Ajax adalah sebuah klub sepak bola dari Amsterdam, Belanda. Klub ini adalah salah satu klub terkuat di Belanda dan juga di Eropa. Secara historis, Ajax telah menjadi klub paling sukses di Belanda, dengan 34 gelar Eredivisie dan 19 Piala KNVB.",
        "Manchester United Football Club adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris. Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878.",
        "Arsenal Football Club (dikenal pula sebagai Arsenal atau The Gunners) adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London. didirikan pada 1886 dengan nama Dial Square. Klub ini bermain di Liga Utama Inggris yang termasuk salah satu klub tersukses di sepak bola Inggris."
    )

    private val clubImages = intArrayOf(
        R.drawable.img_manchester_city,
        R.drawable.img_bayern_munchen,
        R.drawable.img_liver,
        R.drawable.img_paris,
        R.drawable.img_barca,
        R.drawable.img_juventus,
        R.drawable.img_chelsea,
        R.drawable.img_real_madrid,
        R.drawable.img_atletico,
        R.drawable.img_borussia_dortmund,
        R.drawable.img_ajax,
        R.drawable.img_mu,
        R.drawable.img_arsenal
    )

    private val clubPower = arrayOf(
        intArrayOf(88, 87, 84),
        intArrayOf(87, 85, 83),
        intArrayOf(86, 82, 85),
        intArrayOf(89, 84, 83),
        intArrayOf(88, 84, 85),
        intArrayOf(87, 84, 85),
        intArrayOf(83, 83, 81),
        intArrayOf(86, 87, 85),
        intArrayOf(84, 84, 82),
        intArrayOf(83, 83, 82),
        intArrayOf(78, 81, 78),
        intArrayOf(83, 80, 80),
        intArrayOf(84, 82, 78)
        )

    private val clubLeague = arrayOf(
        "Premier League",
        "Bundesliga",
        "Premier League",
        "Ligue 1",
        "La Liga",
        "Serie A",
        "Premier League",
        "La Liga",
        "La Liga",
        "Bundesliga",
        "Eredivisie",
        "Premier League",
        "Premier League"
    )
    private val clubWin = arrayOf(
        intArrayOf(4, 0, 1),
        intArrayOf(29, 5, 1),
        intArrayOf(18, 6, 3),
        intArrayOf(8, 0, 1),
        intArrayOf(26, 5, 4),
        intArrayOf(35, 2, 2),
        intArrayOf(6, 1, 2),
        intArrayOf(33, 13, 2),
        intArrayOf(10, 0, 4),
        intArrayOf(8, 1, 1),
        intArrayOf(34, 4, 1),
        intArrayOf(20, 3, 1),
        intArrayOf(13, 0, 1)
    )

    private val clubCoachName = arrayOf(
        "Pep Guardiola",
        "Hans-Dieter Flick",
        "Jürgen Klopp",
        "Thomas Tuchel",
        "Ernesto Valverde",
        "Maurizio Sarri",
        "Frank Lampard",
        "Zinédine Zidane",
        "Diego Simeone",
        "Lucien Favre",
        "Erik ten Hag",
        "Ole Gunnar Solskjaer",
        "Mikel Arteta"
    )

    private val clubCoachImages = arrayOf(
        R.drawable.coach_manchester_city,
        R.drawable.coach_bayern_munich,
        R.drawable.coach_liverpool,
        R.drawable.coach_psg,
        R.drawable.coach_barca,
        R.drawable.coach_juventus,
        R.drawable.coach_chelsea,
        R.drawable.coach_real_madrid,
        R.drawable.coach_atletico_madrid,
        R.drawable.coach_dortmund,
        R.drawable.coach_ajax,
        R.drawable.coach_mu,
        R.drawable.coach_arsenal
    )




    val listData: ArrayList<Club>
        get() {
            val list = arrayListOf<Club>()
            for (position in clubNames.indices){
                val club = Club()
                club.name = clubNames[position]
                club.country = clubCountries[position]
                club.detail = clubDetails[position]
                club.photo = clubImages[position]
                club.league = clubLeague[position]
                club.power = clubPower[position]
                club.win = clubWin[position]
                club.coachPhoto = clubCoachImages[position]
                club.coachName = clubCoachName[position]
                list.add(club)
            }
            return list
        }
}