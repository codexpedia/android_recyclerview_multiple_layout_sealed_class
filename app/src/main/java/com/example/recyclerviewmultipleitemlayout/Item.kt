package com.example.recyclerviewmultipleitemlayout

sealed class Item()
class ItemOne(var name: String = "") : Item()
class ItemTwo(var name: String = "") : Item()