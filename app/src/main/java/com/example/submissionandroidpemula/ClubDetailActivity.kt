package com.example.submissionandroidpemula

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.annotation.RequiresApi

class ClubDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var tvName: TextView
    private lateinit var tvCountry: TextView
    private lateinit var imgViewLogoClub: ImageView
    private lateinit var tvDetail: TextView
    private lateinit var pbAttack: ProgressBar
    private lateinit var tvAttackValue: TextView
    private lateinit var pbMidfield: ProgressBar
    private lateinit var tvMidfieldValue: TextView
    private lateinit var pbDefence: ProgressBar
    private lateinit var tvDefenceValue: TextView
    private lateinit var tvLeagueValue: TextView
    private lateinit var tvLeagueName: TextView
    private lateinit var tvUclValue: TextView
    private lateinit var tvEuropeValue: TextView
    private lateinit var imgViewCoach: ImageView
    private lateinit var tvCoachName: TextView



    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_club_detail)

        val actionbar = supportActionBar
        actionbar!!.title = ""
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        val club = intent.getSerializableExtra(EXTRA_DATA) as Club
        tvName = findViewById(R.id.tv_name_club)
        tvCountry = findViewById(R.id.tv_country)
        imgViewLogoClub = findViewById(R.id.img_club)
        pbAttack = findViewById(R.id.pb_attack)
        tvAttackValue = findViewById(R.id.tv_attack_value)
        pbMidfield = findViewById(R.id.pb_midfield)
        tvMidfieldValue = findViewById(R.id.tv_midfield_value)
        pbDefence = findViewById(R.id.pb_defence)
        tvDefenceValue = findViewById(R.id.tv_defence_value)
        tvLeagueValue = findViewById(R.id.tv_league_value)
        tvUclValue = findViewById(R.id.tv_ucl_value)
        tvEuropeValue = findViewById(R.id.tv_eropa_value)
        tvLeagueName = findViewById(R.id.tv_league_name)
        tvDetail = findViewById(R.id.tv_detail)
        imgViewCoach = findViewById(R.id.image_coach)
        tvCoachName = findViewById(R.id.tv_coach_name)


        tvName.text = club.name
        tvCountry.text = club.country
        imgViewLogoClub.setImageResource(club.photo)
        pbAttack.setProgress(club.power[0],true)
        tvAttackValue.text = club.power[0].toString()
        pbMidfield.setProgress(club.power[1], true)
        tvMidfieldValue.text = club.power[1].toString()
        pbDefence.setProgress(club.power[2],true)
        tvDefenceValue.text = club.power[2].toString()
        tvLeagueValue.text = club.win[0].toString()
        tvUclValue.text = club.win[1].toString()
        tvEuropeValue.text = club.win[2].toString()
        tvLeagueName.text = club.league
        tvDetail.text = club.detail
        imgViewCoach.setImageResource(club.coachPhoto)
        tvCoachName.text = club.coachName

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
