package com.nailah.nibatikapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nailah.nibatikapp.R
import com.nailah.nibatikapp.activity.DetailActivity
import com.nailah.nibatikapp.model.AllResponse
import com.nailah.nibatikapp.model.HasilItemPopular
import kotlinx.android.synthetic.main.item_all.view.*
import org.jetbrains.anko.intentFor

class BatikPopularAdapter( var ListBatikPopular: List<HasilItemPopular>) :
    RecyclerView.Adapter<BatikPopularAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(batikPopular: HasilItemPopular) {
            with(itemView) {
                tv_tittle_all.text = batikPopular.namaBatik
                tv_asal_all.text = batikPopular.daerahBatik
                tv_desc_all.text = batikPopular.maknaBatik
                itemView.setOnClickListener {
                    itemView.context?.startActivity(
                        itemView.context.intentFor<DetailActivity>(
                            "EXTRA_DESC" to batikPopular
                        )
                    )
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BatikPopularAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_all, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BatikPopularAdapter.ViewHolder, position: Int) {
        holder.bind(ListBatikPopular?.get(position)!!)
    }

    override fun getItemCount(): Int = ListBatikPopular!!.size

}
