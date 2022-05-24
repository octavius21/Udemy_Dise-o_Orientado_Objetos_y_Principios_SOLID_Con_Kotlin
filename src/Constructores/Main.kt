package Constructores

import java.time.LocalDateTime
import java.time.Month

fun main(){
    val post=Post(
        name = "Tutorial de Kotlin",
        author = "Anahi Salgado (AnnCode)",
        date = LocalDateTime.of(
            2022,
            Month.MAY,
            12,
            21,
            25
        )
    )

    println(post.publish())

    val post1=Post(
        name = "Tutorial de Kotlin",
        author = "Anahi Salgado (AnnCode)",
        date = LocalDateTime.of(
            2022,
            Month.MAY,
            13,
            21,
            34
        ),
        content = "Es genial el curso",
        category = "Kotlin"
    )
    println(post1.publish())
}