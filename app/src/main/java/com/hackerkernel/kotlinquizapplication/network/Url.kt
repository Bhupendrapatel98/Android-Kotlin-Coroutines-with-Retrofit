package com.hackerkernel.kotlinquizapplication.network

object Url {
    const val url = "https://jsonplaceholder.typicode.com/"
}

/*Object keyword in Kotlin
Kotlin has an object keyword, which combines both declaring a class and creating an instance of it in one action.
It can be used in three different situations :-
1. Object declaration :-  Defines a singleton class.

Ex :- object Singleton {
    fun sayMyName() {
        println("I'm a singleton")
    }
}
call :-> Singleton.sayMyName()

2. Companion object :-  Defines a nested class that can hold members related to the
 outer containing class. These members can't require an instance of the outer class.

 Java has a static keyword that can be applied to class members.

  Kotlin doesn't have a static keyword, but can achieve this kind of functionality
  with some other language features.

  In Kotlin, companion objects can be used to implement this design pattern.

  Ex:- class User private constructor(val userId: String) {

    companion object {
        fun newUserWithEmail() {
            println("I'm a static")
        }
    }

    call :-> val userFromEmail = User.newUserWithEmail()
}

3. Object expression :- Creates an instance of the object on the fly,
 the same as Java's anonymous inner classes.*/
