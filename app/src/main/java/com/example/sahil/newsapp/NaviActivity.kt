package com.example.sahil.newsapp

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_navi.*
import kotlinx.android.synthetic.main.app_bar_navi.*
import kotlinx.android.synthetic.main.content_navi.*

class NaviActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navi)
        setSupportActionBar(toolbar)


        asia.setOnClickListener(View.OnClickListener {
            var i = Intent(this@NaviActivity,CustomAdpter::class.java)
            i.putExtra("x","asia")
            startActivity(i)
        })

        america.setOnClickListener(View.OnClickListener {
            var i = Intent(this@NaviActivity,CustomAdpter::class.java)
            i.putExtra("x","america")
            startActivity(i)
        })

        africa.setOnClickListener(View.OnClickListener {
            var i = Intent(this@NaviActivity,CustomAdpter::class.java)
            i.putExtra("x","africa")
            startActivity(i)
        })

        europe.setOnClickListener(View.OnClickListener {
            var i = Intent(this@NaviActivity,CustomAdpter::class.java)
            i.putExtra("x","europe")
            startActivity(i)
        })

        austrelia.setOnClickListener(View.OnClickListener {
            var i = Intent(this@NaviActivity,CategoryActivit::class.java)
            i.putExtra("x","austrelia")
            startActivity(i)
        })

        liveTv.setOnClickListener(View.OnClickListener {
            var i = Intent(this@NaviActivity,CustomAdpter::class.java)
            i.putExtra("x","live Tv")
            startActivity(i)
        })






















        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.navi, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.tech_news ->{
                var i = Intent(this@NaviActivity,MainActivity::class.java)
                i.putExtra("news","technology")
                startActivity(i)
            }
            R.id.bbcnews ->{
                var i = Intent(this@NaviActivity,MainActivity::class.java)
                i.putExtra("news","bbc-news")
                startActivity(i)
            }
            R.id.googleNews -> {
                var i = Intent(this@NaviActivity,MainActivity::class.java)
                i.putExtra("news","google-news")
                startActivity(i)
            }
            R.id.sport -> {
                var i = Intent(this@NaviActivity,MainActivity::class.java)
                i.putExtra("news","sports")
                startActivity(i)
            }
            R.id.entertain -> {
                var i = Intent(this@NaviActivity,MainActivity::class.java)
                i.putExtra("news","entertainment")
                startActivity(i)
            }
            R.id.health -> {
                var i = Intent(this@NaviActivity,MainActivity::class.java)
                i.putExtra("news","health")
                startActivity(i)
            }
            R.id.business -> {
                var i = Intent(this@NaviActivity,MainActivity::class.java)
                i.putExtra("news","business")
                startActivity(i)
            }
            R.id.science -> {
                var i = Intent(this@NaviActivity,MainActivity::class.java)
                i.putExtra("news","science")
                startActivity(i)
            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }


        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
