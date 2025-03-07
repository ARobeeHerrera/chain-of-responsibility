package Chain;

import Classes.HazardousWaste;
import Classes.OrganicWaste;
import Classes.RecyclableWaste;
import Classes.WasteContainer;
import Interface.WasteCollectionInterface;

public class WasteCollectorChain implements WasteCollectionInterface {
    private WasteCollectionInterface nextCollectorChain;

    public WasteCollectorChain() {
        this.nextCollectorChain = new OrganicWaste();
        WasteCollectionInterface recyclable = new RecyclableWaste();
        WasteCollectionInterface hazardous = new HazardousWaste();

        nextCollectorChain.setNextWasteCollection(recyclable);
        recyclable.setNextWasteCollection(hazardous);
    }

    @Override
    public void setNextWasteCollection(WasteCollectionInterface nextWasteCollection) {
        this.nextCollectorChain.setNextWasteCollection(nextWasteCollection);
    }

    @Override
    public void wasteHandler(WasteContainer wasteContainer) {
        if(wasteContainer.getContainerFull()) {
            System.out.println("Waste Container is full need to dispose waste");
            nextCollectorChain.wasteHandler(wasteContainer);
        }else {
            System.out.println((wasteContainer.getWasteAmount() != 0 ) ? "Waste container is not full yet" : "Waste Container is empty");
        }
    }
}
