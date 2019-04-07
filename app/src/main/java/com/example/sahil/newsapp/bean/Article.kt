package com.example.sahil.googlenews.bean

data class Article (var title:String,
                    var description:String,
                    var url:String,
                    var urlToImage:String,
                    var author:String,
                    var publishedAt:String,
                    var source: Source)
//
//data class Source (var id:String,
//                   var name:String)