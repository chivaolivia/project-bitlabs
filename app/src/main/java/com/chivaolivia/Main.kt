package com.chivaolivia

import com.chivaolivia.entity.MagicWeapon
import com.chivaolivia.entity.Weapon
import java.util.*

var scanner = Scanner(System. `in`)

var listWeapon = mutableListOf<Weapon>()
var listMagicWeapon = mutableListOf<MagicWeapon>()

fun main() {
    initWeapon()
      do {
       initMenu()
        val menu = scanner.nextInt()
        scanner.nextLine()
          when(menu){
              1 ->  createMenu()
              2 ->  viewMenu()
              3 -> updateMenu()
          }
    } while (menu != 5)
}
fun initMenu(){
    println("Welcome to Dungeon Store Admin Panel")
    println("====================================")
    println("1. Create Item")
    println("2. View Item")
    println("3. Update Item")
    println("4. Delete Item")
    println("5. Exit")
    println("Choose Menu: ")
}
fun createMenu(){
 do{
     println("1. Weapon")
     println("2. Magic Weapon")
     println("Choose :")
     val choose  = scanner.nextInt()
     scanner.nextLine()
     when(choose){
         1 -> {
         val weapon =  Weapon()
         print("Weapon's Name: ")
         weapon.name = scanner.nextLine()
         print("Weapon's Damage: ")
         weapon.damage = scanner.nextInt()
         scanner.nextLine()
         listWeapon.add(weapon)
         println()

     }
         2 -> {
             val magicWeapon =  MagicWeapon()
             print("Weapon's Name: ")
             magicWeapon.name = scanner.nextLine()
             print("Weapon's Damage: ")
             magicWeapon.damage = scanner.nextInt()
             scanner.nextLine()
             print("Weapon's Magic Damage: ")
             magicWeapon.magicDamage = scanner.nextInt()
             scanner.nextLine()
             listMagicWeapon.add(magicWeapon)
             println()
         }else ->{
         println("Choose 1 or 2")
     }
     }
      }while (choose > 2)
    }
fun viewMenu(){
    do{
        println("1. Weapon")
        println("2. Magic Weapon")
        print("Choose :")
        val choose  = scanner.nextInt()
        scanner.nextLine()
        when(choose){
            1 -> {
                println("Weapon")
                println("=====================================")
                listWeapon.forEachIndexed { index, element ->
                    println("${index + 1}. ${element.name} ${element.damage}")

                }
            }
            2 -> {
                println("Magic Weapon")
                println("====================================================")
                listMagicWeapon.forEachIndexed { index, element ->
                    println("${index + 1}.    ${element.name}       ${element.damage}      ${element.magicDamage}")
                }

            }
        }
    }while (choose > 2)

}
fun updateMenu(){
    do{
        println("1. Weapon")
        println("2. Magic Weapon")
        print("Choose: ")
        val choose = scanner.nextInt()
        scanner.nextLine()
        when(choose){
            1 -> {
                listWeapon.forEachIndexed { index, element ->
                    println("${index + 1}. ${element.name} ${element.damage}")
                }
                do { print("Choose Weapon: ")
                    val chooseWeapon = scanner.nextInt()
                    scanner.nextLine()
                    val weapon = listWeapon[chooseWeapon-1]
                    print("Weapon's Name: ")
                    weapon.name = scanner.nextLine()
                    print("Weapon's Damage: ")
                    weapon.damage = scanner.nextInt()
                    scanner.nextLine()
                    println()
                } while (chooseWeapon > listWeapon.size) }
            2 -> {
                listMagicWeapon.forEachIndexed { index, element ->
                    println("${index + 1}.    ${element.name}       ${element.damage}      ${element.magicDamage}")
                }
                do {
                    print("Choose Magic Weapon: ")
                    val chooseMagicWeapon = scanner.nextInt()
                    scanner.nextLine()
                    val magicWeapon = listMagicWeapon[chooseMagicWeapon-1]
                    print("Weapon's Name: ")
                    magicWeapon.name = scanner.nextLine()
                    print("Weapon's Damage: ")
                    magicWeapon.damage = scanner.nextInt()
                    scanner.nextLine()
                    print("Weapon's Magic Damage: ")
                    magicWeapon.magicDamage = scanner.nextInt()
                    scanner.nextLine()
                    println()

                }while (chooseMagicWeapon > listMagicWeapon.size)
            }
        }
    }while (choose > 2)
}
fun deleteMenu(){
    do{
        println("1. Weapon")
        println("2. Magic Weapon")
        print("Choose: ")
        val choose = scanner.nextInt()
        scanner.nextLine()
        when(choose){
            1 -> {
                    listWeapon.forEachIndexed { index, element ->
                    println("${index + 1}. ${element.name} ${element.damage}")
                        val chooseDelete = scanner.nextInt()
                        scanner.nextLine()
                        listWeapon.removeAt(chooseDelete-1)
                }
            }
            2 -> {
                   listMagicWeapon.forEachIndexed { index, element ->
                    println("${index + 1}.    ${element.name}       ${element.damage}      ${element.magicDamage}")
                       val chooseDelete = scanner.nextInt()
                       scanner.nextLine()
                       listMagicWeapon.removeAt(chooseDelete-1)
                }

            }
        }
    }while(choose > 2)
}
fun initWeapon(){
    val weapon = Weapon()
    weapon.name = "Long Sword"
    weapon.damage = 70
    listWeapon.add(weapon)

    val magicWeapon = MagicWeapon()
    magicWeapon.name = "Fire Sword"
    magicWeapon.damage =  85
    magicWeapon.magicDamage = 75
    listMagicWeapon.add(magicWeapon)
}