package `Clases y Objetos`

class Song (
    //Atributos
    val tittle: String,
    val artist: String
    )
    //Metodos
    {
        private val artistUpperCase= artist.uppercase()

        init{
            println("Song $tittle create")
        }

        fun play(){
            println("Playing $tittle - $artistUpperCase")
        }

        fun stop(){
            println("Stopping $tittle")
        }
    }