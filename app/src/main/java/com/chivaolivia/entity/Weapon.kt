package com.chivaolivia.entity

open class Weapon {
    var damage : Int = 0
    lateinit var  name : String
}
class MagicWeapon: Weapon(){
    var magicDamage : Int = 0

}