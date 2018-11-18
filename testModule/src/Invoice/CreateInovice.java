package Invoice;

public class CreateInovice {
    public static void main(String[] args) {
        Invoice i = new Invoice(new Order[3],new InvoiceData(), new PersonalData("adbc","Mazowiecka 34", "RG245367", "1234789999"));
        i.positions[0] = new Order("apples", 3, 4.35);
        i.positions[1] = new Order("water", 20, 1.85);
        i.positions[2] = new Order("chocolate", 4, 2.05);

        System.out.println("Invoice Positions:");
        for(Order x: i.positions) {
            x.getOrder_price();
            x.getTax();
            x.getPrice_b();
            System.out.println(x);
        }
        System.out.println("total price:" + i.gettoTalPrice());
        System.out.println(i.pData);
        i.invData.getInvoice_date();
        i.invData.getPay_date();
        i.invData.getSell_date();
        i.invData.generate_invoice_nr();
        System.out.println(i.invData);

    }
}
