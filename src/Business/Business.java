/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Bank.BankAccountingPeopleDirectory;
import Bank.BankAdmin;
import Bank.BankDirectory;
import Bank.BankTransactionRecordDirectory;
import Bank.CustomerDirectory;
import Bank.MasterBankAccountDirectory;
import Bank.SupplierAccount;
import Bitcoin.BitcoinAccountingPeopleDirectory;
import Bitcoin.BitcoinAdmin;
import Bitcoin.BitcoinCatalog;
import Bitcoin.CustodianDirectory;
import Bitcoin.ExchangerDirectory;
import Bitcoin.FeeTransactionDirectory;
import Bitcoin.InvestorDirectory;
import Bitcoin.MatchPairDirectory;
import Bitcoin.TransactionDirectory;
import Government.BankSupervisor;
import Government.GovernmentAccountingPeople;
import Government.GovernmentAdmin;
import Government.SupplierSupervisor;
import Government.TaxTransactionDirectory;
import Government.TransactionFeeDirectory;
import Supplier.SupplierAdmin;
import WorkRequest.BankAccountingPeopleWorkQueue;
import WorkRequest.BitcoinAccountingPeopleWorkQueue;
import WorkRequest.CustodianWorkQueue;
import WorkRequest.ExchangerWorkQueue;
import WorkRequest.GovernmentAccountingPeopleWorkQueue;
import WorkRequest.SupplierWorkQueue;


/**
 *
 * @author owner
 */
public class Business {
    
    public static Business business;
    
    private BankDirectory bankDirectory;
    private BankTransactionRecordDirectory bankTransactionRecordDirectory;
    private CustomerDirectory customerDirectory;
    private BankAccountingPeopleDirectory bankAccountingPeopleDirectory;
    private MasterBankAccountDirectory bankAccountDirectory;
    private SupplierAccount supplierAccount;
    private BankAdmin bankAdmin;
    
    private BitcoinAccountingPeopleDirectory bitcoinAccountingPeopleDirectory;
    private BitcoinCatalog bitcoinCatalog;
    private CustodianDirectory custodianDirectory;
    private ExchangerDirectory exchangerDirectory;
    private FeeTransactionDirectory feeTransactionDirectory;
    private InvestorDirectory investorDirectory;
    private MatchPairDirectory matchPairDirectory;
    private TransactionDirectory transactionDirectory;
    private BitcoinAdmin bitcoinAdmin;
    
    private BankSupervisor bankSupervisor;
    private SupplierSupervisor supplierSupervisor;
    private GovernmentAccountingPeople governmentAccountingPeople;
    private TaxTransactionDirectory taxTransactionDirectory;
    private TransactionFeeDirectory transactionFeeDirectory;
    private GovernmentAdmin governmentAdmin;
    
    private SupplierAdmin supplierAdmin;
    
    private BankAccountingPeopleWorkQueue bankAccountingPeopleWorkQueue;
    private BitcoinAccountingPeopleWorkQueue bitcoinAccountingPeopleWorkQueue;
    private CustodianWorkQueue custodianWorkQueue;
    private ExchangerWorkQueue exchangerWorkQueue;
    private GovernmentAccountingPeopleWorkQueue governmentAccountingPeopleWorkQueue;
    private SupplierWorkQueue supplierWorkQueue;
//    private SupplyerBitcoinCreation bitcoinCreation;
    private Business () {
        bankDirectory =  new BankDirectory();
        bankTransactionRecordDirectory = new BankTransactionRecordDirectory();
        customerDirectory =  new CustomerDirectory();
        bankAccountDirectory = new MasterBankAccountDirectory();
        supplierAccount = new SupplierAccount();
        bankAdmin = new BankAdmin();
        bankAccountingPeopleDirectory =  new BankAccountingPeopleDirectory();
        
        bitcoinAccountingPeopleDirectory = new BitcoinAccountingPeopleDirectory();
        bitcoinCatalog = new BitcoinCatalog();
        custodianDirectory = new CustodianDirectory();
        exchangerDirectory = new ExchangerDirectory();
        feeTransactionDirectory = new FeeTransactionDirectory();
        investorDirectory = new InvestorDirectory();
        matchPairDirectory = new MatchPairDirectory();
        transactionDirectory = new TransactionDirectory();
        bitcoinAdmin = new BitcoinAdmin();
        
        bankSupervisor = new BankSupervisor();
        supplierSupervisor = new SupplierSupervisor();
        governmentAccountingPeople = new GovernmentAccountingPeople();
        taxTransactionDirectory = new TaxTransactionDirectory();
        transactionFeeDirectory = new TransactionFeeDirectory();
        governmentAdmin = new GovernmentAdmin();
        
        supplierAdmin = new SupplierAdmin();
        
        bankAccountingPeopleWorkQueue = new BankAccountingPeopleWorkQueue();
        bitcoinAccountingPeopleWorkQueue = new BitcoinAccountingPeopleWorkQueue();
        custodianWorkQueue = new CustodianWorkQueue();
        exchangerWorkQueue = new ExchangerWorkQueue();
        governmentAccountingPeopleWorkQueue = new GovernmentAccountingPeopleWorkQueue();
        supplierWorkQueue = new SupplierWorkQueue();
//        bitcoinCreation = new SupplyerBitcoinCreation(10);
    }
    public static Business getInstance(){
        if(business == null){
            business = new Business();
        }
        return business;
    }
    
