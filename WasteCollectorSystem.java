import Chain.WasteCollectorChain;
import Classes.*;

public class WasteCollectorSystem {
    public static void main(String[] args) {
        WasteCollectorChain chain = new WasteCollectorChain();

        WasteContainer organicWaste = new WasteContainer("Organic", 100);
        WasteContainer hazardousWaste = new WasteContainer("Hazardous",100);
        WasteContainer recycleWaste = new WasteContainer("Non-Recyclable", 100);


        chain.wasteHandler(organicWaste);
        chain.wasteHandler(hazardousWaste);
        chain.wasteHandler(recycleWaste);


        recycleWaste = new WasteContainer("Recyclable", 100);
        chain.wasteHandler(recycleWaste);

        hazardousWaste = new WasteContainer("Biodegradable", 100);
        chain.wasteHandler(hazardousWaste);
    }
}
