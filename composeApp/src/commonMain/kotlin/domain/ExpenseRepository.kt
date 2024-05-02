package domain

import model.Expense
import model.ExpenseCategory

interface ExpenseRepository {

    fun getAllExpense():List<Expense>

    fun addExpense(expense: Expense)

    fun editExpense(expense: Expense)

    fun getCategories(): List<ExpenseCategory>
}