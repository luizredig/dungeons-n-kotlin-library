package com.github.luizredig.dungeons_n_kotlin.breeds

interface IBreed {
    fun getStrength(): Int
    fun getDexterity(): Int
    fun getConstitution(): Int
    fun getIntelligence(): Int
    fun getWisdom(): Int
    fun getCharisma(): Int
}