package com.example.narutoshippudentips

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.activity6_30daysapp.R

class AnimeTipAdapter(private val animeTips: List<AnimeTip>) : RecyclerView.Adapter<AnimeTipAdapter.AnimeTipViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeTipViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_anime_tip, parent, false)
        return AnimeTipViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimeTipViewHolder, position: Int) {
        val animeTip = animeTips[position]
        holder.dayTextView.text = animeTip.day
        holder.descriptionTextView.text = animeTip.description
        holder.imageView.setImageResource(animeTip.imageResId)
    }

    override fun getItemCount(): Int {
        return animeTips.size
    }

    class AnimeTipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dayTextView: TextView = itemView.findViewById(R.id.dayTextView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }
}
