package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class BankingApplicationTest extends AnyFunSuite {

  test("createAccount should add a new account with the given opening balance") {
    val bankingApplication = new BankingApplication
    val accounts = bankingApplication.createAccount(100.0)
    assert(accounts.size == 1)
    assert(accounts.values.head == 100.0)
  }

  test("listAccounts should return all existing accounts") {
    val bankingApplication = new BankingApplication
    val openingBalanceOne = 100.0
    val openingBalanceTwo = 200.0
    bankingApplication.createAccount(openingBalanceOne)
    bankingApplication.createAccount(openingBalanceTwo)
    val accounts = bankingApplication.listAccounts()
    assert(accounts.size == 2)
    assert(accounts.values.toList == List(openingBalanceOne, openingBalanceTwo))
  }

  test("fetchAccountBalance should return the balance of the specified account") {
    val bankingApplication = new BankingApplication
    val openingBalance = 100.0
    val accountNumber = bankingApplication.createAccount(openingBalance).keys.head
    val balance = bankingApplication.fetchAccountBalance(accountNumber)
    assert(balance == openingBalance)
  }

  test("updateBalance should update the balance of the specified account according to the given transactions") {
    val bankingApplication = new BankingApplication
    val openingBalance = 100.0
    val accountNumber = bankingApplication.createAccount(openingBalance).keys.head
    val transactions = List(
      Transaction(accountNumber, "credit", 50.0),
      Transaction(accountNumber, "debit", 25.0)
    )
    bankingApplication.updateBalance(transactions)
    val balance = bankingApplication.fetchAccountBalance(accountNumber)
    assert(balance == 125.0)
  }

  test("deleteAccount should remove the specified account if it exists") {
    val bankingApplication = new BankingApplication
    val openingBalance = 100.0
    val accountNumber = bankingApplication.createAccount(openingBalance).keys.head
    val result = bankingApplication.deleteAccount(accountNumber)
    assert(result)
    assert(bankingApplication.listAccounts().isEmpty)
  }

  test("deleteAccount should return false if the specified account does not exist") {
    val bankingApplication = new BankingApplication
    val accountNumber = 1234567890L
    val result = bankingApplication.deleteAccount(accountNumber)
    assert(!result)
  }
}
