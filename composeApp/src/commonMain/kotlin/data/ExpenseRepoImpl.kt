package data

import domain.ExpenseRepository
import model.Expense
import model.ExpenseCategory


//inyeccion de dependendencia manual al declarar en la clase el parametro
class ExpenseRepoImpl(private val expenseManager: ExpenseManager) : ExpenseRepository {
    override fun getAllExpense(): List<Expense> {
        return expenseManager.fakeExpenseList
    }

    override fun addExpense(expense: Expense) {
        expenseManager.addNewExpense(expense)
    }

    override fun editExpense(expense: Expense) {
        expenseManager.editExpense(expense)
    }

    override fun getCategories(): List<ExpenseCategory> {
        return expenseManager.getCategories()
    }

    override fun deleteExpense(expense: Expense): List<Expense> {
        TODO("Not yet implemented")
    }

}