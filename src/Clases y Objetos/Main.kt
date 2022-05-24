package `Clases y Objetos`

fun main(){
    //instanciando objetos
    val firstSong= Song(
        "Calma",
        "Pedro Capo"
    )
    val secondSong= Song(
        "Te olvidare",
        "Enrique Iglesias"
    )
    val thirdSong= Song(
        "Chuleria en Pote",
        "Plan B"
    )
    //usando sus Funciones
    firstSong.play()
    firstSong.stop()
    secondSong.play()
}