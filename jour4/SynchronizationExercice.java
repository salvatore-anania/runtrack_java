package jour4;


public class SynchronizationExercice extends Thread{

    class Bank {
        private int balance;
    
        public Bank(int initialBalance) {
            this.balance = initialBalance;
        }
    
        public synchronized void withdraw(int amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " a retiré " + amount + " dollars. Solde restant : " + balance + " dollars.");
        }
    }
    public static void main(String[] args) {
        Bank bank = new SynchronizationExercice().new Bank(Integer.parseInt(args[0]));

        Runnable withdrawTask = () -> {
            bank.withdraw(Integer.parseInt(args[1]));
        };

        Thread thread1 = new Thread(withdrawTask, "Client 1");
        Thread thread2 = new Thread(withdrawTask, "Client 2");

        thread1.start();
        thread2.start();
    }
}
