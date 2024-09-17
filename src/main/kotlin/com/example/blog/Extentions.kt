package com.example.blog

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

fun LocalDateTime.format(): String {
    val monthFormatter = DateTimeFormatter.ofPattern("MMMM")
    val dayFormatter = DateTimeFormatter.ofPattern("d")
    val yearFormatter = DateTimeFormatter.ofPattern("yyyy")

    val month = this.format(monthFormatter)
    val day = this.format(dayFormatter).toInt()
    val year = this.format(yearFormatter)

    val ordinalDay = getOrdinal(day)

    return "$month $ordinalDay, $year"
}

private fun getOrdinal(n: Int) =
    when {
        n in 11..13 -> "${n}th"
        n % 10 == 1 -> "${n}st"
        n % 10 == 2 -> "${n}nd"
        n % 10 == 3 -> "${n}rd"
        else -> "${n}th"
    }

fun String.toSlug() =
    lowercase(Locale.getDefault())
        .replace("\n", " ")
        .replace("[^a-z\\d\\s]".toRegex(), " ")
        .split(" ")
        .joinToString("-")
        .replace("-+".toRegex(), "-")
