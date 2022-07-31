package secao_14_heranca.application;

import secao_14_heranca.entities.Account;
import secao_14_heranca.entities.BusinessAccount;
import secao_14_heranca.entities.SavingsAccount;

public class TestaAccount {			//Classe Exemplo de Upcasting e Downcasting

	public static void main(String[] args) {
		Account acc = new Account(1001,"Alex", 0.0);
		BusinessAccount bAcc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING (Converter um objeto da subclasse para a super classe)
		
		Account acc1 = bAcc;					//Uma BusinessAccount � uma Account, logo � possivel
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);	//SavingsAccount tb � uma Account, logo isto tb � poss�vel
		
		//DOWNCASTING (Converter um objeto da superclasse para a subclasse)
		
		//BusinessAccount bAcc1 = acc2; 	Isto n�o � poss�vel pois n�o se pode converter naturalmente um objeto da Superclasse p/ Subclasse
		//E por mais que o objeto "acc2" tenha sido criado como BusinessAccount, ele � um objeto Account 
		//Mas podemos for�ar essa conver��o usando (Nome_Subclasse) antes do objeto
		BusinessAccount bAcc1 = (BusinessAccount)acc2;			
		bAcc1.loan(100.0);
		//acc2.loan(100.0);			Isto n�o � possivel pois acc2 n�o � do tipo BusinessAccount	
		
		//BusinessAccount bAcc2 = (BusinessAccount)acc3;	N�o � possivel pois acc3 � um SavingsAccount
		
		if (acc3 instanceof BusinessAccount) {			//Se o acc3 for uma instancia de BusinessAccount
			BusinessAccount bAcc2 = (BusinessAccount)acc3;
			bAcc2.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {			//Se o acc3 for uma instancia de SavingAccount
			SavingsAccount sAcc = (SavingsAccount)acc3;
			sAcc.updateBalance();
			System.out.println("Update!");
		}
	}

}
