package Interface;

import Classes.WasteContainer;

public interface WasteCollectionInterface {
    void setNextWasteCollection(WasteCollectionInterface nextWasteCollection);
    void wasteHandler(WasteContainer wasteCollector);
}

