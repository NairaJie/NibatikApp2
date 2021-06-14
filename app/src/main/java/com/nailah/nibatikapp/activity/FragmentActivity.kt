package com.nailah.nibatikapp.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.nailah.nibatikapp.Adapter.BatikAllAdapter
import com.nailah.nibatikapp.Adapter.BatikPopularAdapter
import com.nailah.nibatikapp.R
import com.nailah.nibatikapp.model.HasilItem
import com.nailah.nibatikapp.model.HasilItemPopular
import kotlinx.android.synthetic.main.activity_main.*

class FragmentActivity : Fragment (){


    private lateinit var batikAllAdapter : BatikAllAdapter
    private lateinit var  batikPopularAdapter : BatikPopularAdapter
    private lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.activity_main,container, false)
        //popular
        mainActivity.init(1)
        mainActivity.getData().observe(viewLifecycleOwner,   { batikAll ->
            getInitAll(batikAll)
        })
        //upcoming
        mainActivity.initPopular(1)
        mainActivity.getDataPopular().observe(viewLifecycleOwner, { batikPopular ->
            getInitPopular(batikPopular)
        })


        return root
    }

    private fun getInitAll(batikAll: List<HasilItem>){
        rv_all.apply {
            layoutManager = LinearLayoutManager (context, LinearLayoutManager.VERTICAL, true)
            batikAllAdapter= BatikAllAdapter(batikAll)
            rv_all.adapter = batikAllAdapter
        }
    }

    private fun getInitPopular(batikPopular: List<HasilItemPopular>) {
        rv_popular.apply{
            layoutManager = LinearLayoutManager(context,
                LinearLayoutManager.HORIZONTAL, true)
            batikPopularAdapter = BatikPopularAdapter(batikPopular)
            rv_popular.adapter = batikPopularAdapter
        }

    }

}