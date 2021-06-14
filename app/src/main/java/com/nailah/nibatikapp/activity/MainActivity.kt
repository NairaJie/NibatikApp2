package com.nailah.nibatikapp.activity


import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.nailah.nibatikapp.Network.RetrofitConfig
import com.nailah.nibatikapp.R
import com.nailah.nibatikapp.model.AllResponse
import com.nailah.nibatikapp.model.HasilItem
import com.nailah.nibatikapp.model.HasilItemPopular
import com.nailah.nibatikapp.model.PopularResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {


    companion object {
        fun getLaunchService(from: Context) = Intent(from, MainActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

    }

    fun init(page: Int) {
        getBatikAll(page)
    }

    private val data = MutableLiveData<List<HasilItem>>()


    private fun getBatikAll(page: Int) {

        RetrofitConfig.getInstance().getAllBatik(page)
            .enqueue(object : Callback<AllResponse> {
                override fun onResponse(
                    call: Call<AllResponse>,
                    response: Response<AllResponse>
                ) {
                    if (response.isSuccessful) {
                        //val batikData = response.body()
                        val batikAllResponse: AllResponse? = response.body()
                        data.postValue(batikAllResponse?.hasilAll)
                    }
                }

                override fun onFailure(
                    call: Call<AllResponse>,
                    t: Throwable
                ) {
                    Log.e("failure", t.toString())

                }
            })


    }

    fun getData(): LiveData<List<HasilItem>> {
        return data
    }


    /* =========== Popular =========== */

    fun initPopular(page: Int) {
        getBatikPopular(page)
    }

    private val dataPopular = MutableLiveData<List<HasilItemPopular>>()


    private fun getBatikPopular(page: Int) {

        RetrofitConfig.getInstance().getPopular(page)
            .enqueue(object : Callback<PopularResponse> {
                override fun onResponse(
                    call: Call<PopularResponse>,
                    response: Response<PopularResponse>
                ) {
                    if (response.isSuccessful) {
                        val batikPopularResponse: PopularResponse? = response.body()
                        dataPopular.postValue(batikPopularResponse?.hasilPopular)
                    }
                }

                override fun onFailure(
                    call: Call<PopularResponse>,
                    t: Throwable
                ) {
                    Log.e("failure", t.toString())

                }
            })
    }

    fun getDataPopular(): LiveData<List<HasilItemPopular>> {
        return dataPopular
    }


}









