/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author DAT
 */
public class Account {
    private int ID;
    private int AccountNumber;
    private int Balance;
    private String UserName;
    private String PassWord;
    private long CreateDate;
    private int Status;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public long getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(long CreateDate) {
        this.CreateDate = CreateDate;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public Account(int AccountNumber, int Balance, String UserName, String PassWord, long CreateDate, int Status) {
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
        this.UserName = UserName;
        this.PassWord = PassWord;
        this.CreateDate = CreateDate;
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "Account{" + "AccountNumber=" + AccountNumber + ", Balance=" + Balance + ", UserName=" + UserName + ", PassWord=" + PassWord + ", CreateDate=" + CreateDate + ", Status=" + Status + '}';
    }

}

