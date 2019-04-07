package com.example.sahil.newsapp

import android.app.ProgressDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.activity_custom_adpter.*
import kotlinx.android.synthetic.main.listview.*
import kotlinx.android.synthetic.main.listview.view.*

class CustomAdpter : AppCompatActivity() {

     var mProg: ProgressDialog? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_adpter)

        var l = intent.getStringExtra("x")

        if (l=="asia"){

            setSupportActionBar(listtool)
            supportActionBar!!.title = l.toUpperCase()

            var AsianCountry = arrayOf("China","India","Japan","Singapore","Israel",
                    "Indonesia","Taiwan","Turkey","Hong Kong","UAE","South Korea","Saudi Arabia","Malaysia","Philippines")
            var AsianImage = arrayOf(R.drawable.china,R.drawable.india,R.drawable.japan,R.drawable.singapore,R.drawable.israel,
                    R.drawable.indonesia,R.drawable.taiwan,R.drawable.turkey,R.drawable.hong_kong,R.drawable.uae,
                    R.drawable.south_korea,R.drawable.saudi_arabia,R.drawable.malaysia,R.drawable.philippines)

            lview.adapter = object :BaseAdapter(){
                override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

                    var inflater = LayoutInflater.from(this@CustomAdpter)
                    var v:View = inflater.inflate(R.layout.listview,null)
                    v.tx.text = AsianCountry[p0]
                    v.im.setImageResource(AsianImage[p0])
                    return v
                }

                override fun getItem(p0: Int): Any = 0

                override fun getItemId(p0: Int): Long = 0

                override fun getCount(): Int {
                    return AsianCountry.size
                }
            }
            lview.setOnItemClickListener { adapterView, view, i, l ->

                var it = Intent(this@CustomAdpter,
                        MainActivity::class.java)
                it.putExtra("ram",AsianCountry[i])
                startActivity(it)

            }
        }


        if (l=="america"){

            setSupportActionBar(listtool)
            supportActionBar!!.title = l.toUpperCase()

            var AmericanCountry = arrayOf("Argentina","Brazil","Canada","Colombia","France","Mexico","United States")
            var AmeriacanImage = arrayOf(R.drawable.argentina,R.drawable.brazil,R.drawable.canada,R.drawable.colombia,
                    R.drawable.france,R.drawable.mexico,R.drawable.united_states)

            lview.adapter = object :BaseAdapter(){
                override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

                    var inflater = LayoutInflater.from(this@CustomAdpter)
                    var v:View = inflater.inflate(R.layout.listview,null)
                    v.tx.text = AmericanCountry[p0]
                    v.im.setImageResource(AmeriacanImage[p0])
                    return v
                }

                override fun getItem(p0: Int): Any = 0

                override fun getItemId(p0: Int): Long = 0

                override fun getCount(): Int {
                    return AmericanCountry.size
                }
            }
            lview.setOnItemClickListener { adapterView, view, i, l ->


                var it = Intent(this@CustomAdpter,
                        MainActivity::class.java)
                it.putExtra("ram", AmericanCountry[i])
                startActivity(it)
            }
        }

        if (l=="africa"){

            setSupportActionBar(listtool)
            supportActionBar!!.title = l.toUpperCase()

            var AfricanCountry = arrayOf("Nigeria","South Africa","Egypt","Morocco")
            var AfricanImage = arrayOf(R.drawable.nigeria,R.drawable.south_africa,R.drawable.egypt,R.drawable.morocco)

            lview.adapter = object :BaseAdapter(){
                override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

                    //  var inflater = LayoutInflater.from(this@CustomAdpter)
                    var inflater = LayoutInflater.from(this@CustomAdpter)
                    var v:View = inflater.inflate(R.layout.listview,null)
                    v.tx.text = AfricanCountry[p0]
                    v.im.setImageResource(AfricanImage[p0])
                    return v
                }

                override fun getItem(p0: Int): Any = 0

                override fun getItemId(p0: Int): Long = 0

                override fun getCount(): Int {
                    return AfricanCountry.size
                }
            }
            lview.setOnItemClickListener { adapterView, view, i, l ->

                var it = Intent(this@CustomAdpter,
                        MainActivity::class.java)
                it.putExtra("ram", AfricanCountry[i])
                startActivity(it)
            }
        }

        if (l=="europe"){

            setSupportActionBar(listtool)
            supportActionBar!!.title = l.toUpperCase()

            var EuropeanCountry = arrayOf("Austria","Greece","Hungary","Lithuania",
                    "Netherlands","Portugal","Slovakia","Sweden","Belgium","Bulgaria","Germany","Ireland",
                    "Italy","Latvia","Poland","Romania","Slovenia","United Kingdom")
            var EuropianImage = arrayOf(R.drawable.austria,R.drawable.greece,R.drawable.hungary,R.drawable.lithuania,
                    R.drawable.netherlands,R.drawable.portugal,R.drawable.slovakia,R.drawable.sweden,
                    R.drawable.belgium,R.drawable.bulgaria,R.drawable.germany,R.drawable.ireland,R.drawable.italy,
                    R.drawable.latvia,R.drawable.poland,R.drawable.romania,R.drawable.slovenia,R.drawable.united_kingdom)



            lview.adapter = object :BaseAdapter(){
                override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

                    //  var inflater = LayoutInflater.from(this@CustomAdpter)
                    var inflater = LayoutInflater.from(this@CustomAdpter)
                    var v:View = inflater.inflate(R.layout.listview,null)
                    v.tx.text = EuropeanCountry[p0]
                    v.im.setImageResource(EuropianImage[p0])
                    return v
                }

                override fun getItem(p0: Int): Any = 0

                override fun getItemId(p0: Int): Long = 0

                override fun getCount(): Int {
                    return EuropeanCountry.size
                }
            }
            lview.setOnItemClickListener { adapterView, view, i, l ->

                var it = Intent(this@CustomAdpter,
                        MainActivity::class.java)
                it.putExtra("ram", EuropeanCountry[i])
                startActivity(it)
            }
        }
        if (l=="live Tv"){

            setSupportActionBar(listtool)
            supportActionBar!!.title = l.toUpperCase()

            var liveTvName = arrayOf("AAJTAK","INDIA TV","INDIA TODAY","NEWS 24","CNBC AWAZ",
                    "DD NEWS","NEWS 18 INDIA","NEWS 18 ODIA","OTV ODIA","NEWS 18 BIHAR JHARKHAND")
            var tvimage = arrayOf(R.drawable.aajtak,R.drawable.india_tv,R.drawable.indiatoday,R.drawable.news24,
                    R.drawable.cnbc,R.drawable.ddnews,R.drawable.news18india,R.drawable.news18odia,R.drawable.otv,R.drawable.newsbihjhad)
            var youtube = arrayOf("8xIRMNJM7rY","ePa1g9hgjgM","NyantkXMUUY","ePa1g9hgjgM",
                    "Gq5HJ1F3ar0","mGfHB9OZpEo","ayTZhHnFgBE","oMFeiHJgT9I","f7wjS-kuf24","oHRlv7DJsGE")

            lview.adapter = object :BaseAdapter(){
                override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

                    //  var inflater = LayoutInflater.from(this@CustomAdpter)
                    var inflater = LayoutInflater.from(this@CustomAdpter)
                    var v:View = inflater.inflate(R.layout.listview,null)
                    v.tx.text = liveTvName[p0]
                    v.im.setImageResource(tvimage[p0])
                    return v
                }

                override fun getItem(p0: Int): Any = 0

                override fun getItemId(p0: Int): Long = 0

                override fun getCount(): Int {
                    return liveTvName.size
                }
            }
            lview.setOnItemClickListener { adapterView, view, i, l ->

                var it = Intent(this@CustomAdpter,
                        PlayerActivity::class.java)
                it.putExtra("helloYoutube", youtube[i])
                startActivity(it)
            }
        }




    }

}
