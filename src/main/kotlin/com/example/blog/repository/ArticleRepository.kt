package com.example.blog.repository

import com.example.blog.model.ArticleDo
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<ArticleDo, Long> {
    fun findBySlug(slug: String): ArticleDo?

    fun findByTitleIgnoreCase(title: String): ArticleDo?

    fun findAllByOrderByAddedAtDesc(): Iterable<ArticleDo>
}
