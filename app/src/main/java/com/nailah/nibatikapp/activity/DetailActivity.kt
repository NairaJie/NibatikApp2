package com.nailah.nibatikapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.nailah.nibatikapp.R
import com.nailah.nibatikapp.model.HasilItem
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_DESC = "extra_desc"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.hide()

//        fb_back_detail.setOnClickListener{ startActivity(Intent(MainActivity.getLaunchService(this))) }
//        val batik = intent.getParcelableExtra<HasilItem>("EXTRA_DESC") as HasilItem
//        tv_tittle_detail.text = batik.namaBatik.toString()
//        tv_desc_detail.text = batik.maknaBatik.toString()
//        tv_price_high.text = batik.hargaTinggi.toString()
//        tv_price_low.text = batik.hargaRendah.toString()
//        tv_link.text = batik.linkBatik.toString()
    }
}