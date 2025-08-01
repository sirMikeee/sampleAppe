package banking;


public class bankingApp {
    
    int accNo = 100012;
    float initialBalance = 0;
    int pin = 1234;
    
        public boolean verifyAcc(int acc, int pn){ 
            if(acc == accNo && pn == pin){
                return true;
            }else{
                return false;
            }
        }
    
    
    
}
