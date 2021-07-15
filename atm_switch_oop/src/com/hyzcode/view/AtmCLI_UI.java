package atm_switch_oop.src.com.hyzcode.view;

public class AtmCLI_UI {
    private boolean isUiReady;

    public AtmCLI_UI(boolean isReady) {
        isUiReady = isReady;
    }

    public void executeUI() {
        if (isUiReady) {
            String atmString = "ATM Operations Menu; \n" + "1. Operation: View your balance \n"
                    + "2. Operation: Withdraw money \n" + "3. Operation: Add balance \n" + "Press Q to exit.";

            System.out.println("****************************");
            System.out.println(atmString);
            System.out.println("****************************");
        } else {
            System.out.println("UI IS NOT READY !");
        }
    }

    public boolean getIsUIReady(){
        return isUiReady;
    }

    public void switchUI(){
        this.isUiReady = !this.isUiReady;
    }
}
