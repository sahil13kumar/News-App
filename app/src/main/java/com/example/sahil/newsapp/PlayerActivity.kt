package com.example.sahil.newsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class PlayerActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    internal var player: YouTubePlayer?=null
    internal var fullScreen: Button?=null

   lateinit var loadvid:String

    var DEVELOPER_KEY = "Replace your developer key"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        val playerView = findViewById<View>(R.id.youTubePlayerView) as YouTubePlayerView
        playerView.initialize(DEVELOPER_KEY, this)

        fullScreen = findViewById<View>(R.id.button2) as Button
        fullScreen!!.setOnClickListener { player!!.setFullscreen(true) }
          loadvid = intent.getStringExtra("helloYoutube")

    }

    override fun onInitializationSuccess(provider: YouTubePlayer.Provider, player: YouTubePlayer, b: Boolean) {

        this.player = player

        if (!b) {
            player.setPlayerStyle(YouTubePlayer.PlayerStyle.MINIMAL)
            // You can change the ID.. of the video to be played
            player.loadVideo(loadvid)
        }
    }

    override fun onInitializationFailure(provider: YouTubePlayer.Provider, youTubeInitializationResult: YouTubeInitializationResult) {

    }
}
