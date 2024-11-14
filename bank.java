package withdraw;

public class bank {
	private double amount;

    // Constructor to initialize the amount with 10000
    public bank(double amount) {
        this.amount = amount;
    }

    // Method to withdraw amount
    public void withdraw(double withdrawalAmount) {
        String message = (amount >= withdrawalAmount) ? "Withdraw successful" : "Insufficient funds";
        System.out.println(message);
        if (amount >= withdrawalAmount) {
            amount -= withdrawalAmount;  // Update balance
        }
    }

    // Method to deposit amount
    public void deposit(double depositAmount) {
        amount += depositAmount;  // Update balance
        System.out.println("Deposit successful");
    }

    // Method to display the total balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }
      public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create Bank object with initial amount 10000
        bank account = new bank(10000);

        // Withdraw 3000 from the account
        account.withdraw(7000);

        // Deposit 5000 to the account
        account.deposit(6000);

        // Display total balance
        account.displayBalance();
    }


	}


