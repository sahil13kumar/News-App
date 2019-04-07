package com.example.sahil.newsapp

import android.Manifest
import android.app.ProgressDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v7.app.ActionBar
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import com.example.sahil.googlenews.bean.Articles
import kotlinx.android.synthetic.main.activity_custom_adpter.*
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*
 *   developed by
 *   Sahil Kumar Sahu
 *   News Application
 */

class MainActivity : AppCompatActivity() {


    var News_API:String = "your secret api key"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var MainNews = intent.getStringExtra("news")
        if (MainNews == "google-news") {
            setSupportActionBar(mainTool)
            supportActionBar!!.title = MainNews.toUpperCase().replace("-", " ")
            RetrofitFun3(MainNews)
        }

        if (MainNews == "bbc-news") {
            setSupportActionBar(mainTool)
            supportActionBar!!.title = MainNews.toUpperCase().replace("-", " ")
            RetrofitFun3(MainNews)
        }
        if (MainNews == "technology") {
            setSupportActionBar(mainTool)
            supportActionBar!!.title = MainNews.toUpperCase()
            RetrofitFun4(MainNews)
        }
        if (MainNews == "business") {
            setSupportActionBar(mainTool)
            supportActionBar!!.title = MainNews.toUpperCase()
            RetrofitFun4(MainNews)
        }
        if (MainNews == "science") {
            setSupportActionBar(mainTool)
            supportActionBar!!.title = MainNews.toUpperCase()
            RetrofitFun4(MainNews)
        }
        if (MainNews == "health") {
            setSupportActionBar(mainTool)
            supportActionBar!!.title = MainNews.toUpperCase()
            RetrofitFun4(MainNews)
        }
        if (MainNews == "sports") {
            setSupportActionBar(mainTool)
            supportActionBar!!.title = MainNews.toUpperCase()
            RetrofitFun4(MainNews)
        }
        if (MainNews == "entertainment") {
            setSupportActionBar(mainTool)
            supportActionBar!!.title = MainNews.toUpperCase()
            RetrofitFun4(MainNews)
        }


        var country = intent.getStringExtra("ram")

        if (country == "India") {
            var i = Intent(this@MainActivity, CategoryActivit::class.java)
            i.putExtra("co", "india")
            startActivity(i)
            finish()
        }
        if (country == "China") {

            RetrofitFun("cn")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Japan") {
            RetrofitFun("jp")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Singapore") {
            RetrofitFun("sg")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Israel") {
            RetrofitFun("il")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Indonesia") {
            RetrofitFun("id")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Taiwan") {
            RetrofitFun("tw")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Turkey") {
            RetrofitFun("tr")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Hong Kong") {
            RetrofitFun("hk")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "UAE") {
            RetrofitFun("ae")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "South Korea") {
            RetrofitFun("kr")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Saudi Arabia") {
            RetrofitFun("sa")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Malaysia") {
            RetrofitFun("my")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Philippines") {
            RetrofitFun("ph")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }



        if (country == "United States") {
            RetrofitFun("us")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Argentina") {
            RetrofitFun("ar")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Brazil") {
            RetrofitFun("br")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Canada") {
            RetrofitFun("cn")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Colombia") {
            RetrofitFun("co")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "France") {
            RetrofitFun("fr")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Mexico") {
            RetrofitFun("mx")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }

        if (country == "Nigeria") {
            RetrofitFun("ng")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "South Africa") {
            RetrofitFun("za")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Egypt") {
            RetrofitFun("eg")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Morocco") {
            RetrofitFun("ma")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }

        //if (country=="Austria") RetrofitFun("at")
        if (country == "Greece") {
            RetrofitFun("gr")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Hungary") {
            RetrofitFun("hu")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Lithuania") {
            RetrofitFun("lt")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Netherlands") {
            RetrofitFun("nl")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Portugal") {
            RetrofitFun("pt")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Slovakia") {
            RetrofitFun("sk")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Sweden") {
            RetrofitFun("se")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Belgium") {
            RetrofitFun("be")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Bulgaria") {
            RetrofitFun("bg")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Germany") {
            RetrofitFun("de")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Ireland") {
            RetrofitFun("ie")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Italy") {
            RetrofitFun("it")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Latvia") {
            RetrofitFun("lv")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Poland") {
            RetrofitFun("pl")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Romania") {
            RetrofitFun("ro")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "Slovenia") {
            RetrofitFun("si")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }
        if (country == "United Kingdom") {
            RetrofitFun("gb")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = country.toUpperCase()
        }


