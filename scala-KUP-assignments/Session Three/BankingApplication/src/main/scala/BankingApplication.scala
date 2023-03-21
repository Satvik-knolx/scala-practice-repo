package com.knoldus

import scala.collection.mutable
import scala.util.Random

case class Transaction(accountNumber: Long, transactionType: String, amount: Double)

class BankingApplication {
  // A mutable map to store account numbers and balances
  val accounts: mutable.Map[Long, Double] = mutable.Map()

  // Method to create a new account with a given opening balance
  def createAccount(openingBalance: Double): mutable.Map[Long, Double] = {
    // Generate a random account number
    val Random = new Random
    val accountNumber = Random.nextLong(100000L)
    // Set the account balance to the opening balance
    val accountBalance = openingBalance
    // Add the new account to the accounts map
    accounts.addOne(accountNumber, accountBalance)
    // Return the updated accounts map
    accounts
  }

  // Method to list all existing accounts
  def listAccounts(): mutable.Map[Long, Double] = {
    accounts
  }

  // Method to fetch the balance of a specific account
  def fetchAccountBalance(accountNumber: Long): Double = {
    val balance = accounts(accountNumber)
    balance
  }

  // Method to update the balance of a specific account based on a list of transactions
  def updateBalance(transactions: List[Transaction]): mutable.Map[Long, Double] = {
    // Map over the list of transactions
    transactions.map { transaction =>
      val accountNumber = transaction.accountNumber
      val amount = transaction.amount
      val balance = accounts(accountNumber)

      // Update the account balance based on the transaction type
      transaction.transactionType match {
        case "credit" => accounts += (accountNumber -> (amount + balance))
        case "debit" => accounts += accountNumber -> (balance - amount)
        case _ => accounts
      }
    }
    // Return the updated accounts map
    accounts
  }

  // Method to delete a specific account
  def deleteAccount(accountNumber: Long): Boolean = {
    // Check if the account exists in the accounts map
    if (accounts.contains(accountNumber)) {
      // Remove the account from the accounts map
      accounts -= accountNumber
      true
    } else {
      false
    }
  }
}
