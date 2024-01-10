package knowledge1.learnkotlinspringboot.dto

import knowledge1.learnkotlinspringboot.model.Users
import knowledge1.learnkotlinspringboot.model.Users.uniqueIndex
import kotlinx.serialization.Serializable
import org.jetbrains.exposed.sql.Column

@Serializable
data class User(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val username: String,
    val email: String,
    val password: String
)