        var cat = intent.getStringExtra("cat")
        var cont = intent.getStringExtra("cont")
//
        if (cat == "business" && cont == "austrelia") {
            RetrofitFun2("au", cat)
            setSupportActionBar(mainTool)
            supportActionBar!!.title = cat.toUpperCase()
        }
        if (cat == "science" && cont == "austrelia") {
            RetrofitFun2("au", cat)
            setSupportActionBar(mainTool)
            supportActionBar!!.title = cat.toUpperCase()
        }
        if (cat == "health" && cont == "austrelia") {
            RetrofitFun2("au", cat)
            setSupportActionBar(mainTool)
            supportActionBar!!.title = cat.toUpperCase()
        }
        if (cat == "sports" && cont == "austrelia") {
            RetrofitFun2("au", cat)
            setSupportActionBar(mainTool)
            supportActionBar!!.title = cat.toUpperCase()
        }
        if (cat == "entertainment" && cont == "austrelia") {
            RetrofitFun2("au", cat)
            setSupportActionBar(mainTool)
            supportActionBar!!.title = cat.toUpperCase()
        }
        if (cat == "technology" && cont == "austrelia") {
            RetrofitFun2("au", cat)
            setSupportActionBar(mainTool)
            supportActionBar!!.title = cat.toUpperCase()
        }


        if (cat == "business" && cont == "india") {
            RetrofitFun2("in", cat)
            setSupportActionBar(mainTool)
            supportActionBar!!.title = cat.toUpperCase()
        }
        if (cat == "science" && cont == "india") {
            RetrofitFun2("in", cat)
            setSupportActionBar(mainTool)
            supportActionBar!!.title = cat.toUpperCase()
        }
        if (cat == "health" && cont == "india") {
            RetrofitFun2("in", cat)
            setSupportActionBar(mainTool)
            supportActionBar!!.title = cat.toUpperCase()
        }
        if (cat == "sports" && cont == "india") {
            RetrofitFun2("in", cat)
            setSupportActionBar(mainTool)
            supportActionBar!!.title = cat.toUpperCase()
        }
        if (cat == "entertainment" && cont == "india") {
            RetrofitFun2("in", cat)
            setSupportActionBar(mainTool)
            supportActionBar!!.title = cat.toUpperCase()
        }
        if (cat == "technology" && cont == "india") {
            RetrofitFun2("in", cat)
            setSupportActionBar(mainTool)
            supportActionBar!!.title = cat.toUpperCase()
        }


        var country2 = intent.getStringExtra("syam")
        if (country2 == "india") {
            RetrofitFun("in")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = "TOP HEADLINES"
        }
        if (country2 == "austrelia") {
            RetrofitFun("au")
            setSupportActionBar(mainTool)
            supportActionBar!!.title = "TOP HEADLINES"
        }
    }
 //   }

    private fun RetrofitFun(st: String) {

        var r = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).
                baseUrl("https://newsapi.org/").build()

        var api = r.create(NewsAPI::class.java)
        var call: Call<Articles> = api.getNews(st,News_API)

        call.enqueue(object : Callback<Articles> {

            override fun onFailure(call: Call<Articles>, t: Throwable) {

            }

            override fun onResponse(call: Call<Articles>, response: Response<Articles>) {
                var article: Articles? = response.body()

                recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
                recyclerView.adapter = RecyclerAdapter(article)
            }

        })
    }


    private fun RetrofitFun2(st: String,cate:String) {

        var r = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).
                baseUrl("https://newsapi.org/").build()

        var api = r.create(NewsAPI::class.java)
        var call: Call<Articles> = api.getCategory(st,cate,News_API)

        call.enqueue(object : Callback<Articles> {

            override fun onFailure(call: Call<Articles>, t: Throwable) {

            }

            override fun onResponse(call: Call<Articles>, response: Response<Articles>) {
                var article: Articles? = response.body()

                recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
                recyclerView.adapter = RecyclerAdapter(article)
            }

        })
    }

    private fun RetrofitFun3(sr: String) {

        var r = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).
                baseUrl("https://newsapi.org/").build()

        var api = r.create(NewsAPI::class.java)
        var call: Call<Articles> = api.getSource(sr,News_API)

        call.enqueue(object : Callback<Articles> {

            override fun onFailure(call: Call<Articles>, t: Throwable) {

            }

            override fun onResponse(call: Call<Articles>, response: Response<Articles>) {
                var article: Articles? = response.body()

                recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
                recyclerView.adapter = RecyclerAdapter(article)
            }

        })
    }

    private fun RetrofitFun4(cate:String) {

        var r = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).
                baseUrl("https://newsapi.org/").build()

        var api = r.create(NewsAPI::class.java)
        var call: Call<Articles> = api.getTopHeadline(cate,News_API)

        call.enqueue(object : Callback<Articles> {

            override fun onFailure(call: Call<Articles>, t: Throwable) {

            }

            override fun onResponse(call: Call<Articles>, response: Response<Articles>) {
                var article: Articles? = response.body()

                recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
                recyclerView.adapter = RecyclerAdapter(article)
            }

        })
    }


}
