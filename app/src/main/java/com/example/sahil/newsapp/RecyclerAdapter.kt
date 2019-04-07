package com.example.sahil.newsapp

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.example.sahil.googlenews.bean.Articles
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.target.Target


class RecyclerAdapter( var article:Articles?):RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    lateinit var context:Context

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        var itemView:View = LayoutInflater.from(p0.context).inflate(R.layout.indiview,p0,false)
        context = p0.context
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return article!!.articles.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

        p0.titile.text = article!!.articles.get(p1).title
        p0.titile.setText(article!!.articles.get(p1).title)
        p0.desc.text = article!!.articles.get(p1).description
        p0.author.text = article!!.articles.get(p1).author
        p0.name.text = article!!.articles.get(p1).source.name
      //  Glide.with(context).load(article!!.articles.get(p1).urlToImage).into(p0.imag)
        p0.time.setText(" \u2022 " + Utils.DateToTimeFormat(article!!.articles.get(p1).publishedAt))
        p0.published_ad.setText(Utils.DateFormat(article!!.articles.get(p1).publishedAt))


        Glide.with(context).load(article!!.articles.get(p1).urlToImage).apply(RequestOptions())
                .listener(object : RequestListener<Drawable> {
                    override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Drawable>?, isFirstResource: Boolean): Boolean {
                        p0.progressBar.setVisibility(View.GONE);
                        return false;
                    }

                    override fun onResourceReady(resource: Drawable?, model: Any?, target: Target<Drawable>?, dataSource: DataSource?, isFirstResource: Boolean): Boolean {
                        p0.progressBar.setVisibility(View.GONE);
                        return false;
                    }

                })
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(p0.imag)

        p0.content.setOnClickListener(View.OnClickListener {

            var i = Intent(context,BrowserActivity::class.java)
            i.putExtra("url",article!!.articles.get(p1).url)
            context.startActivity(i)

        })
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        var titile:TextView = itemView.findViewById(R.id.title)
        var desc:TextView = itemView.findViewById(R.id.desc)
        var author:TextView = itemView.findViewById(R.id.author)
        var imag:ImageView = itemView.findViewById(R.id.img)
        var time:TextView = itemView.findViewById(R.id.time)
        var name:TextView = itemView.findViewById(R.id.source)
        var content:RelativeLayout = itemView.findViewById(R.id.content)
       var progressBar:ProgressBar = itemView.findViewById(R.id.prograss_load_photo);
        var published_ad:TextView = itemView.findViewById(R.id.publishedAt);
}

}