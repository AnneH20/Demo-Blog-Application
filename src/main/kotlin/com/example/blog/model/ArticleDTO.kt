package com.example.blog.model

import com.example.blog.model.UserDTO.User
import com.example.blog.toSlug
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.time.LocalDateTime

class ArticleDTO {
    @Entity
    @Table(name = "articles")
    data class Article(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
        var title: String,
        var content: String,
        @ManyToOne
        @JoinColumn(name = "author_id", nullable = false)
        var author: User,
        var slug: String = title.toSlug(),
        @Column(name = "added_at")
        var addedAt: LocalDateTime = LocalDateTime.now(),
    )
}
