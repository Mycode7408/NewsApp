package com.mahmood.newsapp.common.util

import com.mahmood.newsapp.data.database.entity.Article

fun List<Article>.filterArticles(): List<Article> {
    return this.filterNot { article ->
        article.title.isNullOrEmpty() || article.description.isNullOrEmpty() || article.urlToImage.isNullOrEmpty()
    }
}