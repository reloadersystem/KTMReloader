package model

import kotlinx.serialization.Serializable


@Serializable
data class NetworkExpense(
    val id: Long = -1,
    val amount:Double,
    val categoryName: String,
    val description: String
)