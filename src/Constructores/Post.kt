package Constructores

import java.time.LocalDateTime

class Post (
    //Atributos
    val name: String,
    val author: String,
    val date: LocalDateTime
){
    var body: String=""
    var category: String=""
    //Constructores
    constructor(
        name: String,
        author: String,
        date: LocalDateTime,
        content: String,
        category: String
    ):this(name, author, date){
        body= content
        this.category= category
    }
    //Metodos
    fun publish(): String{
        return """
            Post Name: $name
            Author: $author
            Date: $date
            ${getContent()}
            ${getCategory()}
        """.trimIndent()
    }
    private fun getContent(): String{
        return if(body.isNotBlank() && body.isNotEmpty()){
            """
                Content: $body
            """.trimIndent()
        }else ""
    }
    @JvmName("getCategory1")
    private fun getCategory(): String{
        return if(category.isNotBlank() && category.isNotEmpty()){
            """
                Category: $category
            """.trimIndent()
        }else ""
    }
}