package data

import domain.ExpenseRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.put
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType
import model.Expense
import model.ExpenseCategory
import model.NetworkExpense

private const val BASE_URL = "http://192.168.1.12:8080"

//inyeccion de dependendencia manual al declarar en la clase el parametro
class ExpenseRepoImpl(
            private val httpClient: HttpClient
) : ExpenseRepository {
    suspend override fun getAllExpense(): List<Expense> {

        val networkResponse = httpClient.get("$BASE_URL/expenses").body<List<NetworkExpense>>()
        return  networkResponse.map { networkExpense ->

                    Expense(
                   id = networkExpense.id,
                   amount = networkExpense.amount,
                   category = ExpenseCategory.valueOf(networkExpense.categoryName),
                   description = networkExpense.description
               )
        }
    }

    suspend override fun addExpense(expense: Expense) {

        httpClient.post("$BASE_URL/expenses"){
            contentType(ContentType.Application.Json)
            setBody(NetworkExpense(
                amount = expense.amount,
                categoryName = expense.category.name,
                description = expense.description
            ))

        }
    }

    suspend override fun editExpense(expense: Expense) {
        httpClient.put("$BASE_URL/expenses/${expense.id}") {
            contentType(ContentType.Application.Json)
            setBody(
                NetworkExpense(
                    id = expense.id,
                    amount = expense.amount,
                    categoryName = expense.category.name,
                    description = expense.description
                )
            )
        }
    }

    override fun getCategories(): List<ExpenseCategory> {
        return ExpenseCategory.values().toList()
    }

    suspend override fun deleteExpense(expense: Expense): List<Expense> {
        TODO("Not yet implemented")
    }

}