    public BankAdmin getBankAdmin() {
        return bankAdmin;
    }

    public BankAccountingPeopleDirectory getBankAccountingPeopleDirectory() {
        return bankAccountingPeopleDirectory;
    }

    public BitcoinAdmin getBitcoinAdmin() {
        return bitcoinAdmin;
    }

//    public static Business getBusiness() {
//        return business;
//    }
    public GovernmentAdmin getGovernmentAdmin() {
        return governmentAdmin;
    }

    public GovernmentAccountingPeople getGovernmentAccountingPeople() {
        return governmentAccountingPeople;
    }

    public BankDirectory getBankDirectory() {
        return bankDirectory;
    }

    public BankTransactionRecordDirectory getBankTransactionRecordDirectory() {
        return bankTransactionRecordDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public MasterBankAccountDirectory getBankAccountDirectory() {
        return bankAccountDirectory;
    }

    public SupplierAccount getSupplierAccount() {
        return supplierAccount;
    }

    public BitcoinAccountingPeopleDirectory getBitcoinAccountingPeopleDirectory() {
        return bitcoinAccountingPeopleDirectory;
    }

    public BitcoinCatalog getBitcoinCatalog() {
        return bitcoinCatalog;
    }

    public CustodianDirectory getCustodianDirectory() {
        return custodianDirectory;
    }

    public ExchangerDirectory getExchangerDirectory() {
        return exchangerDirectory;
    }

    public FeeTransactionDirectory getFeeTransactionDirectory() {
        return feeTransactionDirectory;
    }

    public InvestorDirectory getInvestorDirectory() {
        return investorDirectory;
    }

    public MatchPairDirectory getMatchPairDirectory() {
        return matchPairDirectory;
    }

    public TransactionDirectory getTransactionDirectory() {
        return transactionDirectory;
    }

    public BankSupervisor getBankSupervisor() {
        return bankSupervisor;
    }

    public SupplierSupervisor getSupplierSupervisor() {
        return supplierSupervisor;
    }

    public TaxTransactionDirectory getTaxTransactionDirectory() {
        return taxTransactionDirectory;
    }

    public TransactionFeeDirectory getTransactionFeeDirectory() {
        return transactionFeeDirectory;
    }

    public SupplierAdmin getSupplierAdmin() {
        return supplierAdmin;
    }

    public BankAccountingPeopleWorkQueue getBankAccountingPeopleWorkQueue() {
        return bankAccountingPeopleWorkQueue;
    }

    public BitcoinAccountingPeopleWorkQueue getBitcoinAccountingPeopleWorkQueue() {
        return bitcoinAccountingPeopleWorkQueue;
    }

    public CustodianWorkQueue getCustodianWorkQueue() {
        return custodianWorkQueue;
    }

    public ExchangerWorkQueue getExchangerWorkQueue() {
        return exchangerWorkQueue;
    }

    public GovernmentAccountingPeopleWorkQueue getGovernmentAccountingPeopleWorkQueue() {
        return governmentAccountingPeopleWorkQueue;
    }

    public SupplierWorkQueue getSupplierWorkQueue() {
        return supplierWorkQueue;
    }

    
}
