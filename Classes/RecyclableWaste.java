package Classes;

import Interface.WasteCollectionInterface;

public class RecyclableWaste implements WasteCollectionInterface {
    private WasteCollectionInterface wasteCollection;

    @Override
    public void setNextWasteCollection(WasteCollectionInterface nextWasteCollection) {
        this.wasteCollection = nextWasteCollection;
    }

    @Override
    public void wasteHandler(WasteContainer wasteContainer) {
        if(wasteContainer.getWasteType().toLowerCase().equals("recyclable") && wasteContainer.getContainerFull()) {
            System.out.println("Collecting and Disposing " + wasteContainer.getWasteType().toUpperCase() + " wastes.");
            wasteContainer.setWasteCapacityToEmpty();
        } else if (wasteCollection != null) {
            wasteCollection.wasteHandler(wasteContainer);
        } else {
            System.out.println("No waste container for " + wasteContainer.getWasteType().toUpperCase() + " waste\n");
        }
    }
}
