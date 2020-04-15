package com.example.submissionandroidpemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvClub: RecyclerView
    private var list: ArrayList<Club> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvClub = findViewById(R.id.rv_club)
        rvClub.setHasFixedSize(true)

        list.addAll(ClubsData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvClub.layoutManager = LinearLayoutManager(this)
        val cardViewClubAdapter = CardViewClubAdapter(list)
        rvClub.adapter = cardViewClubAdapter

        cardViewClubAdapter.setOnItemClickCallback(object : OnItemClickCallback{
            override fun onItemClicked(data: Club) {
                showSelectedHero(data)
            }

        })
    }

    private fun showSelectedHero(club: Club) {
        val detailIntent = Intent(this@MainActivity, ClubDetailActivity::class.java)
        detailIntent.putExtra(ClubDetailActivity.EXTRA_DATA, club)
        startActivity(detailIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.icon_about -> {
            val detailIntent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(detailIntent)
            true
        }
        else -> super.onOptionsItemSelected(item)
    }
}


