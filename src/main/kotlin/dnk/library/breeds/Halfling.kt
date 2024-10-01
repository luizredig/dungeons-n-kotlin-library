package dnk.library.breeds

class Halfling : dnk.library.breeds.IBreed {
    override fun getStrength(): Int {
        return 0
    }

    override fun getDexterity(): Int {
        return 2
    }

    override fun getConstitution(): Int {
        return 0
    }

    override fun getIntelligence(): Int {
        return 0
    }

    override fun getWisdom(): Int {
        return 0
    }

    override fun getCharisma(): Int {
        return 1
    }
}