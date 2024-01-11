package knowledge1.learnkotlinspringboot.model

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.Table.Dual.autoIncrement
import org.jetbrains.exposed.sql.Table.Dual.integer

object Users : Table() {
    val id: Column<Int> = integer("id").autoIncrement()
    val firstName: Column<String> = varchar("firstname", 50)
    val lastName: Column<String> = varchar("lastname", 50)
    val username: Column<String> = varchar("username", 50).uniqueIndex()
    val email: Column<String> = varchar("email", 100).uniqueIndex()
    val password: Column<String> = varchar("password", 100)
}
