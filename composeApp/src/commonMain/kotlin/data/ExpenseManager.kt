package data

import model.Expense
import model.ExpenseCategory

object ExpenseManager {

    private var currentId = 1L

    val fakeExpenseList = mutableListOf(

        Expense(
            id = currentId++,
            amount = 70.0,
            category = ExpenseCategory.GROCERIES,
            description = "Weekly buy"
        )

    )

    fun  addNewExpense(expense: Expense){
        fakeExpenseList.add(expense.copy(id= currentId++)
        )
    }

    fun editExpense(expense: Expense){
        val  index = fakeExpenseList.indexOfFirst {
            it.id  == expense.id
        }
        if (index != -1) {
            fakeExpenseList[index] = fakeExpenseList[index].copy(
                amount = expense.amount,
                category = expense.category,
                description = expense.description
            )
        }
    }

    fun getCategories(): List<ExpenseCategory> {
        return listOf(
            ExpenseCategory.PARTY,
            ExpenseCategory.SNACKS,
            ExpenseCategory.COFEE,
            ExpenseCategory.CAR,
            ExpenseCategory.HOUSE,
            ExpenseCategory.OTHER
        )
    }

    fun deleteExpense(expense: Expense){
        val  index = fakeExpenseList.indexOfFirst {
            it.id  == expense.id
        }
        fakeExpenseList.removeAt(index)
    }

}