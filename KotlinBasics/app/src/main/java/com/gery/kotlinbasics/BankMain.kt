package com.gery.kotlinbasics

fun main() {

    val denisesBankAccount = BankAccount("Denis Putra", 1338.20)

    denisesBankAccount.deposit(200.00)
    denisesBankAccount.withdraw(1200.00)
    denisesBankAccount.deposit(3000.00)
    denisesBankAccount.deposit(2000.00)
    denisesBankAccount.withdraw(3333.15)

    denisesBankAccount.displayTransactionHistory()
}