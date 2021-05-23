package com.hackerkernel.kotlinquizapplication.model

data class Post(val id: Int, val title: String, )

/*Data classes make it easy to create classes that are used to store values.
* Such classes are automatically provided with methods for copying, getting a string representation,
 and using instances in collections.
 You can override these methods with your own implementations in the class declaration.

* Defines a data class with the data modifier.
* Method toString is auto-generated, which makes println output look nice.
*/