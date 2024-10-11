package dnk.library.breeds
import java.io.Serializable

interface IBreed : Serializable {
    fun getStrength(): Int
    fun getDexterity(): Int
    fun getConstitution(): Int
    fun getIntelligence(): Int
    fun getWisdom(): Int
    fun getCharisma(): Int
}