package knowledge1.learnkotlinspringboot.service

import knowledge1.learnkotlinspringboot.dto.User
import knowledge1.learnkotlinspringboot.model.Users
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserService {

    val userDtos = transaction {
        Users.selectAll().map { mapToUserDto(it) }
    }

    fun mapToUserDto(it: ResultRow) = User(
        id = it[Users.id],
        firstName = it[Users.firstName],
        lastName = it[Users.lastName],
        password = it[Users.password],
        username = it[Users.username],
        email = it[Users.email]
    )
}