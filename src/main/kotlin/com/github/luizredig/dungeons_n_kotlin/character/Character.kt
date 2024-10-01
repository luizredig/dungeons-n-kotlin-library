package com.github.luizredig.dungeons_n_kotlin.character

import com.github.luizredig.dungeons_n_kotlin.attributes.Attributes
import com.github.luizredig.dungeons_n_kotlin.breeds.IBreed
import dungeons_n_kotlin.classes.modifiers.AttributesModifier

class Character {
    lateinit var name: String

    lateinit var breed: IBreed

    lateinit var attributes: Attributes

    var healthPoints: Int = 10

    fun listAttributes(): String {
        return """
            Name: $name
            Breed: ${breed.javaClass.simpleName}
            
            VALUE | BREED BONUS | MODIFIER
            
            Health Points: $healthPoints +(${AttributesModifier.calculateAttributeModifier(attributes.constitution)})
            Strength: ${attributes.strength}  +(${breed.getStrength()}) +(${AttributesModifier.calculateAttributeModifier(attributes.strength)})
            Dexterity: ${attributes.dexterity}  +(${breed.getDexterity()}) +(${AttributesModifier.calculateAttributeModifier(attributes.dexterity)})
            Constitution: ${attributes.constitution}  +(${breed.getConstitution()}) +(${AttributesModifier.calculateAttributeModifier(attributes.constitution)})
            Intelligence: ${attributes.intelligence}  +(${breed.getIntelligence()}) +(${AttributesModifier.calculateAttributeModifier(attributes.intelligence)})
            Wisdom: ${attributes.wisdom}  +(${breed.getWisdom()}) +(${AttributesModifier.calculateAttributeModifier(attributes.wisdom)})
            Charisma: ${attributes.charisma}  +(${breed.getCharisma()}) +(${AttributesModifier.calculateAttributeModifier(attributes.charisma)})
        """.trimIndent()
    }
}