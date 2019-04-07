package com.example.sahil.newsapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.example.sahil.googlenews.bean.Articles
import kotlinx.android.synthetic.main.activity_category.*
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CategoryActivit : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        var cate = arrayOf("business","science","health","technology","sports","entertainment")

        topstory.setOnClickListener(View.OnClickListener {
            var i = Intent(this@CategoryActivit,MainActivity::class.java)
            i.putExtra("syam","austrelia")
            startActivity(i)
        })
        busi.setOnClickListener(View.OnClickListener {

            var i = Intent(this@CategoryActivit,MainActivity::class.java)
            i.putExtra("cat",cate[0])
            i.putExtra("cont","austrelia")
            startActivity(i)
        })
        scienc.setOnClickListener(View.OnClickListener {

            var i = Intent(this@CategoryActivit,MainActivity::class.java)
            i.putExtra("cat",cate[1])
            i.putExtra("cont","austrelia")
            startActivity(i)
        })
        hel.setOnClickListener(View.OnClickListener {

            var i = Intent(this@CategoryActivit,MainActivity::class.java)
            i.putExtra("cat",cate[2])
            i.putExtra("cont","austrelia")
            startActivity(i)
        })
        tech.setOnClickListener(View.OnClickListener {

            var i = Intent(this@CategoryActivit,MainActivity::class.java)
            i.putExtra("cat",cate[3])
            i.putExtra("cont","austrelia")
            startActivity(i)
        })
        spor.setOnClickListener(View.OnClickListener {

            var i = Intent(this@CategoryActivit,MainActivity::class.java)
            i.putExtra("cat",cate[4])
            i.putExtra("cont","austrelia")
            startActivity(i)
        })
        entert.setOnClickListener(View.OnClickListener {

            var i = Intent(this@CategoryActivit,MainActivity::class.java)
            i.putExtra("cat",cate[5])
            i.putExtra("cont","austrelia")
            startActivity(i)
        })




        var co = intent.getStringExtra("co")
        if (co=="india"){

            topstory.setOnClickListener(View.OnClickListener {
                var i = Intent(this@CategoryActivit,MainActivity::class.java)
                i.putExtra("syam",co)
                startActivity(i)
            })

            busi.setOnClickListener(View.OnClickListener {

                var i = Intent(this@CategoryActivit,MainActivity::class.java)
                i.putExtra("cat",cate[0])
                i.putExtra("cont",co)
                startActivity(i)
            })
            scienc.setOnClickListener(View.OnClickListener {

                var i = Intent(this@CategoryActivit,MainActivity::class.java)
                i.putExtra("cat",cate[1])
                i.putExtra("cont",co)
                startActivity(i)
            })
            hel.setOnClickListener(View.OnClickListener {

                var i = Intent(this@CategoryActivit,MainActivity::class.java)
                i.putExtra("cat",cate[2])
                i.putExtra("cont",co)
                startActivity(i)
            })
            tech.setOnClickListener(View.OnClickListener {

                var i = Intent(this@CategoryActivit,MainActivity::class.java)
                i.putExtra("cat",cate[3])
                i.putExtra("cont",co)
                startActivity(i)
            })
            spor.setOnClickListener(View.OnClickListener {

                var i = Intent(this@CategoryActivit,MainActivity::class.java)
                i.putExtra("cat",cate[4])
                i.putExtra("cont",co)
                startActivity(i)
            })
            entert.setOnClickListener(View.OnClickListener {

                var i = Intent(this@CategoryActivit,MainActivity::class.java)
                i.putExtra("cat",cate[5])
                i.putExtra("cont",co)
                startActivity(i)
            })

        }

    }
}

