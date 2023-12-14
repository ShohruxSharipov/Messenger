package com.example.whatsup.model

data class User(
    val username: String?,
    val password: String?,
    val uid: String? = "${username}_123"
) {
    constructor() : this(null, null, null)
}
