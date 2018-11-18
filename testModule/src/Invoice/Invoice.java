package Invoice;
public class Invoice {

        private double totalPrice;
        public Order[] positions;
        public InvoiceData invData;
        public PersonalData pData;


    public Invoice(Order[] positions, InvoiceData invData, PersonalData pData) {
        this.positions = positions;
        this.invData = invData;
        this.pData = pData;
    }

    public double gettoTalPrice(){
            int x = 0;
            while(x < positions.length){
                totalPrice = totalPrice + positions[x].getPrice_b();
                x = x + 1;
            }
            return totalPrice;
        }

}
