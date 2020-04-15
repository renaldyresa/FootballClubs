package com.example.submissionandroidpemula

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewClubAdapter(private val listClub: ArrayList<Club>): RecyclerView.Adapter<CardViewClubAdapter.CardViewClubHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    inner class CardViewClubHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvCountry: TextView = itemView.findViewById(R.id.tv_country)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewClubHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_club, parent, false)
        return CardViewClubHolder(view)
    }

    override fun getItemCount(): Int {
        return listClub.size
    }

    override fun onBindViewHolder(holder: CardViewClubHolder, position: Int) {
        val club = listClub[position]

        Glide.with(holder.itemView.context)
            .load(club.photo)
            .apply(RequestOptions().override(350,350))
            .into(holder.imgPhoto)

        holder.tvName.text = club.name
        holder.tvCountry.text = club.country
        holder.tvDetail.text = club.detail

        holder.itemView.setOnClickListener{ onItemClickCallback.onItemClicked(listClub[holder.adapterPosition]) }
    }

}