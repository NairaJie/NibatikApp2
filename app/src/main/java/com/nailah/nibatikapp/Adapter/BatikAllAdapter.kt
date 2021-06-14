package com.nailah.nibatikapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nailah.nibatikapp.R
import com.nailah.nibatikapp.activity.DetailActivity
import com.nailah.nibatikapp.model.AllResponse
import com.nailah.nibatikapp.model.HasilItem
import kotlinx.android.synthetic.main.item_all.view.*
import org.jetbrains.anko.intentFor

class BatikAllAdapter( var ListBatikAll: List<HasilItem>) :
    RecyclerView.Adapter<BatikAllAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(batikAll: HasilItem) {
            with(itemView) {
                tv_tittle_all.text = batikAll.namaBatik
                tv_asal_all.text = batikAll.daerahBatik
                tv_desc_all.text = batikAll.maknaBatik
                itemView.setOnClickListener {
                    itemView.context?.startActivity(
                        itemView.context.intentFor<DetailActivity>(
                            "EXTRA_DESC" to batikAll
                        )
                    )
                }
            }
        }
//        fun bind(batikAll: AllResponse){
//            with(itemView){
//                //
//            }
//        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BatikAllAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_all, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BatikAllAdapter.ViewHolder, position: Int) {
      holder.bind(ListBatikAll?.get(position)!!)
    }

    override fun getItemCount(): Int = ListBatikAll!!.size

}
